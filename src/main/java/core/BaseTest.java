package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login?fbclid=IwAR3SQBgvBzdqPHFOtYajZj0Zra2rM2wcT3N5gz1pkRk9sn-c1nywlEArAao";
        driver.get(url);
    }

    @AfterMethod
    public void checkAfterMethod(ITestResult result) {
        //Bắt trạng thái hoặc tên Test case sau khi chạy xong để xử lý gì đó
        if (ITestResult.FAILURE == result.getStatus()) {
            System.out.println(result.getName() + " failed");
        }
        else if(ITestResult.SUCCESS == result.getStatus()){
            System.out.println(result.getName() + " passed");
        }
        else{
            System.out.println(result.getName() + " skipped");
        }
        driver.quit();
    }

}
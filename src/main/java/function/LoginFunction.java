package function;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.LoginPage;

public class LoginFunction extends BasePage {
    CommonFunction commonFunction = new CommonFunction(driver);
    LoginPage loginPage = new LoginPage();

    public LoginFunction(WebDriver driver) {
        super(driver);
    }

    public void loginPage(String userName ,String pass) throws InterruptedException {
        commonFunction.sendkeys(loginPage.userName,userName);
        commonFunction.sendkeys(loginPage.pass,pass);
        commonFunction.click(loginPage.loginBtn);
        Thread.sleep(5000);
    }
    public void doLoginFail(){
    	commonFunction.isDisplayed(loginPage.alertLoginFail);
    }
    public void checkLoginPageItem(){
        commonFunction.isDisplayed(loginPage.userName);
        commonFunction.isDisplayed(loginPage.pass);
        commonFunction.isDisplayed(loginPage.loginBtn);
        commonFunction.isDisplayed(loginPage.forgotpass);
    }
}

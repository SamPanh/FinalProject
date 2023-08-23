package function;

import core.BasePage;
import core.ExcelUtils;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CommonFunction extends BasePage {


	public CommonFunction(WebDriver driver) {
        super(driver);
    }

    public void sendkeys(By locator ,String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(value);
    }

    public void click(By locator ){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public void selectByIndex(By locator , int index){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void switchWindownByIndex(int index){
        ArrayList<String>window = new ArrayList<>();
        driver.switchTo().window(window.get(index));
    }

    public void switchWindowByTitle(String title){
        for(String windownID:driver.getWindowHandles()){
            String getTitle = driver.switchTo().window(windownID).getTitle();
            if(getTitle.equals(title)){
                driver.switchTo().window(windownID);
                break;
            }
        }
    }

    public void verifyTitle(String title){
        Assert.assertEquals(driver.getTitle(),title);
    }
    public void isDisplayed(By locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.isDisplayed();
    }
    public void specialSendkeys(By locator,String value){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).sendKeys(value).perform();
    }
    public void selectItemInCustomDropdown(By locator, By locator2, String expectedText) throws InterruptedException {
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        explicitWait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        Thread.sleep(2000);
        List<WebElement> elementList = explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator2));
        for (WebElement element : elementList) {
            if (expectedText.equalsIgnoreCase(element.getText().trim())) {
                if (element.isDisplayed()) {
                    element.click();
                    break;
                } else {
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                    element.click();
                    break;
                }
            }
        }
    }
    public void printTable(By row,By col){
        List<WebElement>rows=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(row));

        for (WebElement r :rows){
            List<WebElement>cols = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(col));
            for (WebElement c:cols) {
                System.out.println(c.getText()+"\t");
            }
            break;
        }

    }
    public void sendkeysDropdownList(By locator ,By locator2,String value) throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(value);
        Thread.sleep(3000);
        WebElement element1 =wait.until(ExpectedConditions.visibilityOfElementLocated(locator2));
        element1.click();

    }
    public String getText(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();
    }
	public String getToastResult(WebElement forgotpass) {
		wait.until(ExpectedConditions.visibilityOf(forgotpass));
		return forgotpass.getText();
	}

	public void testCompleted(int rolNum, int colNum, boolean isPassed, String message) throws Exception {
		ExcelUtils.setCellData(rolNum, colNum, message);
		if (isPassed) {
			ExcelUtils.fillGreenColour(rolNum, colNum);
		} else {
			ExcelUtils.fillRedColour(rolNum, colNum);
		}
		Assert.assertTrue(isPassed);
	}

}

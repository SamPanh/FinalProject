package function;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import page.MainPage;

public class MainPageFunction extends BasePage {

    public MainPageFunction(WebDriver driver) {
        super(driver);
    }
    CommonFunction commonFunction = new CommonFunction(driver);
    MainPage mainPage = new MainPage();
    public void verifyMainPageItems(){
        commonFunction.isDisplayed(mainPage.searchBox);
        commonFunction.isDisplayed(mainPage.admin);
        commonFunction.isDisplayed(mainPage.PIM);
        commonFunction.isDisplayed(mainPage.leave);
        commonFunction.isDisplayed(mainPage.time);
        commonFunction.isDisplayed(mainPage.recruitment);
        commonFunction.isDisplayed(mainPage.myInfo);
        commonFunction.isDisplayed(mainPage.performance);
        commonFunction.isDisplayed(mainPage.dashBoard);
        commonFunction.isDisplayed(mainPage.directory);
        commonFunction.isDisplayed(mainPage.maintenance);
        commonFunction.isDisplayed(mainPage.claim);
        commonFunction.isDisplayed(mainPage.buzz);
    }
    public void accessPerformancePage(){
        commonFunction.click(mainPage.performance);
    }
}

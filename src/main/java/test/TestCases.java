package test;

import core.BaseTest;
import core.ExcelUtils;
import function.LoginFunction;
import function.MainPageFunction;
import function.PerformacePageFunction;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)	
public class TestCases extends BaseTest {
    @DataProvider()
    public static Object[][] getAccount() {
        String path = "\"C:\\Users\\jinjh\\eclipse-workspace\\FinalProject\\src\\main\\java\\sources\\Login.xlsx\"";
        String sheetName = "Login";
        return ExcelUtils.getTableArray(path, sheetName, 0, 2);
    }
    @Test
    public void tc_01 () throws InterruptedException {
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.checkLoginPageItem();
    }

    @Test(dataProvider = "getAccount")
    public void tc_02 (String username, String password) throws InterruptedException {
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.loginPage(username,password);
        loginFunction.doLoginFail();
    }
    @Test
    public void tc_03() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.verifyMainPageItems();
    }
    @Test
    public void tc_04() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.checkConfigureItemsList();
    }
    @Test
    public void tc_05() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.addKeyPerformanceIndicators("Chaeyo","QA Engineer");
    }
    @Test
    public void tc_06() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.searchKeyPerformanceIndicators("QA Lead");
    }
    @Test
    public void tc_07() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin", "admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.searchPerformnaceTrackers("Anthony Nolan");
    }
    @Test
    public void tc_08() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin", "admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.addPerformanceTracker("Anthony Nolan","Linda Jane Anderson");
        Thread.sleep(2000);
    }
    @Test
    public void tc_09() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin", "admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.checkManageReviewsList();
    }
    @Test
    public void tc_10() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.checkEmployeeReviewsItems();
    }
    @Test
    public void tc_11() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.checkManagePerformanceReviewsItems();
    }
    @Test
    public void tc_12() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.searchEmployeeReviews();
    }
    @Test
    public void tc_13() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.searchManagePerformanceReviews("Charlie  Carter","QA Engineer","Activated","Current Employees Only","Peter Mac Anderson");
    }
    @Test
    public void tc_14() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.addManagePerformanceReviews("Pablo enrique calderon","Chaeyo","2023-03-24","2023-04-23","2023-10-24");
    }
    @Test
    public void tc_15() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.myReviews();
    }
    @Test
    public void tc_16() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.review();
        performacePageFunction.inputRating(100);
        performacePageFunction.inputComments("Good");
        performacePageFunction.inputGeneralComments("Nice");
    }
    @Test
    public void tc_17() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.myTracker();

    }
    @Test
    public void tc_18() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.addTrackerLog("Sana",true,"MiChaeng");
    }
    @Test
    public void tc_19() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.checkEmployeesTracker();
    }
    @Test
    public void tc_20() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.searchCheckEmployeesTracker("Charlie Carter","Current Employees Only");
    }
    @Test
    public void tc_21() throws InterruptedException {
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.addLogEmployeesTracker("Sana",true,"MiChaeng");
    }
}

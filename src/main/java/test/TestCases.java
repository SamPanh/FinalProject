package test;

import org.testng.annotations.Test;
import core.BaseTest;
import core.ExcelUtils;
import function.CommonFunction;
import function.CommonFunction;
import function.LoginFunction;
import function.MainPageFunction;
import function.PerformacePageFunction;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)	
public class TestCases extends BaseTest {
	CommonFunction common;
    @DataProvider()
    public static Object[][] getAccount() throws Exception {
        String path = "\"C:\\Users\\jinjh\\eclipse-workspace\\FinalProject\\src\\main\\java\\sources\\Login.xlsx\"";
        String sheetName = "Login";
        return ExcelUtils.getTableArray(path, sheetName, 0, 2);
    }
    @Test
    public void tc_01 () throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.checkLoginPageItem();
        ExcelUtils.setCellData(2, 2, common.getToastResult(null));
		if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 2))) {
			common.testCompleted(6, 2, true, "PASSED");
		}else {
			common.testCompleted(6, 2, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }

    @Test(dataProvider = "getAccount")
    public void tc_02 (String username, String password) throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.loginPage(username,password);
        ExcelUtils.setCellData(2, 3, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 3))) {
			common.testCompleted(6, 3, true, "PASSED");
		}else {
			common.testCompleted(6, 3, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
        loginFunction.doLoginFail();
    }
    @Test
    public void tc_03() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        ExcelUtils.setCellData(2, 4, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 4))) {
			common.testCompleted(6, 4, true, "PASSED");
		}else {
			common.testCompleted(6, 4, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
        mainPageFunction.verifyMainPageItems();
    }
    @Test
    public void tc_04() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.checkConfigureItemsList();
        ExcelUtils.setCellData(2, 5, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 5))) {
			common.testCompleted(6, 5, true, "PASSED");
		}else {
			common.testCompleted(6, 5, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_05() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.addKeyPerformanceIndicators("Chaeyo","QA Engineer");
        ExcelUtils.setCellData(2, 6, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 6))) {
			common.testCompleted(6, 6, true, "PASSED");
		}else {
			common.testCompleted(6, 6, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_06() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.searchKeyPerformanceIndicators("QA Lead");
        ExcelUtils.setCellData(2, 7, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 7))) {
			common.testCompleted(6, 7, true, "PASSED");
		}else {
			common.testCompleted(6, 7, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_07() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin", "admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.searchPerformnaceTrackers("Anthony Nolan");
        ExcelUtils.setCellData(2, 8, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 8))) {
			common.testCompleted(6, 8, true, "PASSED");
		}else {
			common.testCompleted(6, 8, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_08() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin", "admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.addPerformanceTracker("Anthony Nolan","Linda Jane Anderson");
        Thread.sleep(2000);
        ExcelUtils.setCellData(2, 9, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 9))) {
			common.testCompleted(6, 9, true, "PASSED");
		}else {
			common.testCompleted(6, 9, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_09() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin", "admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.checkManageReviewsList();
        ExcelUtils.setCellData(2, 10, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 10))) {
			common.testCompleted(6, 10, true, "PASSED");
		}else {
			common.testCompleted(6, 10, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_10() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.checkEmployeeReviewsItems();
        ExcelUtils.setCellData(2, 11, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 11))) {
			common.testCompleted(6, 11, true, "PASSED");
		}else {
			common.testCompleted(6, 11, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_11() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.checkManagePerformanceReviewsItems();
        ExcelUtils.setCellData(2, 12, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 12))) {
			common.testCompleted(6, 12, true, "PASSED");
		}else {
			common.testCompleted(6, 12, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_12() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.searchEmployeeReviews();
        ExcelUtils.setCellData(2, 13, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 13))) {
			common.testCompleted(6, 13, true, "PASSED");
		}else {
			common.testCompleted(6, 13, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_13() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.searchManagePerformanceReviews("Charlie  Carter","QA Engineer","Activated","Current Employees Only","Peter Mac Anderson");
        ExcelUtils.setCellData(2, 14, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 14))) {
			common.testCompleted(6, 14, true, "PASSED");
		}else {
			common.testCompleted(6, 14, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_14() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.addManagePerformanceReviews("Pablo enrique calderon","Chaeyo","2023-03-24","2023-04-23","2023-10-24");
        ExcelUtils.setCellData(2, 15, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 15))) {
			common.testCompleted(6, 15, true, "PASSED");
		}else {
			common.testCompleted(6, 15, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_15() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.myReviews();
        ExcelUtils.setCellData(2, 16, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 16))) {
			common.testCompleted(6, 16, true, "PASSED");
		}else {
			common.testCompleted(6, 16, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_16() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.review();
        performacePageFunction.inputRating(100);
        performacePageFunction.inputComments("Good");
        performacePageFunction.inputGeneralComments("Nice");
        ExcelUtils.setCellData(2, 17, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 17))) {
			common.testCompleted(6, 17, true, "PASSED");
		}else {
			common.testCompleted(6, 17, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_17() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.myTracker();
        ExcelUtils.setCellData(2, 18, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 18))) {
			common.testCompleted(6, 18, true, "PASSED");
		}else {
			common.testCompleted(6, 18, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");

    }
    @Test
    public void tc_18() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.addTrackerLog("Sana",true,"MiChaeng");
        ExcelUtils.setCellData(2, 19, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 19))) {
			common.testCompleted(6, 19, true, "PASSED");
		}else {
			common.testCompleted(6, 19, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_19() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.checkEmployeesTracker();
        ExcelUtils.setCellData(2, 20, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 20))) {
			common.testCompleted(6, 20, true, "PASSED");
		}else {
			common.testCompleted(6, 20, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_20() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.searchCheckEmployeesTracker("Charlie Carter","Current Employees Only");
        ExcelUtils.setCellData(2, 21, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 21))) {
			common.testCompleted(6, 21, true, "PASSED");
		}else {
			common.testCompleted(6, 21, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
    @Test
    public void tc_21() throws Exception {
    	ExcelUtils.openFile(".\\src\\main\\java\\sources\\TestData.xlsx", "Test Cases");
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        PerformacePageFunction performacePageFunction = new PerformacePageFunction(driver);
        loginFunction.loginPage("Admin","admin123");
        mainPageFunction.accessPerformancePage();
        performacePageFunction.addLogEmployeesTracker("Sana",true,"MiChaeng");
        ExcelUtils.setCellData(2, 22, common.getToastResult(null));
        if(common.getToastResult(null).equals(ExcelUtils.getCellData(3, 22))) {
			common.testCompleted(6, 22, true, "PASSED");
		}else {
			common.testCompleted(6, 22, false, "FAILED");
		}
		ExcelUtils.saveAndCloseFile(".\\src\\main\\java\\sources\\TestData.xlsx");
    }
}

package function;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.PerformancePage;

import java.util.List;

public class PerformacePageFunction extends BasePage {
    CommonFunction commonFunction = new CommonFunction(driver);

    public PerformacePageFunction(WebDriver driver) {
        super(driver);
    }
    PerformancePage performancePage = new PerformancePage();
    public void checkEmployeeReviewsItems(){
        commonFunction.isDisplayed(performancePage.employeeName);
        commonFunction.isDisplayed(performancePage.jobTitle);
        commonFunction.isDisplayed(performancePage.subUnit);
        commonFunction.isDisplayed(performancePage.include);
        commonFunction.isDisplayed(performancePage.reviewerStatus);
        commonFunction.isDisplayed(performancePage.fromDate);
        commonFunction.isDisplayed(performancePage.toDate);
        commonFunction.isDisplayed(performancePage.resetBtn);
        commonFunction.isDisplayed(performancePage.searchBtn);
    }
    public void checkManagePerformanceReviewsItems() throws InterruptedException {
        commonFunction.click(performancePage.manageReviews);
        Thread.sleep(2000);
        commonFunction.click(performancePage.managerReviews);
        commonFunction.isDisplayed(performancePage.employeeName);
        commonFunction.isDisplayed(performancePage.jobTitle);
        commonFunction.isDisplayed(performancePage.reviewerStatus);
        commonFunction.isDisplayed(performancePage.include);
        commonFunction.isDisplayed(performancePage.inputReviewer);
        commonFunction.isDisplayed(performancePage.fromDate);
        commonFunction.isDisplayed(performancePage.toDate);
        commonFunction.isDisplayed(performancePage.resetBtn);
        commonFunction.isDisplayed(performancePage.searchBtn);
    }
    public void addKeyPerformanceIndicators(String name,String role) throws InterruptedException {
        commonFunction.click(performancePage.configure);
        commonFunction.click(performancePage.kpis);
        commonFunction.click(performancePage.addBtn);
        commonFunction.sendkeys(performancePage.keyPerformanceIndicator,name);
        commonFunction.selectItemInCustomDropdown(performancePage.dropdownBox,performancePage.dropdownList,role);
        commonFunction.click(performancePage.makeDefaultScale);
        commonFunction.click(performancePage.searchBtn);

    }
    public void searchKeyPerformanceIndicators(String role) throws InterruptedException {
        commonFunction.click(performancePage.configure);
        commonFunction.click(performancePage.kpis);
        commonFunction.selectItemInCustomDropdown(performancePage.dropdownBox,performancePage.dropdownList,role);
        commonFunction.click(performancePage.searchBtn);
        commonFunction.printTable(performancePage.row,performancePage.cell);
    }
    public void searchPerformnaceTrackers(String name) throws InterruptedException {
        commonFunction.click(performancePage.configure);
        Thread.sleep(2000);
        commonFunction.click(performancePage.trackers);
        commonFunction.sendkeysDropdownList(performancePage.inputEmployeeName,performancePage.nameDropdownList,name);
        commonFunction.click(performancePage.searchBtn);
        System.out.println(commonFunction.getText(performancePage.numberOfRecord));
        commonFunction.printTable(performancePage.row,performancePage.cell);
    }
    public void addPerformanceTracker(String name,String name1) throws InterruptedException {
        commonFunction.click(performancePage.configure);
        Thread.sleep(2000);
        commonFunction.click(performancePage.trackers);
        commonFunction.click(performancePage.add);
        commonFunction.sendkeys(performancePage.inputTrackerName,"Son Chaeyoung");
        commonFunction.sendkeysDropdownList(performancePage.inputEmployeesName,performancePage.inputResultList,name);
        Thread.sleep(2000);
        commonFunction.sendkeysDropdownList(performancePage.inputReviewers,performancePage.inputResultList,name1);
        commonFunction.click(performancePage.saveBtn);
    }
    public void checkConfigureItemsList() throws InterruptedException {
        commonFunction.click(performancePage.configure);
        Thread.sleep(2000);
        commonFunction.isDisplayed(performancePage.kpis);
        commonFunction.isDisplayed(performancePage.trackers);
    }
    public void checkManageReviewsList() throws InterruptedException {
        commonFunction.click(performancePage.manageReviews);
        Thread.sleep(2000);
        commonFunction.isDisplayed(performancePage.managerReviews);
        commonFunction.isDisplayed(performancePage.myReview);
        commonFunction.isDisplayed(performancePage.employeesReviews);
    }
    public void searchEmployeeReviews() throws InterruptedException {
        commonFunction.sendkeysDropdownList(performancePage.employeeName,performancePage.dropdownList,"Odis Adalwin");
        commonFunction.selectItemInCustomDropdown(performancePage.jobTitle,performancePage.dropdownList,"QA Engineer");
        commonFunction.selectItemInCustomDropdown(performancePage.subUnit,performancePage.dropdownList,"Administration");
        commonFunction.selectItemInCustomDropdown(performancePage.include,performancePage.dropdownList,"Current Employees Only");
        commonFunction.selectItemInCustomDropdown(performancePage.reviewerStatus,performancePage.dropdownList,"Activated");
        commonFunction.click(performancePage.searchBtn);
        Thread.sleep(2000);
        System.out.println(commonFunction.getText(performancePage.numberOfRecord));
    }
    public void searchManagePerformanceReviews(String name,String job,String status,String include ,String reviewer) throws InterruptedException {
        commonFunction.click(performancePage.manageReviews);
        commonFunction.click(performancePage.managerReviews);
        commonFunction.sendkeysDropdownList(performancePage.employeeName,performancePage.dropdownList,name);
        commonFunction.selectItemInCustomDropdown(performancePage.jobTitle,performancePage.dropdownList,job);
        commonFunction.selectItemInCustomDropdown(performancePage.reviewerStatus,performancePage.dropdownList,status);
        commonFunction.selectItemInCustomDropdown(performancePage.include,performancePage.dropdownList,include);
        commonFunction.sendkeysDropdownList(performancePage.inputReviewer,performancePage.dropdownList,reviewer);
        commonFunction.click(performancePage.searchBtn);
        Thread.sleep(2000);
        System.out.println(commonFunction.getText(performancePage.numberOfRecord));
    }
    public void addManagePerformanceReviews(String name,String supervisorReviewer,String periodStarDate,String periodEndDate ,String dueDate) throws InterruptedException {
        commonFunction.click(performancePage.manageReviews);
        commonFunction.click(performancePage.managerReviews);
        commonFunction.click(performancePage.add);
        commonFunction.sendkeysDropdownList(performancePage.employeeName,performancePage.dropdownList,name);
        commonFunction.sendkeys(performancePage.supervisorReviewer,supervisorReviewer);
        commonFunction.sendkeys(performancePage.periodStarDate,periodStarDate);
        commonFunction.sendkeys(performancePage.periodEndDate,periodEndDate);
        commonFunction.sendkeys(performancePage.dueDate,dueDate);
        commonFunction.click(performancePage.saveBtn);
    }
    public void myReviews(){
        commonFunction.click(performancePage.manageReviews);
        commonFunction.click(performancePage.myReview);
        System.out.println(commonFunction.getText(performancePage.numberOfRecord));
        commonFunction.printTable(performancePage.row,performancePage.cell);
    }
    public void inputRating(Integer num){
        List <WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(performancePage.inputRating));

        for(WebElement element : elements) element.sendKeys(Integer.toString(num));
    }
    public void inputComments(String comments){
        List <WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(performancePage.inputRating));

        for(WebElement element : elements) element.sendKeys(comments);
    }
    public void review(){
        commonFunction.click(performancePage.manageReviews);
        commonFunction.click(performancePage.myReview);
        commonFunction.click(performancePage.actions);
    }
    public void  inputGeneralComments(String sth){
        commonFunction.sendkeys(performancePage.generalCmt,sth);
    }
    public void myTracker(){
        commonFunction.click(performancePage.myTrackers);
        System.out.println(commonFunction.getText(performancePage.numberOfRecord));
        commonFunction.printTable(performancePage.row,performancePage.cell);
    }
    public void positiveNegative(Boolean pass){
        if (pass== true)
            commonFunction.click(performancePage.positive);
        else
            commonFunction.click(performancePage.negative);
    }
    public void addTrackerLog(String log,Boolean isGood, String  cmt ){
        commonFunction.click(performancePage.myTrackers);
        commonFunction.click(performancePage.view);
        commonFunction.click(performancePage.addLog);
        commonFunction.sendkeys(performancePage.logTracker,log);
        positiveNegative(isGood);
        commonFunction.sendkeys(performancePage.trackerCmt,cmt);
        commonFunction.click(performancePage.saveBtn);
    }
    public void checkEmployeesTracker(){
        commonFunction.click(performancePage.employeesTracker);
        commonFunction.isDisplayed(performancePage.inputEmployeeName);
        commonFunction.isDisplayed(performancePage.include);
        commonFunction.isDisplayed(performancePage.searchBtn);
        commonFunction.isDisplayed(performancePage.resetBtn);
        System.out.println(commonFunction.getText(performancePage.numberOfRecord));
        commonFunction.printTable(performancePage.row,performancePage.cell);
    }
    public void searchCheckEmployeesTracker(String name,String status) throws InterruptedException {
        commonFunction.click(performancePage.employeesTracker);
        commonFunction.sendkeysDropdownList(performancePage.inputEmployeeName,performancePage.dropdownList,name);
        commonFunction.selectItemInCustomDropdown(performancePage.include,performancePage.dropdownList,status);
        commonFunction.click(performancePage.searchBtn);
        System.out.println(commonFunction.getText(performancePage.numberOfRecord));
        commonFunction.printTable(performancePage.row,performancePage.cell);
    }
    public void addLogEmployeesTracker(String log,Boolean isGood, String  cmt ){
        commonFunction.click(performancePage.employeesTracker);
        commonFunction.click(performancePage.exView);
        commonFunction.click(performancePage.addLog);
        commonFunction.sendkeys(performancePage.logTracker,log);
        positiveNegative(isGood);
        commonFunction.sendkeys(performancePage.trackerCmt,cmt);
        commonFunction.click(performancePage.saveBtn);
    }

}

package page;

import org.openqa.selenium.By;

public class PerformancePage {
    //Top Menu
    public By configure = By.xpath("//li[@class=\"oxd-topbar-body-nav-tab --parent\"]");
    public By manageReviews = By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent --visited']");
    public By myTrackers = By.xpath("//*[contains(a,\"My Trackers\")]");
    public By employeesTracker = By.xpath("//*[contains(a,\"Employee Trackers\")]");
    public By kpis = By.xpath("//a[@role=\"menuitem\" and contains(text(),\"KPIs\")]");
    public By trackers = By.xpath("//a[@role=\"menuitem\" and contains(text(),\"Trackers\")]");
    //Manage Reviews function
    public By employeeName = By.xpath("//label[contains(text(),\"Employee Name\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::input");
    public By jobTitle = By.xpath("//label[contains(text(),\"Job Title\")]/ancestor::div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]//descendant::div[@class=\"oxd-select-text oxd-select-text--active\"]");
    public By subUnit = By.xpath("//label[contains(text(),\"Sub Unit\")]/ancestor::div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]//descendant::div[@class=\"oxd-select-text oxd-select-text--active\"]");//Employees Reviews
    public By include = By.xpath("//label[contains(text(),\"Include\")]/ancestor::div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]//descendant::div[@class=\"oxd-select-text oxd-select-text--active\"]");
    public By reviewerStatus = By.xpath("//label[contains(text(),\"Review Status\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::div[@class=\"oxd-select-text oxd-select-text--active\"]");
    public By fromDate = By.xpath("//label[contains(text(),\"From Date\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::input");
    public By toDate = By.xpath("//label[contains(text(),\"To Date\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::input");
    public By resetBtn = By.xpath("//button[@type=\"reset\"]");
    public By searchBtn = By.xpath("//button[@type=\"submit\"]");//save button
    public By inputReviewer = By.xpath("//label[contains(text(),\"Reviewer\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::input");
    //configure/KPIs
    public By addBtn = By.xpath("//button[normalize-space()='Add']");

    public By keyPerformanceIndicator = By.xpath("//label[contains(text(),\"Key Performance Indicator\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::input");
    public By minimum = By.xpath("//label[contains(text(),\"Minimum Rating\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::input");
    public By maximum = By.xpath("//label[contains(text(),\"Maximum Rating\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::input");
    public By makeDefaultScale = By.xpath("//label/descendant::span");

    public By dropdownBox = By.xpath("//div[@class=\"oxd-select-text oxd-select-text--active\"]");
    public By dropdownList = By.xpath("//div[@role=\"option\"]");
    public By row = By.xpath("//div[@role=\"row\"]");
    public By cell = By.xpath("//div[@role=\"cell\"]");
    //Configure Tracker
    public By inputEmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
    public By nameDropdownList = By.xpath("//div[@role=\"option\"]");
    public By inputEmployeesName = By.xpath("//label[contains(text(),\"Employee Name\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::input");
    public By inputTrackerName = By.xpath("//label[contains(text(),\"Tracker Name\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::input");
    public By inputReviewers = By.xpath("//label[contains(text(),\"Reviewers\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::input");
    public By inputResultList = By.xpath("//div[@role=\"option\"]");
    public By add = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
    public By saveBtn = By.xpath("//button[@type=\"submit\"]");
    //Manager Review List
    public By managerReviews = By.xpath("//a[contains(text(),\"Manage Reviews\")]");
    public By myReview = By.xpath("//a[contains(text(),\"My Reviews\")]");
    public By employeesReviews = By.xpath("//a[contains(text(),\"My Reviews\")]");
    public By numberOfRecord = By.xpath("//div[@class=\"orangehrm-horizontal-padding orangehrm-vertical-padding\"]/descendant::span");
    public By supervisorReviewer = By.xpath("//label[contains(text(),\"Supervisor Reviewer\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::input");
    public By periodStarDate = By.xpath("//label[contains(text(),\"Review Period Start Date\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::input");
    public By periodEndDate = By.xpath("//label[contains(text(),\"Review Period End Date\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::input");
    public By dueDate = By.xpath("//label[contains(text(),\"Due Date\")]/ancestor::div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::input");
    public By actions = By.xpath("//i[@class='oxd-icon bi-file-text-fill']");
    public By inputRating = By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]/descendant::input");
    public By comments = By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]/descendant::textarea");
    public By generalCmt = By.xpath("//div[@class=\"oxd-grid-3 orangehrm-evaluation-grid\"]/descendant::textarea");
    public By view = By.xpath("//button[@name='view']");
    public By addLog = By.xpath("//button[normalize-space()='Add Log']");
    public By logTracker = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//input");
    public By trackerCmt = By.xpath("//textarea[@class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]");
    public By negative =By.xpath("//button[normalize-space()='Negative']//*[name()='svg']");
    public By positive =By.xpath("//button[normalize-space()='Positive']//*[name()='svg']");
    public By exView=By.xpath("//div[contains(text(),\"Tracker for charlie 2\")]//ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"]/descendant::button");
}
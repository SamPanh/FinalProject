package page;

import org.openqa.selenium.By;

public class MainPage {
    public By searchBox =By.xpath("//input[@class=\"oxd-input oxd-input--active\"]");
    public By admin =By.xpath("//*[contains(span,'Admin')]");
    public By PIM =By.xpath("//*[contains(span,'PIM')]");
    public By leave =By.xpath("//*[contains(span,'Leave')]");
    public By time = By.xpath("//*[contains(span,'Time')]");
    public By recruitment =By.xpath("//*[contains(span,'Recruitment')]");
    public By myInfo =By.xpath("//*[contains(span,'My Info')]");
    public By performance =By.xpath("//*[contains(span,'Performance')]");
    public By dashBoard=By.xpath("//a[@class='oxd-main-menu-item active']");
    public By directory =By.xpath("//*[contains(span,'Directory')]");
    public By maintenance =By.xpath("//*[contains(span,'Maintenance')]");
    public By claim =By.xpath("//*[contains(span,'Claim')]");
    public By buzz =By.xpath("//*[contains(span,'Buzz')]");
}

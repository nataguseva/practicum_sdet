package ru.list.nataguseva.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProfilePage {

    WebDriver driver;

    @FindBy(xpath = "//div[@_uid='1409967518']")
    WebElement accountBtn;

    @FindBy(xpath = "//a[@href=\"https://mail.yandex.ru\"]")
    WebElement mailBtn;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAccountBtn() {
        accountBtn.click();
    }
    public void clickMailBtn() {
        mailBtn.click();
    }
}


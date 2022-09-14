import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderFirstPage extends BasePage {

    public OrderFirstPage(WebDriver webDriver) {
        super(webDriver);
    }

    protected By name = By.xpath("//input[@placeholder='* Имя']");
    protected By surName = By.xpath("//input[@placeholder='* Фамилия']");

    protected By adress = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");

    protected By metroStation = By.xpath(".//div[2]/div[4]/div/div/input");

    protected By phoneNumber = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");

    protected By zakazTop = By.xpath("//*[@class='Button_Button__ra12g']");

//    protected By orderBottom = By.xpath("//*[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']");
    protected By orderBottom = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    protected By Dalee = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //    Локатор выбора станции метро Преображенская
    protected By preobrajenskaya = By.xpath("//div[@class='select-search__select']//*[text()='Преображенская площадь']");

    public void clickOrderTop() {
        webDriver.findElement(zakazTop).click();
    }

    public void clickOrderBottom() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(orderBottom));
        webDriver.findElement(orderBottom).click();
    }

//написать имя
    public void setName(String when) {
        webDriver.findElement(name).sendKeys(when);
    }

    public void setSurName(String surName2) {
        webDriver.findElement(surName).sendKeys(surName2);
    }
    //Прописать адрес
    public void setAdress(String adres2) {
        webDriver.findElement(adress).sendKeys(adres2);
    }
//непонятно где взять данные для локатора метро
    public void setMetroStation() {
        webDriver.findElement(metroStation).click();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(preobrajenskaya));
        webDriver.findElement(preobrajenskaya).click();
    }
    //Прописать телефон
    public void setPhoneNumber(String phone) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumber));
        webDriver.findElement(phoneNumber).sendKeys(phone);
    }
    public void clickDalee() {
        webDriver.findElement(Dalee).click();
    }


}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderSecondPage extends BasePage {

    public OrderSecondPage(WebDriver webDriver) {
        super(webDriver);
    }

    protected By whenDelivery = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    protected By calendarDelivery = By.xpath("//*[@aria-label = 'Choose четверг, 15-е сентября 2022 г.']");
    protected By rentalPeriod = By.xpath("//*[@class='Dropdown-placeholder']");
    protected By rentalDay = By.xpath("//*[text()='сутки']");
//    protected By rental2Days = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[2]");
//    protected By rental3Days = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[3]");
//    protected By rental4Days = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[4]");
//    protected By rental5Days = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[5]");
//    protected By rental6Days = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[6]");
//    protected By rental7Days = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[7]");
    protected By blackPerl = By.id("black");
    protected By grayHopelessness = By.id("grey");
    protected By comment = By.xpath("//*[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");

    protected By farther2 = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    protected By da = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    protected By status = By.xpath("//*[contains(text(), 'Посмотреть статус')]");

    public void setDate(){
        webDriver.findElement(whenDelivery).click();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(calendarDelivery));
        webDriver.findElement(calendarDelivery).click();

    }

    public void setRentalPeriods(){
        webDriver.findElement(rentalPeriod).click();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(rentalDay));
        webDriver.findElement(rentalDay).click();

    }
    public void setColorBlack(){
        webDriver.findElement(blackPerl).click();


    }
    public void setColorGray(){
        webDriver.findElement(grayHopelessness).click();


    }

    public void setComments(){
        webDriver.findElement(comment).sendKeys("Комментарий для заказа");

    }

    public void clickFarther2(){
        webDriver.findElement(farther2).click();

    }
    public void clickDa(){
        webDriver.findElement(da).click();

    }
    public String getTextStatus(){
    return webDriver.findElement(status).getText();
    }




}
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OrderFirstPageTest extends BasePageTest{
    protected String name1 = "Станислава";
    protected String surName1 = "Беневоленская";
    protected String adress1 = "9 Парковая, д.21, к.1";
    protected String phoneNumber1 = "89151570001";

    protected String name2 = "Стефания";
    protected String surName2 = "Минаева";
    protected String adress2 = "9 Парковая, д.21, к.2";
    protected String phoneNumber2 = "89151570002";

    @Test
    public void checkFirstPage(){
        OrderFirstPage firstPage = new OrderFirstPage(webDriver);
        OrderSecondPage orderSecond = new OrderSecondPage(webDriver);

        firstPage.clickOrderTop();
        firstPage.setName(name1);
        firstPage.setSurName(surName1);
        firstPage.setAdress(adress1);
        firstPage.setMetroStation();
        firstPage.setPhoneNumber(phoneNumber1);
        firstPage.clickDalee();
        orderSecond.setDate();
        orderSecond.setRentalPeriods();
        orderSecond.setColorBlack();
        orderSecond.setComments();
        orderSecond.clickFarther2();
        orderSecond.clickDa();
        String extend = "Посмотреть статус";
        String actual = orderSecond.getTextStatus();
        assertEquals("Ошибка теста", extend, actual);

    }
    @Test
    public void checkFirstPageGray(){
        OrderFirstPage firstPage = new OrderFirstPage(webDriver);
        OrderSecondPage orderSecond = new OrderSecondPage(webDriver);

        firstPage.clickOrderTop();
        firstPage.setName(name2);
        firstPage.setSurName(surName2);
        firstPage.setAdress(adress2);
        firstPage.setMetroStation();
        firstPage.setPhoneNumber(phoneNumber2);
        firstPage.clickDalee();
        orderSecond.setDate();
        orderSecond.setRentalPeriods();
        orderSecond.setColorGray();
        orderSecond.setComments();
        orderSecond.clickFarther2();
        orderSecond.clickDa();
        String extend = "Посмотреть статус";
        String actual = orderSecond.getTextStatus();
        assertEquals("Ошибка теста", extend, actual);

    }
    @Test
    public void checkFirstPageDownButton(){
        OrderFirstPage firstPage = new OrderFirstPage(webDriver);
        OrderSecondPage orderSecond = new OrderSecondPage(webDriver);
        firstPage.scrollToElement(firstPage.orderBottom);
        firstPage.clickOrderBottom();
        firstPage.setName(name1);
        firstPage.setSurName(surName1);
        firstPage.setAdress(adress1);
        firstPage.setMetroStation();
        firstPage.setPhoneNumber(phoneNumber1);
        firstPage.clickDalee();
        orderSecond.setDate();
        orderSecond.setRentalPeriods();
        orderSecond.setColorBlack();
        orderSecond.setComments();
        orderSecond.clickFarther2();
        orderSecond.clickDa();
        String extend = "Посмотреть статус";
        String actual = orderSecond.getTextStatus();
        assertEquals("Ошибка теста", extend, actual);

    }
    @Test
    public void checkFirstPageDownButtonGray(){
        OrderFirstPage firstPage = new OrderFirstPage(webDriver);
        OrderSecondPage orderSecond = new OrderSecondPage(webDriver);
        firstPage.scrollToElement(firstPage.orderBottom);
        firstPage.clickOrderBottom();
        firstPage.setName(name2);
        firstPage.setSurName(surName2);
        firstPage.setAdress(adress2);
        firstPage.setMetroStation();
        firstPage.setPhoneNumber(phoneNumber2);
        firstPage.clickDalee();
        orderSecond.setDate();
        orderSecond.setRentalPeriods();
        orderSecond.setColorGray();
        orderSecond.setComments();
        orderSecond.clickFarther2();
        orderSecond.clickDa();
        String extend = "Посмотреть статус";
        String actual = orderSecond.getTextStatus();
        assertEquals("Ошибка теста", extend, actual);

    }



}

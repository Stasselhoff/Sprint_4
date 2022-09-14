import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainPageTest extends BasePageTest{

    @Test
    public void CheckHeading0(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToElement(mainPage.heading0);
        mainPage.clickList(mainPage.heading0);

        String extend = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = mainPage.getTextFromDropdownField(mainPage.accordion0);
        assertEquals("Ошибка теста", extend, actual);
    }
    @Test
    public void CheckHeading1(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToElement(mainPage.heading1);
        mainPage.clickList(mainPage.heading1);

        String extend = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = mainPage.getTextFromDropdownField(mainPage.accordion1);
        assertEquals("Ошибка теста", extend, actual);
    }
    @Test
    public void CheckHeading2(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToElement(mainPage.heading2);
        mainPage.clickList(mainPage.heading2);

        String extend = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = mainPage.getTextFromDropdownField(mainPage.accordion2);
        assertEquals("Ошибка теста", extend, actual);
    }
    @Test
    public void CheckHeading3(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToElement(mainPage.heading3);
        mainPage.clickList(mainPage.heading3);

        String extend = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = mainPage.getTextFromDropdownField(mainPage.accordion3);
        assertEquals("Ошибка теста", extend, actual);
    }

    @Test
    public void CheckHeading4(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToElement(mainPage.heading4);
        mainPage.clickList(mainPage.heading4);

        String extend = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = mainPage.getTextFromDropdownField(mainPage.accordion4);
        assertEquals("Ошибка теста", extend, actual);
    }
    @Test
    public void CheckHeading5(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToElement(mainPage.heading5);
        mainPage.clickList(mainPage.heading5);

        String extend = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = mainPage.getTextFromDropdownField(mainPage.accordion5);
        assertEquals("Ошибка теста", extend, actual);
    }
    @Test
    public void CheckHeading6(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToElement(mainPage.heading6);
        mainPage.clickList(mainPage.heading6);

        String extend = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = mainPage.getTextFromDropdownField(mainPage.accordion6);
        assertEquals("Ошибка теста", extend, actual);
    }
    @Test
    public void CheckHeading7(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToElement(mainPage.heading7);
        mainPage.clickList(mainPage.heading7);

        String extend = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = mainPage.getTextFromDropdownField(mainPage.accordion7);
        assertEquals("Ошибка теста", extend, actual);
    }


}

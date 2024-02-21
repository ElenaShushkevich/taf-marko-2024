package by.itacademy.shushkevich;

import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MarkoLoginPageTest extends BaseTest {
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Test
    @Order(1)
    public void test1LoginForm() {

        homePage.openAuthMenu();
        homePage.selectAuthorisation();

        Assertions.assertEquals("АВТОРИЗАЦИЯ", loginPage.getLoginTitle());

    }

    @Test
    @Order(2)
    public void test2EmptyForm() {

        loginPage.clickSubmitButton();

        Assertions.assertEquals("Введите, пожалуйста, Ваш номер телефона!", loginPage.getErrorTextWOData());
    }

    @Test
    @Order(3)
    public void test3InputData() {
        loginPage.inputPhone("447972784");
        loginPage.clickCookies();
        loginPage.inputPassword("123456789");
        //loginPage.clickBanner();
        loginPage.clickSubmitButton();
        //loginPage.getSecondErrorText();
        Assertions.assertEquals("Неверный телефон или пароль", loginPage.getSecondErrorText());
    }
}

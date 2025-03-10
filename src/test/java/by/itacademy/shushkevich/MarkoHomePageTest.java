package by.itacademy.shushkevich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarkoHomePageTest extends BaseTest {
    @Test
    public void testHomePage(){
        HomePage homePage = new HomePage(driver);

        Assertions.assertEquals("Разработано12365 –", homePage.getTextDeveloper_Label());
    }
}

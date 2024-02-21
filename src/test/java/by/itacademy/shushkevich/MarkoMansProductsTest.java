package by.itacademy.shushkevich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarkoMansProductsTest extends BaseTest {
    HomePage homePage = new HomePage(driver);
    ManPage manPage = new ManPage(driver);
    BootsPage bootsPage = new BootsPage(driver);
    BootsItemPage bootsItemPage = new BootsItemPage(driver);

    @Test
    public void selectForManNavigation() {
        homePage.selectNavigationMenuMen();
        manPage.selectBoots();
        bootsPage.selectNameOfBoots();
        bootsItemPage.getNameOfBoots();
        //Assertions.assertEquals("Ботинки мужские", bootsItemPage.getNameOfBoots());
        Assertions.assertTrue(bootsItemPage.getNameOfBoots().contains("Ботинки"));
    }
}

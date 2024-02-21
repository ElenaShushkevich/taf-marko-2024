package by.itacademy.shushkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    ChromeDriver driver;

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public String getTextDeveloper_Label() {
        WebElement developerLabel = driver.findElement(By.xpath(HomePageXpath.DEVELOPER_LABEL));
        return developerLabel.getText();

    }

    public void openAuthMenu() {
        WebElement openAuthMenu = driver.findElement(By.xpath(HomePageXpath.LOGIN_BUTTON));
        openAuthMenu.click();
    }

    public void selectAuthorisation() {
        WebElement selectAuthorisation = driver.findElement(By.xpath(HomePageXpath.AUTHORIZATION));
        selectAuthorisation.click();
    }

    public void selectNavigationMenuMen() {
        WebElement selectNavigationMenuMen = driver.findElement(By.xpath(HomePageXpath.NAVIGATION_MENU_MEN));
        selectNavigationMenuMen.click();
    }

    public void inputShoes(String shoes) {
        WebElement inputShoes = driver.findElement(By.xpath(HomePageXpath.SEARCH_FIELD));
        inputShoes.click();
        inputShoes.sendKeys(shoes);
    }

    public void clickSearchButton() {
        WebElement clickSearchButton = driver.findElement(By.xpath(HomePageXpath.SEARCH_BUTTON));
        clickSearchButton.click();
    }
}

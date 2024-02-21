package by.itacademy.shushkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManPage extends HomePage {

    public ManPage(ChromeDriver driver) {
        super(driver);
    }

    public void selectBoots(){
        WebElement selectBoots = driver.findElement(By.xpath(ManPageXpath.SCROLL_MENU));
        selectBoots.click();
    }

}

package by.itacademy.shushkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoesItemPage extends HomePage {
    public ShoesItemPage(ChromeDriver driver) {
        super(driver);

    }

    public String getShoesName() {

        WebElement getShoesName = driver.findElement(By.xpath(ShoesItemPageXpath.NAME_OF_SHOES));
        return getShoesName.getText();
    }
}

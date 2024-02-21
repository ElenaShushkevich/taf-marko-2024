package by.itacademy.shushkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootsItemPage extends HomePage {
    public BootsItemPage(ChromeDriver driver){
        super(driver);
    }

    public String getNameOfBoots(){
        WebElement getNameOfBoots = driver.findElement(By.xpath(BootsItemPageXpath.NAME_OF_BOOTS));
        return getNameOfBoots.getText();
    }
}

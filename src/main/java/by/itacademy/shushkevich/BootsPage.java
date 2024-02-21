package by.itacademy.shushkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootsPage extends HomePage {
   public BootsPage(ChromeDriver driver){
       super(driver);
   }
    public void selectNameOfBoots(){
        WebElement selectNameOfBoots = driver.findElement(By.xpath(BootsPageXpath.FIRST_ITEM));
        selectNameOfBoots.click();
    }
}

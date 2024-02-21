package by.itacademy.shushkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchingResultPage extends HomePage {
    public SearchingResultPage(ChromeDriver driver) {
        super(driver);
    }
    public void selectShoes (){
        WebElement selectShoes = driver.findElement(By.xpath(SearchingResultPageXPath.FIRST_ITEM_OF_SHOES));
        selectShoes.click();
    }
    public void clickCookies (){
        WebElement clickCookies = driver.findElement(By.xpath(SearchingResultPageXPath.COOKIES));
        clickCookies.click();
    }
}

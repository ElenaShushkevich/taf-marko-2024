package by.itacademy.shushkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPage extends HomePage {

    public LoginPage(ChromeDriver driver) {
        super(driver);
    }

    public String getLoginTitle() {
        WebElement getLoginTitle = driver.findElement(By.xpath(LoginPageXPath.LOGIN_TITLE));
        return getLoginTitle.getText();

    }

    public void clickSubmitButton() {
        WebElement clickSubmitButton = driver.findElement(By.xpath(LoginPageXPath.SUBMIT_BUTTON));
        clickSubmitButton.click();
    }

    public void clickCookies() {
        WebElement clickCookies = driver.findElement(By.xpath(LoginPageXPath.COOKIES));
        clickCookies.click();
    }

    public void clickBanner() {
        WebElement clickBanner = driver.findElement(By.xpath(LoginPageXPath.BANNER));
        clickBanner.click();
    }

    public String getErrorTextWOData() {
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebElement getErrorTextWOData = (new WebDriverWait(driver, Duration.ofSeconds(10)))
        // .until(ExpectedConditions.presenceOfElementLocated(By.xpath(LoginPageXPath.ERROR_TEXT)));
        WebElement getErrorTextWOData = driver.findElement(By.xpath(LoginPageXPath.ERROR_TEXT));

        return getErrorTextWOData.getText();
    }

    public void inputPhone(String phone) {
        WebElement inputPhone = driver.findElement(By.xpath(LoginPageXPath.INPUT_PHONE));
        inputPhone.click();
        inputPhone.sendKeys(phone);

    }

    public void inputPassword(String password) {
        WebElement inputPassword = driver.findElement(By.xpath(LoginPageXPath.INPUT_PASSWORD));
        inputPassword.click();
        inputPassword.sendKeys(password);
    }

    public String getSecondErrorText() {

        WebElement getSecondErrorText = driver.findElement(By.xpath(LoginPageXPath.SECOND_ERROR));

        return getSecondErrorText.getText();
    }
}

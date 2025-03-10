package by.itacademy.shushkevich;

import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeAll;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    static ChromeDriver driver;

    @BeforeAll
    public static void beforeTest() {
        driver = new ChromeDriver();
        String url = "https://www.marko56.by/";
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    @AfterAll
    public static void afterTest() {
        driver.quit();
    }

}

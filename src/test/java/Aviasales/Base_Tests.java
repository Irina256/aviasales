package Aviasales;

import Browsers.Browser_Factory;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Tests {

        WebDriver driver;
        @BeforeMethod
        public void startUp() throws NoSuchMethodException {
            var factory = new Browser_Factory();
            driver = factory.createWebDriver(BrowserType.CHROME);
            driver.manage().window().maximize();
        }
        @AfterMethod
        public void tearDown() throws InterruptedException{
            Thread.sleep(1000);
            driver.quit();
        }



}

package Aviasales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Results extends Base_Objects {
    public Results(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogo() {return
        wait.until(x -> x.findElement(By.xpath("//*[@class=\"booking-banner-cards-container-head__logo\"]")));
    }

}

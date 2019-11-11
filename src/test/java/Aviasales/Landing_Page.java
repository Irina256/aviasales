package Aviasales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class Landing_Page extends Base_Objects {

    public Landing_Page(WebDriver driver) {super (driver);
    }

    public void openAviasales() {

        driver.get("https://www.aviasales.ru/");
    }


    public void getExtendedSearch() {
        driver.findElement(By.xpath("//*[@href=\"#multiway\"]")).click();
    }

    public void setDestination(String Dep1, String Dest1, String Dep2, String Dest2) {
        String[] dd = new String[]{Dep1,Dest1,Dep2,Dest2};
        List<WebElement> allDestination =wait.until(x->driver.findElements(By.xpath("//*[@aria-autocomplete='list']")));
        Iterator<WebElement> iterator = allDestination.iterator();
        while (iterator.hasNext())
            for (String x:dd){
                iterator.next().sendKeys("          "+x);
            }




    }
}

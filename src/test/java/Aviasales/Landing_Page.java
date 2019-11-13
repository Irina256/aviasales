package Aviasales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;

public class Landing_Page extends Base_Objects {

    public Landing_Page(WebDriver driver) {
        super(driver);
    }

    public void openAviasales() {

        driver.get("https://www.aviasales.ru/");
    }


    public void getExtendedSearch() {
        wait.until(x->driver.findElement(By.xpath("//*[@href=\"#multiway\"]"))).click();
    }

    public void setDestination(String Dep1, String Dest1, String Dep2, String Dest2) {
        String[] dd = new String[]{Dep1, Dest1, Dep2, Dest2};
        List<WebElement> allDestination = wait.until(x -> driver.findElements(By.xpath("//*[@aria-autocomplete='list']")));
        Iterator<WebElement> iterator = allDestination.iterator();
        while (iterator.hasNext())
            for (String x : dd) {
                iterator.next().sendKeys("          " + x);
            }


    }

    public List<WebElement> getDateCalendar() {
        return driver.findElements(By.xpath("//*[@placeholder='Дата вылета']"));
    }

    public void setDates(String Date1, String Date2) {
        String[] cal = new String[]{Date1, Date2};
        List<WebElement> allDates = this.getDateCalendar();
        Iterator iter = allDates.iterator();
        while (iter.hasNext()) {
            String[] var7 = cal;
            int var8 = cal.length;
            for (int var9 = 0; var9 < var8; ++var9) {
                String j = var7[var9];
                ((WebElement) iter.next()).click();
                ((WebElement) this.wait.until((x) -> {
                    return this.driver.findElement(By.xpath("//*[@aria-label='" + j + "']"));
                })).click();
            }
        }
    }

    public void setNumberOfPassengersandClass() {
        driver.findElement(By.xpath("//*[text()=\"1, эконом\"]")).click();

        typeOfTicket().isSelected();
        numberOfAdultsAndChildren().click();
    }


        WebElement numberOfAdultsAndChildren(){return driver.findElement(By.xpath("//*[contains(text(),'Найти билеты')]"));}

   private WebElement typeOfTicket() {
       return wait.until(x -> x.findElement(By.xpath("(//*[@class=\"custom-radio__element\"])[4]")));
   }

    public Results getResultsPage() {
           Results results = new Results(driver);
           return results;



    }


}


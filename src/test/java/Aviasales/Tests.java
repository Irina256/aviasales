package Aviasales;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends Base_Tests {
    @Test
public void searchForTrip() throws InterruptedException {
Landing_Page landing_page=new Landing_Page(driver);
landing_page.openAviasales();
landing_page.getExtendedSearch();
landing_page.setDestination("Orlando", "Miami", "Miami", "Moscow");
landing_page.setDates("Fri Nov 15 2019", "Sat Nov 16 2019");
landing_page.setNumberOfPassengersandClass();
landing_page.getResultsPage();
Thread.sleep(300);
        Results page=new Results(driver);
 var x= page.getLogo();



Assert.assertTrue(true, String.valueOf(x));








    }
}

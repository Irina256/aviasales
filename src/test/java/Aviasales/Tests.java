package Aviasales;

import org.testng.annotations.Test;

public class Tests extends Base_Tests {
    @Test
public void searchForTrip(){
Landing_Page landing_page=new Landing_Page(driver);
landing_page.openAviasales();
landing_page.getExtendedSearch();
landing_page.setDestination("Orlando", "Miami", "Miami", "Richmond");






    }
}

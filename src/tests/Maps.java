package tests;


import org.testng.annotations.Test;
import pages.MainPage;

public class Maps extends Main {
    @Test

    public void searchGooglePosition() {
        MainPage mainPage = new MainPage();
        mainPage.openGoogleMaps()
                .performSearch()
                .verifyLocation();



    }
}



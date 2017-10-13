


package tests;

import org.testng.annotations.Test;
import pages.MainPage;

public class GoogleCalendar extends Main {
    @Test
    public void createGoogleEvent() {
        MainPage mainPage = new MainPage();
        mainPage.openGoogleCalendar()
                .createEvent()
                .fillInEventFields();


    }
}



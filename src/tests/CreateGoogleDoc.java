package tests;

import org.testng.annotations.Test;
import pages.MainPage;


public class CreateGoogleDoc extends Main{
    @Test
    public void CreateNewGoogleDoc() {
        MainPage mainPage = new MainPage();
        mainPage.openGoogleDocs()
                .createNewFile()
                .verifyFile();


    }
}

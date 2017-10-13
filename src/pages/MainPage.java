package pages;

import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;


import static pages.LoginPage.loginPageisShown;
import static tests.Main.waitInSeconds;


public class MainPage {
    private Button goToGmail = new Button(By.linkText("Gmail"));
    private TextInput recoveryEmailInput = new TextInput(By.cssSelector("placeholder='you@example.com'"));
    private Button openGoogleAppsButton = new Button(By.xpath("//a[@class='gb_b gb_6b']"));
    private Button moreButton = new Button(By.linkText("Більше"));
    private Button documentsButton = new Button(By.xpath("//span[text()='Документи']"));
    private Button openMapsButton = new Button(By.xpath("//span[text()='Карти']"));
    private TextInput searchInput = new TextInput(By.xpath("//div[@class='gstl_0 sbib_a']//input"));
    private Button performSearchButton = new Button(By.cssSelector("input.lsb"));
    private Button openGoogleCalendarButton = new Button(By.xpath("//span[text()='Календар']"));





    public SendMessagePage openGmail() {
        goToGmail.click();
        if (loginPageisShown()) {
            new LoginPage().login();
        }
        if (recoveryEmailInput.isPresent()) {
            recoveryEmailInput.fillIn("sergiitst2@gmail.com");
        }

        return new SendMessagePage();
    }


    public  GoogleDocumentsPage openGoogleDocs() {
        openGoogleAppsButton.click();
        moreButton.click();
        waitInSeconds(3);
        documentsButton.waitAndClick();
        if (loginPageisShown()) {
            new LoginPage().login();
        }
        if (recoveryEmailInput.isPresent()) {
            recoveryEmailInput.fillIn("sergiitst2@gmail.com");
        }
        else if(openGoogleAppsButton.isPresent()){
            openGoogleAppsButton.click();
            moreButton.click();
            documentsButton.waitAndClick();
        }
        return new GoogleDocumentsPage();
    }
    public GoogleMapsPage openGoogleMaps() {
        openGoogleAppsButton.click();
        waitInSeconds(1);
        openMapsButton.click();
        if (loginPageisShown()) {
            new LoginPage().login();
        }
        if (recoveryEmailInput.isPresent()) {
            recoveryEmailInput.fillIn("sergiitst2@gmail.com");
        }
        return new GoogleMapsPage();
    }

    public SearchResultPage searchHabr() {
        searchInput.fillIn("habr");
        performSearchButton.click();
        return new SearchResultPage();
    }

    public GoogleCalendarPage openGoogleCalendar() {
        openGoogleAppsButton.click();
        waitInSeconds(1);
        openGoogleCalendarButton.click();
        if (loginPageisShown()) {
            new LoginPage().login();
        }
        if (recoveryEmailInput.isPresent()) {
            recoveryEmailInput.fillIn("sergiitst2@gmail.com");
        }
        return new GoogleCalendarPage();
    }


}









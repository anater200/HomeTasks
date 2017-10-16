
package pages;

import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;

import static tests.Main.waitInSeconds;


public class EventCreationPage {
    private TextInput eventNameInput = new TextInput(By.xpath("//div[@class='ui-sch ep-title']/input"));
    private Button startTimeButton = new Button(By.xpath("//span[@class='group']/input[@class='text dr-time']"));
    private Button startTimeButton2 = new Button(By.xpath("//div[@class='goog-container goog-container-vertical']/div[text()='6:00pm']"));
    private Button saveButton = new Button(By.xpath("//div[@class='action-btn-wrapper ep-ea-btn-wrapper']/div[@role='button']"));
    private Button deleteEventButton = new Button(By.xpath("//div[@class='goog-inline-block goog-imageless-button ep-ea-delbut']"));





    public GoogleCalendarPage fillInEventFields() {

        eventNameInput.fillIn("New event");
        startTimeButton.clear();
        waitInSeconds(2);
        startTimeButton2.click();
        saveButton.click();
        return new GoogleCalendarPage();
    }
    public void eventDeleting() {
        deleteEventButton.click();

    }

}



package pages;

import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;

import static tests.Main.waitInSeconds;


public class EventCreationPage {
    private TextInput eventNameInput = new TextInput(By.xpath("//div[@class='ui-sch ep-title']/input"));
    private Button startTimeButton = new Button(By.xpath("//span[@class='group']/input[@class='text dr-time']"));
    private Button startTimeButton2 = new Button(By.xpath("//div[@class='goog-container goog-container-vertical']/div[text()='6:00pm']"));

    private Button endTimeButton = new Button(By.id("//*[@id=:r1]"));
    private Button saveButton = new Button(By.id("//*[@id=:t5.save_top]/div"));


    public EventCreationPage fillInEventFields() {

        eventNameInput.fillIn("New event");
        startTimeButton.clear();
        waitInSeconds(2);
        startTimeButton2.click();

        endTimeButton.waitAndClick();
        saveButton.click();

        return this;
    }

}


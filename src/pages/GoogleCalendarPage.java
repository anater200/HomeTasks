

package pages;
import elements.Button;
import org.junit.Assert;
import org.openqa.selenium.By;

import static tests.Main.waitInSeconds;

public class GoogleCalendarPage {
    private Button gotItButton =new Button(By.xpath("//div[@class='goog-inline-block jfk-button jfk-button-action jfk-button-clear-outline']"));
    private Button createEventButton = new Button(By.xpath("//div[@class='qnb-container']/div[@role='button']"));
    private Button openEventbutton = new Button(By.xpath("//div[@class='cpchip']/span[text()='New event']"));



    public EventCreationPage createEvent() {
        if(gotItButton.isPresent()) {
            gotItButton.click();
        } if(createEventButton.isPresent()) {
                createEventButton.click();
        }
        return new EventCreationPage();
    }
    public EventCreationPage eventPrecence() {
        Assert.assertTrue(openEventbutton.isPresent());
        waitInSeconds(2);
        openEventbutton.click();
        return new EventCreationPage();
    }

}







package pages;
import elements.Button;
import org.openqa.selenium.By;

public class GoogleCalendarPage {
    private Button gotItButton =new Button(By.xpath("//div[@class='goog-inline-block jfk-button jfk-button-action jfk-button-clear-outline']"));
    private Button createEventButton = new Button(By.xpath("//div[@class='qnb-container']/div[@role='button']"));


    public EventCreationPage createEvent() {
        if(gotItButton.isPresent()) {
            gotItButton.click();
        } if(createEventButton.isPresent()) {
                createEventButton.click();
        }
        return new EventCreationPage();
    }
}





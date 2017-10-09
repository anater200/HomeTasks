package pages;

import elements.Button;
import elements.Label;
import elements.TextInput;
import org.junit.Assert;
import org.openqa.selenium.By;

public class GoogleMapsPage {
    private TextInput searchLocationInput = new TextInput(By.xpath("//div[@class='gstl_50 sbib_a']//input"));
    private Button searchLocationButton = new Button(By.xpath("//div[@class='searchbox-searchbutton-container']"));
    private Label locationLabel = new Label(By.xpath("//div[@class='section-hero-header-description']/..//span[contains(text(),'Bali')]"));



    public  GoogleMapsPage performSearch(){
        searchLocationInput.fillIn("Бали");
        searchLocationButton.click();
        return this;
    }
    public void verifyLocation(){
        Assert.assertTrue(locationLabel.isPresent());
    }

}

package pages;

import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;

import static tests.Main.waitInSeconds;

public class HabrLoginPage {
    private TextInput emailInput = new TextInput(By.xpath("//*[@id='email_field']"));
    private TextInput passwordInput = new TextInput(By.cssSelector("input[type='password']"));
    private Button enterButton = new Button(By.xpath("//div[@class='s-buttons']/button"));


    public HabrMainPage loginTohabr() {
        emailInput.fillIn("testbestdb@gmail.com");
        waitInSeconds(1);
        passwordInput.fillIn("123456Qa!");
        enterButton.click();
        return new HabrMainPage();

    }


}

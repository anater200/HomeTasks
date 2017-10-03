package pages;

import elements.Button;
import elements.Label;
import elements.TextInput;
import org.junit.Assert;
import org.openqa.selenium.By;

import static tests.Main.waitInSeconds;

public class SendMessagePage {

    private Button composeButton = new Button(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']"));
    private TextInput chooseAddresseeInput = new TextInput(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']"));
    private TextInput writeMessageInput = new TextInput(By.xpath("//div[@class='Am Al editable LW-avf']"));
    private Button sendMessageButton = new Button(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']"));
    private Button refreshPageButton = new Button(By.xpath("//div[@class='asf T-I-J3 J-J5-Ji']"));
    private Label myMessageLabel = new Label(By.xpath("//table[@class='F cf zt']//tr/td[6]//span[2]\""));



    public SendMessagePage sendMessage() {
        composeButton.click();
        chooseAddresseeInput.fillIn("testbestdb@gmail.com");
        writeMessageInput.fillIn("Письмо самому себе");
        sendMessageButton.click();
        return this;
    }

    public void verifyMessage() {
        waitInSeconds(2);
        refreshPageButton.click();
        Assert.assertTrue(myMessageLabel.isPresent());

    }


}

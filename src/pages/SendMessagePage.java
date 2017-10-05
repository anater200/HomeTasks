package pages;

import elements.Button;
import elements.Label;
import elements.TextInput;
import org.junit.Assert;
import org.openqa.selenium.By;

import static tests.Main.waitInSeconds;

public class SendMessagePage {

    private Button composeButton = new Button(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']"));
    private TextInput chooseAddresseeInput = new TextInput(By.xpath("//div[@class='wO nr l1']/textarea"));
    private TextInput writeSubjectInput= new TextInput(By.xpath("//div[@class='aoD az6']/input"));
    private TextInput writeMessageInput = new TextInput(By.xpath("//div[@class='Am Al editable LW-avf']"));
    private Button sendMessageButton = new Button(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']"));
    private Button refreshPageButton = new Button(By.xpath("//div[@class='asf T-I-J3 J-J5-Ji']"));
    private Label myMessageLabel = new Label(By.xpath("//span[@class='bog']/..//span[contains(text(),'The letter for A.Terenko')]"));



    public SendMessagePage sendMessage() {
        composeButton.click();
        waitInSeconds(2);
        chooseAddresseeInput.fillIn("testbestdb@gmail.com");
        writeSubjectInput.fillIn("LetterForMe");
        writeMessageInput.fillIn("The letter for A.Terenko");
        sendMessageButton.click();
        return this;
    }

    public void verifyMessage() {
        waitInSeconds(2);
        refreshPageButton.click();
      Assert.assertTrue(myMessageLabel.isPresent());


    }


}

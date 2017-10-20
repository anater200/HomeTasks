package tests;

import org.testng.annotations.Test;
import pages.MainPage;

public class SendMail extends Main{
   @Test
    public void  sendMessageToYourself() {
        MainPage mainPage = new MainPage();
        mainPage.openGmail()
                .sendMessage()
                .verifyMessage()
                .deleteMessage();
    }


}


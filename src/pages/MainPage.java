package pages;

import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;
import static pages.LoginPage.loginPageisShown;


public class MainPage {
    private Button goToGmail = new Button(By.linkText("Gmail"));
    private TextInput recoveryEmailInput = new TextInput(By.cssSelector("placeholder='you@example.com'"));








    public SendMessagePage openGmail() {
        goToGmail.click();
        if(loginPageisShown()){
            new LoginPage().login();
        }
        if(recoveryEmailInput.isPresent()){
            recoveryEmailInput.fillIn("sergiitst2@gmail.com");
        }
        //метод который включает в себя переход по кнопке почта на gmail далее логин
        return new SendMessagePage();

    }
}

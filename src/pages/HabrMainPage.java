package pages;

import elements.Button;
import elements.Label;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HabrMainPage {
    private Button loginButton = new Button(By.xpath("//*[@id='login']"));
    private Button userProfileButton = new Button(By.xpath("//*[@class='dropdown dropdown_user dropdown_active']"));
    private Label userProfileLabel = new Label(By.xpath("//div[@class='dropdown-container dropdown-container_white']/..//span[contains(text().'testbestdb')]"));


    public HabrLoginPage goToLoginPage() {
        loginButton.click();
        return new HabrLoginPage();
    }

    public HabrMainPage openUserProfile() {
        userProfileButton.click();
        return this;

    }
    public void verifyUserNickname() {
        Assert.assertTrue(userProfileLabel.isPresent());
    }
}
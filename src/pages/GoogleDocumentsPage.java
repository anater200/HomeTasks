package pages;

import elements.Button;
import elements.Label;
import org.junit.Assert;
import org.openqa.selenium.By;

import static tests.Main.waitInSeconds;

public class GoogleDocumentsPage {
    private Button addNewDocButton = new Button(By.xpath("//img[@src='https://ssl.gstatic.com/docs/templates/thumbnails/docs-blank_1.png']/.."));
    private Label documentLabel = new Label(By.xpath("//body[@itemtype='http://schema.org/CreativeWork/DocumentObject']"));

public GoogleDocumentsPage createNewFile(){
    addNewDocButton.waitAndClick();
    return this;
}
public void verifyFile(){
    waitInSeconds(2);
    Assert.assertTrue(documentLabel.isPresent());
}
}

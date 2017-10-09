package pages;

import elements.Button;
import org.openqa.selenium.By;

public class SearchResultPage {
    private Button searchResultLink(String linkText) {
        return new Button(By.linkText((linkText)));

    }
   public HabrMainPage clickonSearchResultLink(String linkText) {
        searchResultLink(linkText).click();
        return new HabrMainPage();
   }
}

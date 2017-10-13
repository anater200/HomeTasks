package elements;

import org.openqa.selenium.By;

public class TextInput extends Element {
    public TextInput(By by) {
        super(by);
    }
    public void fillIn(String text) {
        composeWebElement(by).sendKeys(text);
    }
    public void clearFillIn(String text) {
        composeWebElement(by).clear();
        composeWebElement(by).sendKeys(text);
    }
}

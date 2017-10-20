package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Element {
    public Dropdown(By by) {
        super(by);

    }
    public void selectByValue(String value) {
        Select selector = new Select(composeWebElement(by));
        selector.selectByValue(value);
    }
    public void selectByIndex(int value) {
        Select selector = new Select(composeWebElement(by));
        selector.selectByIndex(value);
    }



}

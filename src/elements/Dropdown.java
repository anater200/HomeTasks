package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Element {
    public Dropdown(By by) {
        super(by);

    }
    public void select() {
        composeWebElement(by).click();


    }
}

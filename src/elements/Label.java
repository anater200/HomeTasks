package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static tests.Main.getDriver;

public class Label extends Element {
    public Label(By by) {
        super(by);
    }
    public void doubleClick(){
        Actions action = new Actions(getDriver());
        action.doubleClick(composeWebElement(by)).perform();
    }
    public void click(){
        composeWebElement(by).click();
    }

}


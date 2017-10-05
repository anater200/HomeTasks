package elements;

import org.openqa.selenium.*;

import static tests.Main.getDriver;

public  abstract class Element {

    protected By by;

    public Element(By by) {
        this.by = by;
    }

    protected static WebElement composeWebElement(By by){
        return getDriver().findElement(by);
    }

    public boolean isPresent() {
        try {
            try {
                composeWebElement(by).isDisplayed();
            } catch (NoSuchElementException e) {
                return false;
            }
        }catch (StaleElementReferenceException e){
            composeWebElement(by).isDisplayed();
        }
        return true;
    }
}

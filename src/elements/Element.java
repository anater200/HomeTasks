package elements;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

import static tests.Main.getDriver;

public  abstract class Element {

    protected By by;

    public Element(By by) {
        this.by = by;
    }

    protected static WebElement composeWebElement(By by) {
        return getDriver().findElement(by);
    }

    public boolean isPresent() {
        try {
            try {
                composeWebElement(by).isDisplayed();
            } catch (NoSuchElementException e) {
                return false;
            }
        } catch (StaleElementReferenceException e) {
            composeWebElement(by).isDisplayed();
        }
        return true;
    }

    public void waitAndClick() {
//        TestCase.setImplicitlyWait(0);
//        log.info("Attempt to wait until element found " + by + " will be appeared");
        new FluentWait(getDriver())
                .withTimeout(30000, TimeUnit.MILLISECONDS)
                .pollingEvery(200, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element found by " + by + " is still invisible, but should not be")
                .until(new Function<WebDriver, Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        try {
                            getDriver().findElement(by).click();
                            return true;
                        } catch (WebDriverException ignored) {
                        }
                        return false;
                    }
                });
    }
}

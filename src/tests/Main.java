package tests;

import conf.CaptureScreenShotOnFailureListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import pages.MainPage;

import java.awt.*;
import java.util.concurrent.TimeUnit;
@Listeners(CaptureScreenShotOnFailureListener.class)

public class Main {
    private static WebDriver driver;
    private String baseUrl = "https://www.google.com.ua/";
    private String baseUrl1 = "https://employees.dbbest.com/Users/TimeReport?id=62825020&own=520256";

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", Main.class.getResource("/drivers/chromedriver_2_32.exe").getFile());
        ChromeOptions options = new ChromeOptions();
        ChromeDriver chromeDriver = new ChromeDriver(options);
        driver = new EventFiringWebDriver(chromeDriver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        getDriver().get(baseUrl1);
        maximizeScreen(driver);
        MainPage mainPage = new MainPage();
        /*mainPage.openLoginForm()
                .login();
*/
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        stopDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }
    public static void stopDriver(){
        driver.quit();
    }

    public static void waitInSeconds(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void maximizeScreen(WebDriver driver) {
        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        org.openqa.selenium.Point position = new org.openqa.selenium.Point(0, 0);
        driver.manage().window().setPosition(position);
        org.openqa.selenium.Dimension maximizedScreenSize =
                new org.openqa.selenium.Dimension(screenSize.width, screenSize.height);
        driver.manage().window().setSize(maximizedScreenSize);
    }
}
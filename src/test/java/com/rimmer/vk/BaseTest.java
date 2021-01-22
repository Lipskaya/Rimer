package com.rimmer.vk;



import com.rimmer.vk.driver.Browser;
import com.rimmer.vk.util.TestListener;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners({TestListener.class})
public class BaseTest {
    private static Browser browser;

    @BeforeSuite//открывает браузер перед выполнением сценария
    public static void setup() {
        browser = Browser.getInstance();
    }

    @AfterSuite
    public static void tearDown() {

       // browser.stopBrowser();
    }
}

package com.rimmer.vk.page;

import com.rimmer.vk.driver.Browser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class BasePage {

    private Browser browser;
    private String url;
    private final Logger logger = LogManager.getRootLogger();
    private static final String SCROLL_SCRIPT = "arguments[0].scrollIntoView(true);";

    public BasePage(String url) {
        browser = Browser.getInstance();
        this.url = url;
    }

    // Ждет пока указанный элемент не появится на странице и не станет видимым (опрос элемента происходит в соответствии с настройками wait)
    public WebElement waitVisible(String xpathLocator) {
        WebElement el = browser.waitVisible(xpathLocator);
        return el;
    }


    public void openPage(){
        browser.open(url);
        logger.info("Page opened");
    }

    public void openNewTab(){
        //from here: https://sqa.stackexchange.com/questions/32756/how-to-open-two-separate-tabs-in-same-google-chrome-window-using-webdriver-and-j
        ((JavascriptExecutor)browser.getWrappedDriver()).executeScript("window.open()");
        //получаем в список все открытые вкладки в браузере
        ArrayList<String> tabs = new ArrayList<String>(browser.getWrappedDriver().getWindowHandles());
        browser.getWrappedDriver().switchTo().window(tabs.get(1));
    }
    public void changeTab(int tabNumber){
        ArrayList<String> tabs = new ArrayList<String>(browser.getWrappedDriver().getWindowHandles());
        browser.getWrappedDriver().switchTo().window(tabs.get(tabNumber));
    }
    public void scrollToElement(String xpathLocator){
        WebElement element = waitVisible(xpathLocator);
        ((JavascriptExecutor) browser.getWrappedDriver()).executeScript(SCROLL_SCRIPT, element);
    }
}

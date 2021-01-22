package com.rimmer.vk.page;

import com.rimmer.vk.driver.Browser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class VKPage extends BasePage{

    private final Logger logger = LogManager.getRootLogger();
    private Browser browser;

    private static final String VK_PAGE_URL = "https://vk.com/";
    private static final String VK_LOGIN_XPATH = "//input[@id='index_email']";
    private static final String VK_PASSWORD_XPATH = "//input[@id='index_pass']";
    private static final String VK_BUTTON_XPATH  = "//button[@id='index_login_button']";
    private static final String LOGIN = "/";
    private static final String PASSWORD = "/";
    private static final String SEARCH_XPATH = "//input[@id='ts_input']";

    private static final String TEXT = "Дизайн";
    private static final String PEOPLE_XPATH = "//a[@id='ui_rmenu_people']";
    private static final String REGION_XPATH = "//div[@id='region_filter']//td[@class='selector']";
    private static final String REGION_RUSSIA_XPATH = "//li[@title='Россия']";
    private static final String NEWS_XPATH = "//a[@id='ui_rmenu_news']";



    public VKPage() {
        super(VK_PAGE_URL);
        browser = Browser.getInstance();
        logger.info("Created VKPage" );
    }
    public void login(){
        waitVisible(VK_LOGIN_XPATH).sendKeys(LOGIN);
        waitVisible(VK_PASSWORD_XPATH).sendKeys(PASSWORD);
        waitVisible(VK_BUTTON_XPATH).click();
        waitVisible(NEWS_XPATH);
    }
    public void search(){
        waitVisible("//div[@class='TopSearch']").click();
        waitVisible(SEARCH_XPATH).sendKeys(TEXT);
        waitVisible(SEARCH_XPATH).sendKeys(Keys.ENTER);

        waitVisible(PEOPLE_XPATH).click();
        waitVisible(REGION_XPATH).click();
        waitVisible(REGION_RUSSIA_XPATH).click();


        //прокручивает страницу до уазанного element
        scrollToElement(REGION_XPATH);





    }

}

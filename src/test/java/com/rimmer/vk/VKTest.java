package com.rimmer.vk;

import com.rimmer.vk.page.VKPage;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class VKTest extends BaseTest {

    @Test
    void baseTest() {
        VKPage page = new VKPage();

        page.openPage();
        page.login();
        page.search();


//        page.closeCookiesDialog();
//        page.performSearch("Google Cloud Platform Pricing Calculator");
//        page.clickFirstSearchResult();
//        page.clickComputeEngine();
//        page.fillNumberOfInstances(4);
//
//        VirtualMachine vm = createVirtualMachine();
//
//        page.fillVirtualMachineParameters(vm);
//
//        page.fillCommitUsage(CommitUsage.ONE_YEAR);
//        page.tabAddToEstimate();
//
//        assertTrue(page.isVMClassCorrect());
//        assertTrue(page.isInstanceTypeCorrect());
//        assertTrue(page.isRegionCorrect());
//        assertTrue(page.islocalSSDCorrect());
//        assertTrue(page.isCommitMentTermCorrect());
//        assertTrue(page.isTotalEstimatedCostCorrect());
//        page.chooseEmailEstimate();
//        page.openNewTab();
//
//        TenMinuteEmailPage tenMinuteEmailPage = new TenMinuteEmailPage();
//        tenMinuteEmailPage.openPage();
//        String email = tenMinuteEmailPage.getCopyEmailAddress();
//        tenMinuteEmailPage.changeTab(googleCloudTab);
//
//        page.sendEmail(email);
//        tenMinuteEmailPage.changeTab(tenEmailTab);
//        tenMinuteEmailPage.openEmailWithTitle("Google Cloud Platform Price Estimate");
//        String emailPrice = tenMinuteEmailPage.getTotalPrice();
//
//        page.changeTab(googleCloudTab);
//        String calculatedPrice = page.getTotalPrice();
//
//        assertEquals(emailPrice, calculatedPrice);

    }
}

package test.mobile.score_qa_automation_challenge.page_objects;

import org.openqa.selenium.By;

public class Alert extends BasePage{

    By titleText = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/title_onboarding\"]");
    By continueBtn = By.xpath("//*[@text='Continue']");
    By maybeLater = By.xpath("//android.widget.TextView[@text='Maybe Later']");
    By popupDismissButton = By.id("com.fivemobile.thescore:id/dismiss_modal");

    public String getScreenTitle() {
        return getText(titleText);
    }

    public void makeItDone() {
        click(continueBtn);
        clickOnMaybeLater();
        handleAppDownloadPopUp();
    }
    public void clickOnMaybeLater() {
            if(isElementPresent(maybeLater)){
                click(maybeLater);
            }
    }
    public void handleAppDownloadPopUp(){
        if(isElementPresent(popupDismissButton)){
            click(popupDismissButton);
        }
    }
}

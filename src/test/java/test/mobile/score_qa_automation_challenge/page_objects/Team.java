package test.mobile.score_qa_automation_challenge.page_objects;

import org.openqa.selenium.By;


public class Team extends BasePage {

    By titleText = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/title_onboarding\"]");
    By chipsElements = By.xpath("//*[@resource-id='com.fivemobile.thescore:id/chips_container']//android.view.ViewGroup");

    By btnContinue = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/action_button_text\"]");

    By btnBack = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
    By maybeLater = By.xpath("//android.widget.TextView[@text='Maybe Later']");

    public String getScreenTitle() {
        return getText(titleText);
    }
   public void clickOnMaybeLater() {
       if(isElementPresent(maybeLater)){
           click(maybeLater);
       }
    }

    public void navigateBack() {
        click(btnBack);
    }

    public void selectTab(String leagueCode) {
        click(By.xpath("//android.widget.HorizontalScrollView[@id,'com.fivemobile.thescore:id/tabLayout']//android.widget.LinearLayout[@content-desc='"+leagueCode+"']"));
    }

    public void selectTeam(String teamName) {
        click(By.xpath("//android.widget.TextView[contains(@text,'"+teamName+"')]"));
    }

    public boolean isTeamSelected(String teamName) {
        return isElementPresent(By.xpath("//*[@resource-id='com.fivemobile.thescore:id/chips_container']//android.widget.TextView[contains(@text,'"+teamName+"')]"));
    }

    public int getTotalTeamSelected() {
        return getTotalMatchedNoOfElements(chipsElements) - 1;
    }

    public void continueNext() {
        click(btnContinue);
    }
}

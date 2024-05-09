package test.mobile.score_qa_automation_challenge.page_objects;
import org.openqa.selenium.By;

public class Home extends BasePage {
	By continueButton = By.xpath("//android.widget.TextView[@text='Get Started']");

	public void goToLeagueSelectionPage() {
		click(continueButton);
	}

	public boolean isHomeScreen() {
		return isElementPresent(continueButton);
	}

}

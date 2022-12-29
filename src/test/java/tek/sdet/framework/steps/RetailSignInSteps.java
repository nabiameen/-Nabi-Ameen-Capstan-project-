 package tek.sdet.framework.steps;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.RetailSignInPage;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailSignInSteps extends CommonUtility {

	RetailSignInPage SignInObj = new RetailSignInPage();

	@Given("User is on retail website")
	public void user_is_on_retail_website() {
		String ActualPageTitile = getTitle();
		String Expected = "React App";
		if (ActualPageTitile.equals(Expected))
			System.out.println(ActualPageTitile);
	}

	@When("User click on Sign in option")
	public void user_click_on_sign_in_option() {
		SignInObj.signinpage.click();

	}

	@And("User enter email {string} and password {string}")
	public void user_enter_email_and_password(String emailData, String PasswordData) {
		SignInObj.emailField.sendKeys(emailData);
		SignInObj.passwordField.sendKeys(PasswordData);
	}

	@And("User click on login button")
	public void user_click_on_login_button() {
		SignInObj.loginBtton.click();

	}
		
	@Then("User should be logged in into Account")
	public boolean user_should_be_logged_in_into_account() {
		if (SignInObj.LogInveryFaction.isDisplayed())
			return true;
		else
			return false;
	}
	
	@And("User click on Create New Account button")
	public void user_click_on_create_new_account_button() throws InterruptedException {
		SignInObj.newAccountBtn.click();
		Thread.sleep(5000);

	}
	@And("User fill the signUp information with below data")
	public void user_fill_the_sign_up_information_with_below_data(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		List<List<String>> data = dataTable.asLists(String.class);
		SignInObj.nameinput.sendKeys(data.get(0).get(0));
		SignInObj.emailinput.sendKeys(data.get(1).get(1));
		SignInObj.passwordinput.sendKeys(data.get(1).get(2));
		SignInObj.confirmPasswordInput.sendKeys(data.get(1).get(3));
		Thread.sleep(5000);

	}

	@And("User click on SignUp button")
	public void user_click_on_sign_up_button() {
		SignInObj.signupBtn.click();

	}
	
	@Then("User should be logged into account page")
	public boolean user_should_be_logged_into_account_page() {
		if (SignInObj.ProfileVerification.isDisplayed())

			return true;
		else
			return false;

	}
	






}

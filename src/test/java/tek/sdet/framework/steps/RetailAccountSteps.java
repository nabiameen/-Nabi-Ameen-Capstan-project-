package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.pages.RetailAccountPage;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void User_Click_on_Account_option() {
		click(factory.accountpage().accountlink);
		logger.info("User click on Account option");
	}

	@And("User update Name {string} and Phone {string}")
	public void UserUpdateNameAndPhone(String name, String phone) {
		factory.accountpage().nameInput.clear();
		sendText(factory.accountpage().nameInput, name);
		factory.accountpage().phoneInput.clear();
		sendText(factory.accountpage().phoneInput, phone);
		logger.info("User update his name and phone number");

	}

	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountpage().updateBtn);
		logger.info("user click on update button");
	}

	@Then("user profile information should be updated")
	public void UserProfileInformationShouldBeUpdate() {
		String expectedText = "Personal Information Updated Successfully";
		String actualText = getElementText(factory.accountpage().msgalert);
		Assert.assertEquals(expectedText, actualText);
		logger.info("alert is displayed");
	}

	@And("User enter below information")
	public void UserEnterBelowInformation(DataTable data) {
		List<Map<String, String>> account = data.asMaps(String.class, String.class);
		sendText(factory.accountpage().previousPasswordInput, account.get(0).get("Previous Password"));
		sendText(factory.accountpage().newpasswordInput, account.get(0).get("New Password"));
		sendText(factory.accountpage().confirmpasswordInput, account.get(0).get("Confirm Password"));
		logger.info("User change his previous password");
	}

	@And("User click on Change Password button")
	public void UserClickOnChangePasswordButton() {
		click(factory.accountpage().changepassword);
		logger.info("User click on Change Password button");
	}

	@Then("a message should be displayed")
	public void a_message_should_be_displayed () {
		String expectedText = "Password Updated Successfully";
		String actualText = getElementText(factory.accountpage().confirmPassword);
		Assert.assertEquals(expectedText, actualText);
		logger.info("Password Updated Successfully");
	}
	
	@And("User click on Add a payment method link")
	public void user_click_on_add_a_payment_method_link() {
		click(factory.accountpage().accountlink);
	   logger.info("User click on Add a payment method link");
	}

	@And("User fill Debit or credit card information")
	public void user_fill_debit_or_credit_card_information(DataTable data) {
		List<Map<String, String>> AddCard = data.asMaps(String.class, String.class);
		sendText(factory.accountpage().CardNumber, AddCard.get(0).get("cardNumber"));
		sendText(factory.accountpage().NameOnCard, AddCard.get(0).get("nameOnCard"));
		sendText(factory.accountpage().MonthExpiration, AddCard.get(0).get("expirationMonth"));
		sendText(factory.accountpage().YearExpiration, AddCard.get(0).get("expirationYear"));
		sendText(factory.accountpage().SecurityCode, AddCard.get(0).get("securityCode"));
		logger.info("User fill Debit or credit card information");
	}

	@And("User click on Add your card button")
	public void user_click_on_add_your_card_button() {
	 click(factory.accountpage().SubmitBtn);
	 logger.info("User click on Add your card button");
	    
	}
	
	@Then("message should be displayed")
	public void MessageShouldBeDisplayed() {
		String expectedText = "Payment Method added sucessfully";
		String actualText = getElementText(factory.accountpage().MassegeDisplayed);
		Assert.assertEquals(expectedText, actualText);
		logger.info("Payment Method added sucessfully");
	}
	
	@And ("user click on master card link")
	public void  user_click_on_master_card_link() {
		click(factory.accountpage().MasterCardLink);
	}
      
	@And ("User click on Edit option of card section")
	public void User_click_on_Edit_option_of_card_section() {
	click(factory.accountpage().EditOption);
	logger.info("User click on Edit option of card section");
	}
	@And ("user edit information with below data")
	public void  user_edit_information_with_below_data(DataTable data) {
		List<Map<String, String>> EditCard = data.asMaps(String.class, String.class);
		factory.accountpage().EditCardNumber.clear();
		sendText(factory.accountpage().EditCardNumber, EditCard.get(0).get("cardNumber"));
		factory.accountpage().EditName.clear();
		sendText(factory.accountpage().EditName, EditCard.get(0).get("nameOnCard"));
		sendText(factory.accountpage().MonthExpiration, EditCard.get(0).get("expirationMonth"));
		sendText(factory.accountpage().YearExpiration, EditCard.get(0).get("expirationYear"));
		factory.accountpage().SecurityCode.clear();
		sendText(factory.accountpage().SecurityCode, EditCard.get(0).get("securityCode"));
		
	}
	@And ("user click on Update Your Card button")
	public void user_click_on_Update_Your_Card_button() {
	click(factory.accountpage().UpdateCard);
	logger.info("user click on Update Your Card button");
	}
	
	@Then ("an message should be displayed")
	public void an_message_should_be_displayed() {
		String expectedText="Payment Method updated Successfully";
		String actualText= getElementText(factory.accountpage().EditSucessfully);
		Assert.assertEquals(expectedText, actualText);
		logger.info("Payment Method updated Successfully");
	}
	@And ("User click on master card link")
	public void User_click_on_master_card_link() {
		click(factory.accountpage().MSTCardLink);
	}
	
	@And ("User click on remove option of card section")
	public void  User_click_on_remove_option_of_card_section() {
		click(factory.accountpage().RemoveCard);
		logger.info("User click on remove option of card section");
	}
	
	//REMOVE STEPS
	@Then ("payment details should be removed")
	public void  payment_details_should_be_removed() {
		isElementSelected(factory.accountpage().RemoveCardValidation);
		
	}	
	
	@And ("User click on Add address option")
	public void User_click_on_Add_address_option() {
		click(factory.accountpage().AddNewAddress);
	}
	
	@And ("user fill new address form with below information")
	public void user_fill_new_address_form_with_below_information(DataTable data) {
		List<Map<String, String>> Address = data.asMaps(String.class, String.class);
		factory.accountpage().EditName.clear();
		sendText(factory.accountpage().Country, Address.get(0).get("country"));
		sendText(factory.accountpage().fullName, Address.get(0).get("fullName"));
		sendText(factory.accountpage().phoneNumber, Address.get(0).get("phoneNumber"));
		sendText(factory.accountpage().StreetAddress, Address.get(0).get("streetAddress"));
		sendText(factory.accountpage().Apartment, Address.get(0).get("apt"));
		sendText(factory.accountpage().City, Address.get(0).get("city"));
		sendText(factory.accountpage().State, Address.get(0).get("state"));
		sendText(factory.accountpage().ZipCode, Address.get(0).get("zipCode"));
		logger.info("user filled new address form with below information");
	}
	
	@And ("User click Add Your Address button")
	public void User_click_Add_Your_Address_button() {
		click(factory.accountpage().AddAddress);
		logger.info("User click Add Your Address button");
	}
	@Then ("address added message should be displayed")
	public void address_added_message_should_be_displayed() {
		String expectedText="Address Added Successfully";
		String actualText= getElementText(factory.accountpage().AddressAddedVerfacation);
		Assert.assertEquals(expectedText, actualText);
		logger.info("Address Added Successfully");
	}
	//EDITNEWADDRESS
	
	@And ("User click on edit address option")
	public void User_click_on_edit_address_option() {
		click(factory.accountpage().EditAddress);
	}
	
	@And ("user fill edit new address form with below information")
	public void user_fill_edit_new_address_form_with_below_information(DataTable data) {
		List<Map<String, String>> EditAddress = data.asMaps(String.class, String.class);
		sendText(factory.accountpage().Country, EditAddress.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountpage().fullName);
		sendText(factory.accountpage().fullName, EditAddress.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountpage().phoneNumber);
		sendText(factory.accountpage().phoneNumber, EditAddress.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountpage().StreetAddress);
		sendText(factory.accountpage().StreetAddress, EditAddress.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountpage().Apartment);
		sendText(factory.accountpage().Apartment, EditAddress.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountpage().City);
		sendText(factory.accountpage().City, EditAddress.get(0).get("city"));
		sendText(factory.accountpage().State, EditAddress.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountpage().ZipCode);
		sendText(factory.accountpage().ZipCode, EditAddress.get(0).get("zipCode"));
		logger.info("user fill edit new address form with below information");
	}
	
	@And ("User click update Your Address button")
	public void User_click_update_Your_Address_button() {
		click(factory.accountpage().EditNewAddress);
	}
	
	@Then ("edit message should be displayed")
	public void edit_message_should_be_displayed() {
		String expectedText="Address Updated Successfully";
		String actualText=getElementText(factory.accountpage().AddressUpdatedSuccessfully);
		Assert.assertEquals(expectedText,actualText);
		logger.info("AddressUpdatedSuccessfully");
		
}
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	  click(factory.accountpage().RemoveNewAddress);
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	 isElementSelected(factory.accountpage().RemoveNewAddress);  
	}
	
	
}

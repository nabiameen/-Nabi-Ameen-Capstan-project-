package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
	
	
	@Then("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.homePage().ordersOption);
		logger.info("user clicked on Orders Section");

	}

	@Then("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderpage().firstOrderItem);
		logger.info("user clicked on first order in list");

	}

	@Then("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderpage().cancelButton);
		logger.info("user clicked on Cancel The Order button");

	}

	@Then("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String reason) {
		selectByVisibleText(factory.orderpage().cancelationReasonDropDown, reason);
		logger.info("user selected the cancelation Reason " + reason);

	}

	@Then("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderpage().CancelOrderButton);
		logger.info("User clicked on Cancel Order Button");

	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String expectedMessage) {
		if (expectedMessage.contains("Your Order Has Been Cancelled")) {
			Assert.assertEquals(expectedMessage, factory.orderpage().yourOrderHasBeenCancelledMessage.getText());
			logger.info("a cancelation messge displayed " + expectedMessage);
		} else if (expectedMessage.contains("Return was successful")) {
			Assert.assertEquals(expectedMessage, factory.orderpage().returnWasSuccessfullMessage.getText());
			logger.info("a cancelation messge displayed " + expectedMessage);
		}
	}

	@Then("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderpage().returnItemButton);
		logger.info("user clicked on Return Items Button");

	}

	@Then("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String reason) {
		selectByVisibleText(factory.orderpage().cancelationReasonDropDown, reason);
		logger.info("user selected the cancelation Reason " + reason);

	}

	@Then("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropOffLocation) {
		selectByVisibleText(factory.orderpage().dropOffDropDown, dropOffLocation);
		logger.info("User select the drop off service" + dropOffLocation);
	}

	@Then("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderpage().CancelOrderButton);
		logger.info("User click on Return Order button");

	}

	@Then("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderpage().reviewButton);
		logger.info("user click on Review Button");

	}
	@Then("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String body) {
		sendText(factory.orderpage().reviewHeadlineInput, headline);
		sendText(factory.orderpage().reviewDescriptionInput, body);
		logger.info("user wrote review on product");

	}
	@Then("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderpage().reviewSubmitButton);
		logger.info("user clicked add your review button");

	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String expected) {
		waitTillPresence(factory.orderpage().yourReviewWasAddedSuccessfullyMessage);
		Assert.assertEquals(factory.orderpage().yourReviewWasAddedSuccessfullyMessage.getText(), expected);
		logger.info("a review message displayed");

	}	
	
	
	
	
	}


		
		


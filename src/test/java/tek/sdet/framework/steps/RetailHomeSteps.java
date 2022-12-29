package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility {
		POMFactory factory = new POMFactory();
		
	
       @When("User click on All section")
      public void userClickOnAllSection() {
       click(factory.homePage().AllDepartement);
     }
     @Then("below options are present in Shop by Department sidebar")
     public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable data) {
	List<Map<String, String>> Alldepartment = data.asMaps(String.class, String.class);
	sendText(factory.homePage().AllDepartement,Alldepartment.get(0).get("Electronics"));
	sendText(factory.homePage().AllDepartement,Alldepartment.get(1).get("Computers"));
	sendText(factory.homePage().AllDepartement,Alldepartment.get(2).get("Smart Home"));
	sendText(factory.homePage().AllDepartement,Alldepartment.get(3).get("Sports"));
	sendText(factory.homePage().AllDepartement,Alldepartment.get(0).get("Automative"));
	logger.info("below options are present in Shop by Department sidebar");
     }
	@When("User on {string}")
	public void userOnElectronics(String department) {
	 List<WebElement> depe = factory.homePage().sidebare;
	 for(WebElement element : depe) {
		 if(element.getText().equals(department)){
			 element.click();
			 break;
		 }
	 }
	}
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
	 List<List<String>> departmentoption = dataTable.asLists(String.class);
	 List<WebElement> depe = factory.homePage().sidebare;
	 for(int i =0;i< departmentoption.get(0).size();i++){
		 for(WebElement element : depe) {
		 	 
		 if(element.getText().equals(departmentoption.get(0).get(i))) {
		 Assert.assertTrue(element.isDisplayed());
	 }
	 }
	}}
     
     @When("User change the category to {string}")
     public void userChangeTheCategoryTo(String smartHome) {
        selectByVisibleText(factory.homePage().AllDepartement, smartHome);
        logger.info("User change the category");
     }
     @When("User search for an item {string}")
     public void userSearchForAnItem(String string) {
         sendText(factory.homePage().Searchoption, string);
         logger.info("User search for an item");
     }
     @When("User click on Search icon")
     public void userClickOnSearchIcon() {
    click(factory.homePage().SearchButton);
    logger.info("User click on Search icon");
     }
     @When("User click on item")
     public void userClickOnItem() {
   click(factory.homePage().KasaPlug);
   logger.info("User click on item");
     }
     @When("User select quantity {string}")
     public void userSelectQuantity(String string) {
    selectByVisibleText(factory.homePage().Quentity,string);
    logger.info("User select 2 Quantity");
     }
     @When("User click add to Cart button")
     public void userClickAddToCartButton() {
    click(factory.homePage().AddCart);
    logger.info("User click add to Cart button");
     }
     @Then("cart icon quantity should change to {string}")
     public void theCartIconQuantityShouldChangeTo(String string) {
     Assert.assertEquals(factory.homePage().CartQty.getText(),string);
     logger.info("the card icon changed");
     }
     @Then("User click on Cart option")
     public void userClickOnCartOption() {
    	 factory.homePage().CartBotton.click();
       logger.info("User Click Card Button");
     }
     @Then("User click on Proceed to Checkout button")
     public void userClickOnProceedToCheckoutButton() {
    	 click(factory.homePage().ProcedButton);
         logger.info("User click on Proceed to Checkout button");
     }
     @Then("User click Add a new address link for shipping address")
     public void userClickAddANewAddressLinkForShippingAddress() {
    	 click(factory.homePage().NewShippingAddress);
         logger.info("User click new shipping address");
     }
     @Then("User fill new address form with below information")
     public void userFillNewAddressFormWithBelowInformation(DataTable data) {
    	 List<Map<String,String>> address = data.asMaps(String.class,String.class);
         selectByVisibleText(factory.homePage().Country,"United States");
         sendText(factory.homePage().FullName,address.get(0).get("fullName"));
         sendText(factory.homePage().phoneNumber,address.get(0).get("phoneNumber"));
         sendText(factory.homePage().StreetAddress,address.get(0).get("streetAddress"));
         sendText(factory.homePage().Apartment,address.get(0).get("apt"));
         sendText(factory.homePage().City,address.get(0).get("city"));
         selectByValue(factory.homePage().State,"California");
         sendText(factory.homePage().ZipCode,address.get(0).get("zipCode"));
         logger.info("user filled in address information");
     }
     @Then("User click Add a credit card or Debit Card for Payment method")
     public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
    	 click(factory.homePage().PayMentMethode);
      	 logger.info("User click Add a credit card or Debit Card for Payment method");
     }
     @And("The User fill Debit or credit card information")
         public void UserFillDebitOrCreditCardInformation(DataTable data) {
    	 List<Map<String, String>> card = data.asMaps(String.class, String.class);
         sendText(factory.homePage().CardNumber, card.get(0).get("cardNumber"));
         sendText(factory.homePage().NameOnCard, card.get(0).get("nameOnCard"));
         selectByVisibleText(factory.homePage().YearExpirationinput,card.get(0).get("expirationYear"));
         selectByVisibleText(factory.homePage().MonthExpirationinput, card.get(0).get("expirationMonth"));
         sendText(factory.homePage().SecurityCode,card.get(0).get("securityCode"));
         logger.info("user entered credit card information");
     }
     @Then("User click on Place Your Order")
     public void userClickOnPlaceYourOrder() {
        click(factory.homePage().OrderPlaced);
     }
     @Then("User Shuold see Order Placed Thanks message")
     public void User_Shuold_see_Order_Placed_Thanks_message() {
    String expectedText="Order Placed, Thanks";
    String actualText=factory.homePage().MassegeDisplayed.getText();
    Assert.assertEquals(expectedText, actualText); 
     }
     @And ("The User change the category to {string}")
     public void TheUserChangeTheCategoryTo(String Electronics) {
    	 selectByVisibleText(factory.homePage().AllDepartement, Electronics);
     	logger.info("User Change The Category");
     }
     @And ("The User click on Search icon")
     public void TheUserClickOnSearchIcon() {
    	 click(factory.homePage().SearchButton);
    	 logger.info("User click on Search Icon");
     }
     @And("The User click on item")
      public void userclickonitem() { 
    	click(factory.homePage().ApexLengends);
    	logger.info("User click on Vedio Game");
    }
     @Then("a message should be displayed {string}")
      public void aMessageShouldBeDisplayed(String string) {
         String expectedText="Order Placed, Thanks";
         String actualText=factory.homePage().MassegeDisplayed.getText();
         Assert.assertEquals(expectedText, actualText);
         logger.info("Massege Displayed");
       }
	
	
       
       
}

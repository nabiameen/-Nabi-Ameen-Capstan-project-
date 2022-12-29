package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{

	  public RetailHomePage() {
	        PageFactory.initElements(getDriver(), this);
	    }
	  
	 
	  @FindBy(id="signinLink")
	  private WebElement signinpage;
	  	  	  
	  @FindBy(id="search")
      public WebElement AllDepartement;
	  
	  @FindBy(xpath="//div[@class='sidebar_content-item']/span")
	  public List<WebElement> sidebare;
      
      @FindBy(xpath="(//select[@class='search__select'])//option[4]")
      public WebElement smarthome;

      @FindBy(id="searchInput")
      public WebElement Searchoption;
      
      @FindBy(xpath="//p[contains(text(),'Plugs and Outlets')]")
      public WebElement PlugsAndOutlets;
      
      @FindBy(xpath="//p[contains(text(),'Kasa Outdoor Smart Plug')]")
      public WebElement KasaPlug;
      
      @FindBy(id="searchBtn")
      public WebElement SearchButton;
      
      @FindBy(xpath="//select[@class='product__select']")
      public WebElement Quentity;
      
      @FindBy(id="cartQuantity")
      public  WebElement CartQty;

      @FindBy(xpath="//span[contains(text(),'Add to Cart')]")
      public WebElement AddCart;
      
     @FindBy(xpath="//p[@class='product__cart-exists']")
      public WebElement iteminTheCart;
      
      @FindBy(id="cartBtn")
      public WebElement CartBotton;
      
      @FindBy(id="proceedBtn")
      public WebElement ProcedButton;
      
      @FindBy(id="addAddressBtn")
      public WebElement NewShippingAddress;
      
      //SHIPPING ADDRESS/////
      
     @FindBy(id="countryDropdown")
      public WebElement Country;
//      
      @FindBy(id="fullNameInput")
      public  WebElement FullName;
//      
      @FindBy(id="phoneNumberInput")
      public WebElement phoneNumber;
      
      @FindBy(id="streetInput")
      public WebElement StreetAddress;
      
      @FindBy(id="apartmentInput")
      public WebElement Apartment;
      
      @FindBy(xpath="//input[@name='city']")
      public WebElement City;
      
      @FindBy(xpath="//select[@name='state']")
      public WebElement State;
      
      @FindBy(id="zipCodeInput")
      public WebElement ZipCode;
      
      @FindBy(id="addressBtn")
      public WebElement ShippinAddress;
      
      //CARD METHODE////
      
      @FindBy(id="addPaymentBtn")
      public WebElement PayMentMethode;
      
      @FindBy(id="cardNumberInput")
      public WebElement CardNumber;
      
      @FindBy(id="nameOnCardInput")
      public WebElement NameOnCard;
      
      @FindBy(id="expirationMonthInput")
      public WebElement MonthExpirationinput;
      
      @FindBy(xpath="//select[@id='expirationYearInput']")
      public WebElement YearExpirationinput;
      
      @FindBy(id="securityCodeInput")
      public WebElement SecurityCode;
      
      @FindBy(id="paymentSubmitBtn")
      public WebElement SubmitBtn;
      
      @FindBy(id="placeOrderBtn")
      public WebElement OrderPlaced;
      
      @FindBy(xpath = "//p[contains(text(),'Order Placed, Thanks')]")
      public WebElement MassegeDisplayed;
      
    ////  ORDER OPTIONS  ////
      
      @FindBy(xpath="//select[@id='search']")
      public WebElement Electrinic;
      
      @FindBy(id="searchBtn")
      public WebElement SearchIcon;
      
      @FindBy(xpath="//p[contains(text(),'Video Games')]")
      public WebElement VedioGame;
      
      @FindBy(xpath ="//p[contains(text(),'Apex Legends - 1,000 Apex Coins')]")
      public WebElement ApexLengends;
      
      @FindBy(xpath="//input[@id='searchInput']")
      public WebElement SearchInput;
      
      @FindBy(id="orderLink")
  	public WebElement ordersOption;
      
}
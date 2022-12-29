package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage  extends BaseSetup{
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	 
		
		@FindBy(id="accountLink")
		public WebElement accountlink;
		
		@FindBy(id="nameInput")
		public WebElement nameInput;
		
		@FindBy(id="personalPhoneInput")
		public WebElement phoneInput;
		
				//update
		
		@FindBy(id="personalUpdateBtn")
		public WebElement updateBtn;
		
		@FindBy(xpath="//div[contains(text(),'Personal Information Updated Successfully')]")
		public WebElement msgalert;
		
        @FindBy(id="previousPasswordInput")
        public WebElement previousPasswordInput;
        
        @FindBy(id="newPasswordInput")
        public WebElement newpasswordInput;
        
        @FindBy(id="confirmPasswordInput")
        public WebElement confirmpasswordInput;
        
        @FindBy(id="credentialsSubmitBtn")
        public WebElement changepassword;
        
        @FindBy(id="waiTillpresence")
        public WebElement waiTillpresence;
        
        @FindBy(xpath="//div[contains(text(),'Password Updated Successfully')]")
        public WebElement confirmPassword;
        
        // Add Payment  Methode
        
        @FindBy(xpath="//p[contains(text(),'Add a payment method')")
        public WebElement AddPaymentMethode;
	
        @FindBy(id="cardNumberInput")
        public WebElement CardNumber;
        
        @FindBy(id="nameOnCardInput")
        public WebElement NameOnCard;
        
        @FindBy(id="expirationMonthInput")
        public WebElement MonthExpiration;
        
        @FindBy(id="expirationYearInput")
        public WebElement YearExpiration;
        
        @FindBy(id="securityCodeInput")
        public WebElement SecurityCode;
        
        @FindBy(id="paymentSubmitBtn")
        public WebElement SubmitBtn;
        
        @FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
        public WebElement MassegeDisplayed;
           // EDIT OPTION
        @FindBy(xpath="//p[@class='account__payment-sub-title']")
        public WebElement MasterCardLink;
        
        @FindBy(xpath="//button[@class='text-blue-800 cursor-pointer hover:underline']")
        public WebElement EditOption;
        
        @FindBy(xpath="//input[@id='cardNumberInput']")
        public WebElement EditCardNumber;
        
        @FindBy(id="nameOnCardInput")
        public WebElement EditName;
        
        @FindBy(xpath="//select[@name='expirationMonth']")
        public WebElement expirationMonth;
        
        @FindBy(xpath="//select[@class='account__payment-new-select']")
        public WebElement ExpirationYear;
        
        @FindBy(xpath="//input[@id='securityCodeInput']")
        public WebElement EditSecurityCode;
        
        @FindBy(id="paymentSubmitBtn")
        public WebElement UpdateCard;
        
        @FindBy(xpath="//div[contains(text(),'Payment Method updated Successfully')]")
        public  WebElement EditSucessfully;
        
        @FindBy(xpath="//p[contains(text(),'Master Card')]")
        public WebElement MSTCardLink;
        
        @FindBy(xpath="//button[contains(text(),'remove')]")
        public WebElement RemoveCard;
        
        
        @FindBy(xpath="//p[@class='account__payment__sub-text']")
        public WebElement RemoveCardValidation;
       // Add ADDRESS
        
        @FindBy(xpath="//p[contains(text(),'Add Address')]")
        public WebElement AddNewAddress;
        
        @FindBy(id="countryDropdown")
        public WebElement Country;
        
        @FindBy(xpath="//input[@name='fullName']")
        public  WebElement fullName;
        
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
        public WebElement AddAddress;
        
        @FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]")
        public WebElement AddressAddedVerfacation;
        ///EDIT NEW ADDRESS
        
        @FindBy(xpath="//button[contains(text(),'Edit')]")
        public WebElement EditAddress;
        
        @FindBy(id="addressBtn")
        public WebElement EditNewAddress;
         
        @FindBy(xpath="//div[contains(text(),'Address Updated Successfully')]")
        public WebElement AddressUpdatedSuccessfully;
        
       // REMOVE NEW ADDRESS
        
        @FindBy(xpath="//button[contains(text(),'Remove')]")
        public WebElement RemoveNewAddress;
        
        
        
        
        
        
        
}



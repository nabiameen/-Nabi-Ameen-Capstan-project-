package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(id = "signinLink")
	public WebElement signinpage;
	
	@FindBy(id = "email")
	public WebElement emailField;

	@FindBy(id = "password")
	public WebElement passwordField;

	@FindBy(id = "loginBtn")
	public WebElement loginBtton;

	@FindBy(id = "newAccountBtn")
	public WebElement newAccountButton;

	@FindBy(id = "loginBtn")
	public WebElement LogInveryFaction;
	@FindBy(xpath  = "//a[@id='newAccountBtn']")
	public WebElement newAccountBtn;
	
	@FindBy(id="nameInput")
	public WebElement nameinput;
	
	@FindBy(id="emailInput")
	public WebElement emailinput;
	
	@FindBy(id="passwordInput")
	public WebElement passwordinput;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(xpath = "//button[@id='signupBtn']")
	public WebElement signupBtn;
	
	@FindBy(xpath = "//h1[contains(text(),'Your Profile')]")
	public WebElement ProfileVerification;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

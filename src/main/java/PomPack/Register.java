package PomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	@FindBy(xpath = "//li[@class='dropdown open']")
	private WebElement myAccountDropdown ;
	
	@FindBy(xpath = "//a[contains(@href, 'Register')]")
	private WebElement RegosterLink;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephone;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement passwordConfirm;
	
	@FindBy(xpath = "//input[@value='0']")
	private WebElement newsletterRadioBtn;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement privacyPolicyBtn;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;
	
	public Register(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clkMyAccountDropdown() {
		myAccountDropdown.click();
	}
	public void enterPassword() {
		password.sendKeys("pass1234");
	}
	public void clickLoginButton() {
		button.click();
	}
	

}

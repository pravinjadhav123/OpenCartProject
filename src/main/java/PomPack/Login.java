package PomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username ;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@class='button']")
	private WebElement button;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName() {
		username.sendKeys("pravin_jadhav");
	}
	public void enterPassword() {
		password.sendKeys("pass1234");
	}
	public void clickLoginButton() {
		button.click();
	}
	
	

}

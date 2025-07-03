package TestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomPack.Login;
import TestPack.BaseClass.BaseClass;
import TestPack.Util.Utility_Class;

public class LoginTest extends BaseClass {

	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		driver = launchChromeDriver();
		driver.get(Utility_Class.getPropertiesData("URL"));
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Login login = new Login(driver);
		login.enterUserName();
		login.enterPassword();
		login.clickLoginButton();
		
	}
	@Test
	public void verifyUrl() {	
		
		Utility_Class.verifyUrl(driver, "https://parabank.parasoft.com/parabank/overview.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	@Test
	public void verifyTitle() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String actualtitle = driver.getTitle();
		String expectedtitle = " ";
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("Second Assertion Verified" + expectedtitle);
	}
	
	@AfterMethod
	public void closwBrowser() throws InterruptedException {
		driver.wait(3000);
		driver.close();
	}
	

}

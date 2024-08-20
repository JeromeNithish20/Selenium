package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectsModel.SupplierPage;

public class TC02_LoginAsSupplier {

	WebDriver driver;
	String user = "noel_clancy2@arnotts.com.phuat";
	String pass = "Tcs@12345";
	@BeforeTest
	void setup() {
		driver =new ChromeDriver();
		driver.get("https://woolworths--phuat.sandbox.my.site.com/s/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	void testLoginSupplier() {
		SupplierPage sp = new SupplierPage(driver);
		sp.clickLogin1();
		sp.enterUsername(user);
		sp.enterPassword(pass);
		sp.clickLogin2();
	}
}

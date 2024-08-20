package pageObjectsModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupplierPage extends BasePage {

	public SupplierPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@class='login']")
	WebElement btn_login1;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txt_username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement btn_login2;

	public void clickLogin1() {
		btn_login1.click();
	}

	public void enterUsername(String user) {
		txt_username.sendKeys(user);
	}

	public void enterPassword(String pass) {
		txt_password.sendKeys(pass);
	}

	public void clickLogin2() {
       btn_login2.click();
	}
}

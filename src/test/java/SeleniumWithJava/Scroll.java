package SeleniumWithJava;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://rahulshettyacademy.com/AutomationPractice/");     
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,600)");
       Thread.sleep(3000);
       js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,100)");
	}

}

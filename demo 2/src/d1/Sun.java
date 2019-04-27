package d1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;





public class Sun {
	@Test
	public static void main() {
		System.setProperty("webdriver.chrome.driver","H:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.co.in");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("fb");
	    element.submit();
		
       
		System.out.println("Hello ");
		
		
	}

		
	


}

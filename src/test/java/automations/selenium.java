package automations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium {
//hi
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.driver", "C:\\Users\\91949\\Downloads\\chromedriver.exe");
		WebDriverManager .chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://www.hyrtutorials.com/p/basic-controls.html");
		d.findElement(By.id("firstName")).sendKeys("reddy");
		d.findElement(By.id("lastName")).sendKeys("redd6y");
		//d.findElement(By.id("femalerb")
		
		d.findElement(By.id("femalerb")).isEnabled();
		//d.findElement(By.id("femalerb")).click();
		d.findElement(By.id("femalerb")).isDisplayed();
		
		Thread.sleep(5000);
		
		//d.close();
		//d.quit();
	}
	

}

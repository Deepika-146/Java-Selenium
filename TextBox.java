package TextBoxDEMOQA;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBox {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Boolean displayname=driver.findElement(By.id("userName-label")).isDisplayed();
		System.out.println(displayname);
		Boolean displayemail=driver.findElement(By.id("userEmail-label")).isDisplayed();
		System.out.println(displayemail);
		Boolean displayaddress=driver.findElement(By.id("currentAddress-label")).isDisplayed();
		System.out.println(displayaddress);
		Boolean displayPaddress=driver.findElement(By.id("permanentAddress-label")).isDisplayed();
		System.out.println(displayPaddress);
		Boolean displaysubmit=driver.findElement(By.id("submit")).isDisplayed();
		System.out.println(displaysubmit);
		driver.findElement(By.id("userName")).sendKeys("Name");
		driver.findElement(By.id("userEmail")).sendKeys("abc@example.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Address");
		driver.findElement(By.id("permanentAddress")).sendKeys("PA");
	    driver.findElement(By.id("submit")).click();
	    JavascriptExecutor jse = (JavascriptExecutor)driver; // to scroll page
	    String output=driver.findElement(By.id("output")).getText();
	    System.out.println(output);
	    driver.quit();
	}

}

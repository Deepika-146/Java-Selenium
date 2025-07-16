package DEMOQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxUsingLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Boolean displaystatusname=driver.findElement(By.id("userName-label")).isDisplayed();
		System.out.println(displaystatusname);
		driver.findElement(By.id("userName")).sendKeys("Name");
		Boolean displaystatusemail=driver.findElement(By.id("userEmail-label")).isDisplayed();
		System.out.println(displaystatusemail);
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		Boolean displaystatusaddress=driver.findElement(By.id("currentAddress-label")).isDisplayed();
		System.out.println(displaystatusaddress);
		driver.findElement(By.id("currentAddress")).sendKeys("ABC");
		Boolean displaystatuspa=driver.findElement(By.id("permanentAddress-label")).isDisplayed();
		System.out.println(displaystatuspa);
		driver.findElement(By.id("permanentAddress")).sendKeys("ABC");
		JavascriptExecutor jse = (JavascriptExecutor)driver; // to scroll page
		driver.findElement(By.id("submit")).click();
		String output=driver.findElement(By.id("output")).getText();
		System.out.println(output);
		driver.quit();
	}

}

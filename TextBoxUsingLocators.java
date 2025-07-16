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
		driver.findElement(By.id("userName-label")).isDisplayed();
		driver.findElement(By.id("userName")).sendKeys("Name");
		driver.findElement(By.id("userEmail-label")).isDisplayed();
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("currentAddress-label")).isDisplayed();
		driver.findElement(By.id("currentAddress")).sendKeys("ABC");
		driver.findElement(By.id("permanentAddress-label")).isDisplayed();
		driver.findElement(By.id("permanentAddress")).sendKeys("ABC");
		JavascriptExecutor jse = (JavascriptExecutor)driver; // to scroll page
		driver.findElement(By.id("submit")).click();
		String output=driver.findElement(By.id("output")).getText();
		System.out.println(output);
		driver.quit();
	}

}

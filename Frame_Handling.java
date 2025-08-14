package DEMOQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Handling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll down by 1000 pixels
		js.executeScript("window.scrollBy(0, 500)");
		
		driver.switchTo().frame("frame1");
		String text=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		String text1=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text1);
		
		driver.quit();
	}

}

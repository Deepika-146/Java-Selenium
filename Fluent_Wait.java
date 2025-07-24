package DEMOQA;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		WebElement btn1 = mywait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close"));
		     }
		   });
		btn1.click();
		
		WebElement checkbox1 = mywait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.cssSelector("label[for='tree-node-documents'] span[class='rct-checkbox'] svg"));
		     }
		   });
		checkbox1.click();
		
		WebElement checkbox2 = mywait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.cssSelector("label[for='tree-node-documents'] span[class='rct-checkbox'] svg"));
		     }
		   });
		checkbox2.click();
		
		driver.quit();

	}

}

package DEMOQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(60));
		
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		WebElement click=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".rct-icon.rct-icon-expand-close")));
		click.click();
		WebElement checkbox=mywait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='tree-node-desktop'] span[class='rct-checkbox'] svg")));
		checkbox.click();
		WebElement checkbox1=mywait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='tree-node-documents'] span[class='rct-checkbox'] svg")));
		checkbox1.click();
		driver.quit();
	}

}

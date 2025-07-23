package DEMOQA;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class implicit_wait {


		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/checkbox");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close")).click();
			driver.findElement(By.cssSelector("label[for='tree-node-desktop'] span[class='rct-checkbox'] svg")).click();
			driver.quit();
		}

	}




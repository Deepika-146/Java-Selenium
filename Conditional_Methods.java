package DEMOQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//isDispalyed()
		boolean displaystatus=driver.findElement(By.xpath("//h1[text()='Radio Button']")).isDisplayed();
		System.out.println(displaystatus);
		
		//isEnabled()
	    WebElement YesRadioEnableSts=driver.findElement(By.cssSelector("input#yesRadio"));
		System.out.println(YesRadioEnableSts.isEnabled());
		
		
		WebElement NoRadioEnableSts=driver.findElement(By.cssSelector("input#noRadio"));
		System.out.println(NoRadioEnableSts.isEnabled());
		
		//isClicked()
		WebElement radio=driver.findElement(By.cssSelector("input#impressiveRadio"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", radio);
		boolean clickstatus=driver.findElement(By.cssSelector("input#impressiveRadio")).isSelected();
		System.out.println(clickstatus);
		
		driver.quit();
	}

}

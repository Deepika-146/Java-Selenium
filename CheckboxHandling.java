package DEMOQA;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@ title='Toggle']")).click();
		List<WebElement> checkboxes=driver.findElements(By.xpath("//span[@class='rct-checkbox']"));
		/*for(int i=1;i<=checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		for(int i=1;i<2;i++)
		{
			checkboxes.get(i).click();
		}
		for(WebElement checkbox:checkboxes)
		{
			if(checkbox.isSelected()) {
			checkbox.click();
			}
		}
		
	//driver.quit();
		}
	}



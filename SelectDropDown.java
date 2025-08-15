package DEMOQA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement selectdrpele=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select drpdown=new Select(selectdrpele);
		
		//select dropdown
		//drpdown.selectByVisibleText("Purple");
		//drpdown.selectByValue("6");
		drpdown.selectByIndex(1);
		
		//capture the options from dropdown (drpdown.getOptions())
		List<WebElement> options=drpdown.getOptions();
		System.out.println(options.size());
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		
		driver.quit();

		
	}

}

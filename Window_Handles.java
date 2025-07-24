package DEMOQA;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.findElement(By.cssSelector("img.banner-image")).click();
		Set<String> windowIds=driver.getWindowHandles();
		
		//usingArrayList
		ArrayList<String> windowids=new ArrayList(windowIds);
		String parentId=windowids.get(0);
		String childId=windowids.get(1);
		
		//parent window Id
		System.out.println(driver.getTitle());
		
		//child window Id
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		//usingLoopingStatement
		for(String id:windowIds)
		{
			String title=driver.switchTo().window(id).getTitle();
			if(title.equals("DEMOQA"))
			{
				System.out.println(driver.getCurrentUrl());
			}
			
		}
		for(String id:windowIds)
		{
			String title=driver.switchTo().window(id).getTitle();
			if(title.equals("DEMOQA"))
			{
				driver.close();
			}
			
		}
		
	driver.quit();

	}

}

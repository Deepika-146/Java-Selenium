package DEMOQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//navigate.to()
		driver.navigate().to("https://demoqa.com/");
		driver.navigate().to("https://demoqa.com/elements");
		
		//navigate().back()
		driver.navigate().back();
		System.out.println("URL after using back command"+" "+driver.getCurrentUrl());
		
		//navigate().forward()
		driver.navigate().forward();
		System.out.println("URL after using forward command"+" "+driver.getCurrentUrl());
		
		//navigate().refresh()
		driver.navigate().refresh();

		driver.quit();
		}

}

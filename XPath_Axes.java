package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Axes {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	
	//locate parent using child attribute
	String value=driver.findElement(By.xpath("//span[@class='wishlist-qty']/parent::a")).getText();
	System.out.println(value);
	
	//locate child
	String value1=driver.findElement(By.xpath("//a[@class='ico-cart']/child::span[1]")).getText();
	System.out.println(value1);
	
	//locate grandchild using ancestor
	String value3=driver.findElement(By.xpath("//li[@id='topcartlink']/descendant::span[2]")).getText();
	System.out.println(value3);
	
	//locate ancestor using descendant
	boolean displaystatus=driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']/ancestor::div")).isDisplayed();
	System.out.println(displaystatus);
	
	//locate using following sibling
	String value4=driver.findElement(By.xpath("//div[@class='header-selectors-wrapper']/following::div")).getText();
	System.out.println(value4);
	
	//locate using preceding sibling
	String value5=driver.findElement(By.xpath("//div[@class='header-links-wrapper']/preceding-sibling::div")).getText();
	System.out.println(value5);
	
	driver.quit();
	
	

	}

}

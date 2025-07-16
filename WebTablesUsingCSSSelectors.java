package DEMOQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesUsingCSSSelectors {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button#addNewRecordButton")).click();
		boolean displaystatusfname=driver.findElement(By.cssSelector("label.form-label")).isDisplayed();
		System.out.println(displaystatusfname);
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Deep");
		boolean displaystatuslname=driver.findElement(By.cssSelector("label.form-label")).isDisplayed();
		System.out.println(displaystatuslname);
		driver.findElement(By.cssSelector("input.mr-sm-2[placeholder='Last Name'")).sendKeys("Pal");
		boolean displaystatusemail=driver.findElement(By.cssSelector("label#userEmail-label")).isDisplayed();
		System.out.println(displaystatusemail);
		driver.findElement(By.cssSelector("input.mr-sm-2[placeholder='name@example.com']")).sendKeys("abc@gmail.com");
		boolean displaystatuesage=driver.findElement(By.cssSelector("label#age-label")).isDisplayed();
		driver.findElement(By.cssSelector("input.mr-sm-2[placeholder='Age']")).sendKeys("23");
		boolean displaystatussalary=driver.findElement(By.cssSelector("label#salary-label")).isDisplayed();
		System.out.println(displaystatussalary);
		driver.findElement(By.cssSelector("input.mr-sm-2[placeholder='Salary']")).sendKeys("40000");		
		boolean displaystatusdeparment=driver.findElement(By.cssSelector("label#department-label")).isDisplayed();
		System.out.println(displaystatusdeparment);
		driver.findElement(By.cssSelector("input.mr-sm-2[placeholder='Department']")).sendKeys("ST");
		driver.findElement(By.cssSelector("button#submit")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		List<WebElement> rows = driver.findElements(By.cssSelector("div.rt-tr-group"));

		for (WebElement row : rows) {
		    List<WebElement> cells = row.findElements(By.cssSelector("div.rt-td"));

		    for (WebElement cell : cells) {
		        System.out.print(cell.getText()+ " "+"|");
		    }
		    System.out.println(); 
		}
	driver.findElement(By.cssSelector("input.form-control[placeholder='Type to search']")).sendKeys("Deep");
    driver.findElement(By.cssSelector("span#basic-addon2")).click();
    List<WebElement> name=driver.findElements(By.cssSelector("div.rt-td"));
    for (WebElement x:name)
    {
    	boolean found=false;
    if(x.getText().equals("Deep"))	
    {
    	System.out.println("True");
    	found=true;
    	break;
    }
    else
    {
    	System.out.println(false);
    }
    }
    driver.quit();
	}
}

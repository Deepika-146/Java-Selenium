package DEMOQA;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Handling {
public static void main(String[] args)
{
   WebDriver driver=new ChromeDriver();
   driver.get("https://demoqa.com/alerts");
   driver.manage().window().maximize();
   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
   
   //normal alert
   driver.findElement(By.xpath("//button[@id='alertButton']")).click();
   Alert normalAlert= driver.switchTo().alert();
   System.out.println( normalAlert.getText());
   normalAlert.accept();
  
   JavascriptExecutor js = (JavascriptExecutor) driver;
   // Scroll down by 1000 pixels
   js.executeScript("window.scrollBy(0, 500)");
          
   //alert after 5 seconds
   driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
   Alert timeAlert=wait.until(ExpectedConditions.alertIsPresent());
   System.out.println( timeAlert.getText());
   timeAlert.accept();
  
   //confirmation alert
   driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
   Alert conAlert=driver.switchTo().alert();
   System.out.println(conAlert.getText());
   conAlert.dismiss();
   
   //prompt alert
   driver.findElement(By.xpath("//button[@id='promtButton']")).click();
   Alert promtAlert=driver.switchTo().alert();
   System.out.println(promtAlert.getText());
   promtAlert.sendKeys("Deepika");
   promtAlert.accept();
   
}
}

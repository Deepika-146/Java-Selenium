package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAutomation_BolgSopt {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Open the test site
        driver.get("https://testautomationpractice.blogspot.com/");

        // Search for 'selenium'
        driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
        driver.findElement(By.cssSelector(".wikipedia-search-button")).click();

        // Find all search result links (anchor tags)
        List<WebElement> links = driver.findElements((By.xpath("//div[@id='wikipedia-search-result-link']/a")));
        int size=links.size();
        System.out.println(size);
        
        //click all links
        for(WebElement x:links) {
        	x.click();
        }
        
        //get window ids
        Set<String> ids=driver.getWindowHandles();
        
        ArrayList<String> winID =new ArrayList(ids);
        for (String x:winID)
        {
            String title=driver.switchTo().window(x).getTitle();
            System.out.println(title);
           if (title.equals("Selenium (software) - Wikipedia")||title.equals("Selenium in biology - Wikipedia"))
           {
        	   driver.close();
           }
        }
        
//driver.quit();
    }
}

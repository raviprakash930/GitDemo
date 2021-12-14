import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class goole {
public static void main(String[] args) 
{
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
		driver.get("http://www.google.com");
		
driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("facebook");

//driver.findElement(By.xpath("//*[text()='Google Search']")).click();

driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']/center/input")).submit();



	}
}





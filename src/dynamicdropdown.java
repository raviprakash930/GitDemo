    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException
	{
    System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();		
	driver.get("http://www.google.com");
	
	driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("spicejet");
    driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']/center/input")).submit();
    driver.findElement(By.className("sA5rQ")).click();
    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//a[contains(text(),'Vijayawada (VGA)')]")).click();
    Thread.sleep(2000L);
    driver.findElement(By.xpath("(//a[contains(text() ,'Chennai (MAA)')])[2]")).click();
    driver.findElement(By.className("paxinfo")).click();
    Thread.sleep(2000L);
    for(int i=1;i<=5;i++)
    {
    	driver.findElement(By.id("hrefIncAdt")).click();
    } 
    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    
    

	}

}

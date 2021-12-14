import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
		driver.get("http://182.156.216.35:9898/attendance-portal");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("0000114897");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-layout/app-sidebar/nav/div[1]/a[3]/span")).click();
		
		
		
	
	}

}

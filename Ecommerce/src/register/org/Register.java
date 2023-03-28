package register.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\Sample\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
		driver.findElement(By.name("username")).sendKeys("Muguntha@17");
		driver.findElement(By.name("firstname")).sendKeys("Muguntha");
		driver.findElement(By.name("lastname")).sendKeys("Ramkumar");
		driver.findElement(By.name("email")).sendKeys("muguntha@gmail.com");
		
		
		Select drop=new Select(driver.findElement(By.name("country_id"))); 
		
		drop.selectByValue("99");
		driver.findElement(By.name("password")).sendKeys("Ramkumar@89");
		
	}

}

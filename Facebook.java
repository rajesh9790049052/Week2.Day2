package Week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Rajeshkannan");
		driver.findElement(By.name("lastname")).sendKeys("S");
		driver.findElement(By.name("reg_email__")).sendKeys("rajeshatsh@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rajeshatsh@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Pass@123");
		WebElement day = driver.findElement(By.id("day"));
		Select dd = new Select(day);
		dd.selectByValue("12");
		WebElement month = driver.findElement(By.id("month"));
		Select dd1 = new Select(month);
		dd1.selectByIndex(7);
		WebElement year = driver.findElement(By.id("year"));
		Select dd2 = new Select (year);
		dd2.selectByVisibleText("1992");
		driver.findElement(By.name("sex")).sendKeys("Female");
				
	}

}

package Week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editleafground {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("rajeshatash@gmail.com");
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[2]")).sendKeys(" text");
		System.out.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[3]")).getAttribute("value"));
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[4]")).clear();
		System.out.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[5]")).isDisplayed());
			
	}

}

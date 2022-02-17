package Week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		Select drop = new Select(dd1);
		drop.selectByIndex(1);
		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		Select drop2 = new Select(dd2);
		drop2.selectByVisibleText("Selenium");
		WebElement dd3 = driver.findElement(By.id("dropdown3"));
		Select drop3 = new Select(dd3);
		drop3.selectByValue("1");
		WebElement dd4 = driver.findElement(By.className("dropdown"));
		Select noofdrop = new Select(dd4);
		System.out.println("Number of dropdown : " + noofdrop.getOptions().size());
		WebElement dd5 = driver.findElement(By.xpath("((//div[@class ='example'])[5])/select"));
		dd5.sendKeys("Selenium");
		WebElement dd6 = driver.findElement(By.xpath("((//div[@class='example'])[6])/select"));
		dd6.sendKeys("Selenium");	
		
	}

}

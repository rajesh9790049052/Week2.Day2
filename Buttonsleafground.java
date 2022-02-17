package Week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttonsleafground {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/button)[1]")).click();
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[2]")).click();
	    System.out.println("The coordinates (x,y) = " + driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/button)[2]")).getLocation());
		System.out.println("Colour = " + driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/button)[3]")).getCssValue("background-color"));
		System.out.println("The width & height = " + driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/button)[4]")).getSize());
		
	}

}

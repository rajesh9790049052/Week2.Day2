package Week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlinks {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).click();
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[3]")).click();
		System.out.println("Color " + driver.findElement(By.xpath("//a[text() ='Find where am supposed to go without clicking me?']")).getCssValue("color"));
		driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).click();
		System.out.println("Location :" + driver.findElement(By.id("position")).getLocation());
		System.out.println("Background color : " + driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("Size (Height & Width) : " + driver.findElement(By.id("size")).getSize());
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[3]")).click();
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		System.out.println(driver.getTitle());
		if((driver.getTitle()).equals("HTTP Status 404 – Not Found")) {
			System.out.println("The verification is success & it's broken");
		} else {
			System.out.println("The verification is failure & it's not broken");
		}
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[3]")).click();
		
	
	}

}

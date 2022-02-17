package Week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editimages {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[4]")).click();
		WebElement testverify = driver.findElement(By.xpath("//img[@src='../images/home.png']"));
		System.out.println(testverify.getAttribute("width"));
		WebElement verify = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img"));
		if(verify.getAttribute("naturalHeight").equals("0")) {
			
			System.out.println("The image is broken");
			
		} else {
			
			System.out.println("The image is not broken");
		}
		
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		
		
	}		

}

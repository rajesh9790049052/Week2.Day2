package Week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Rajeshkannan");
		driver.findElement(By.id("lastNameField")).sendKeys("S");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Rajesh");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kannan");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Automobile");
		driver.findElement(By.xpath("//textarea[contains(@id, 'createContactForm_description')]")).sendKeys("Testing pls ignore...");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("rajeshatash@gmail.com");
		WebElement state= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd =new Select(state);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Testing purpose, pls ignore it");
		driver.findElement(By.xpath("//input[contains(@name,'submitButton')]")).click();
		System.out.println(driver.getTitle());
			
	}

}

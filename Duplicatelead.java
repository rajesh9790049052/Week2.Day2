package Week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicatelead {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("rajeshatash@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		Thread.sleep(5000);
		String title= driver.findElement(By.xpath("//div[@class='x-panel-header sectionHeaderTitle']")).getText();
		System.out.println(title);
		Thread.sleep(2000);
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		String text2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getAttribute("value");
		System.out.println(text2);
		if(text.equals(text2))
		{
			System.out.println("Not Duplicate");
		}
		else
		{
			System.out.println("Duplicate");
		}
			
		Thread.sleep(2000);
		driver.close();
		
	}

}

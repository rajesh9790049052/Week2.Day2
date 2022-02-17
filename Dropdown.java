package Week2.Day2.Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement source= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceid = new Select(source);
		sourceid.selectByVisibleText("Employee");
		WebElement industry= driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryid = new Select(industry);
		industryid.selectByValue("IND_FINANCE");
		WebElement ownership= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipid = new Select(ownership);
		ownershipid.selectByIndex(2);
		
	}

}

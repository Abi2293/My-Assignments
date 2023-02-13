package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abirami");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Abi");
		driver.findElement(By.name("departmentName")).sendKeys("Finance");
		driver.findElement(By.name("description")).sendKeys("test");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		WebElement statedropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sdd=new Select(statedropdown);
		sdd.selectByVisibleText("New York");
		Thread.sleep(3000);
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("importantNote")).sendKeys("Test Important Note");
		Thread.sleep(2000);
		driver.findElement(By.className("smallSubmit")).click();
		String title= driver.getTitle();
		System.out.println("Updated Lead Page Title:"+title);	
	}
}
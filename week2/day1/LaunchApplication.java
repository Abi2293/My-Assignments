package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchApplication {
	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver1=new ChromeDriver();
		//driver1.get("https://www.facebook.com/");
		//EdgeDriver driver2=new EdgeDriver();
		//driver2.get("https://www.facebook.com/");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		//WebElement uname = driver.findElement(By.id("username"));-->assigning the element to the variable
		//uname.sendKeys("hari.radhakrishnan@qeagle.com");-->performing the action on the variable
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
	}
}

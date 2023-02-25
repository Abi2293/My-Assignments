package week3.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER); or
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile",Keys.ENTER);
		List<WebElement> priceelement = driver.findElements(By.className("a-price-whole"));
		List<Integer> pricelist=new ArrayList<Integer>();
		for(int i=0;i<priceelement.size();i++)
		{
			WebElement e=priceelement.get(i);
			String text=e.getText();
			//System.out.println(text);
			String replacedString=text.replace(",","");
			System.out.println(replacedString);		
			if(!replacedString.isEmpty())
			{
				int price=Integer.parseInt(replacedString);
				pricelist.add(price);
			}
			
			
		}
		
	}
}

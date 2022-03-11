package org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTask {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	btnclose.click();
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("Iphone");
	WebElement btnclick = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
	btnclick.click();
List<WebElement> phones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
WebElement a;
for (int i = 0; i < phones.size(); i++) {
 a=phones.get(i);
	System.out.println(a.getText());
	
}
List<WebElement> amount = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	WebElement b;
	for (int i = 0; i < amount.size(); i++) {
	b=amount.get(i)	;
	 System.out.println(b.getText());
	}
	

	
	
}	


}

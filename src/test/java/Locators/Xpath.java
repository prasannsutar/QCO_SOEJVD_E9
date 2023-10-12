package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//address of email text field using xpath
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prasann");
		//address of password text field using xpath
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("prasann");
		Thread.sleep(3000);
		//address of forgotten password using xpath
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//address of forgotten password using xpath
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();

	}

}

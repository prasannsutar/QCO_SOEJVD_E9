package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class id_name_linktext_partialLinkText {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//address of email text field
		driver.findElement(By.id("email")).sendKeys("prasann");
		//address of password text field
		driver.findElement(By.name("pass")).sendKeys("prasann");
		//address of login button
		//driver.findElement(By.name("login")).click();
		//address of create page link using link text
		//driver.findElement(By.linkText("Create a Page")).click();
		//address of create page using partial text
		driver.findElement(By.partialLinkText("Create a ")).click();
		Thread.sleep(3000);
		driver.close();

	}

}

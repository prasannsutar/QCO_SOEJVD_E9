package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css_selector {

	public static void main(String[] args){
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//address of email text field using cssSelector
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("prasann");

	}

}

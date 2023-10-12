package Basic_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws Throwable {
		//edge driver related statement
				WebDriverManager.edgedriver().setup();
				//opens the empty edge browser
				WebDriver driver = new EdgeDriver();
				Thread.sleep(3000);
				//maximizing statement
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				Thread.sleep(3000);
				//to navigate to another url
				driver.navigate().to("https://www.amazon.in/");
				Thread.sleep(3000);
				//to navigate to previous url
				driver.navigate().back();
				Thread.sleep(3000);
				//to navigate back to next url
				driver.navigate().forward();
				Thread.sleep(3000);
				//to refresh page
				driver.navigate().refresh();
				Thread.sleep(3000);
				//closing browser statement
				driver.quit();

	}

}

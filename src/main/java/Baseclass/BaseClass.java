package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void buttonMethod(WebElement element) {
		element.click();
	}

	public static void textBox(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void dropDown(WebElement element, String type, String value) {

		Select s = new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("byindex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
	}

	public static void close() {
		driver.close();
	}
}

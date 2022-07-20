package Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pojo.Adactin_Login_Page;

public class Adactin_Project extends BaseClass {

	public static void main(String[] args) {
		
		driver = browser("chrome");

		getUrl("https://adactinhotelapp.com/");

		Adactin_Login_Page alp = new Adactin_Login_Page(driver);

		textBox(alp.getusername(), "mdrizwan45");

		textBox(alp.getpassword(), "rizwan12345");

		buttonMethod(alp.getlogin());

		WebElement location = driver.findElement(By.id("location"));
		dropDown(location, "byindex", "3");

	}

}
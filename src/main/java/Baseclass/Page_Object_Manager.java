package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pojo.Adactin_Login_Page;
import com.pojo.Adactin_Searchpage;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
private Adactin_Login_Page alp;
private Adactin_Searchpage search;


public Page_Object_Manager(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);                                                                   

}

public Adactin_Login_Page getinsanceAlp() {
	alp=new Adactin_Login_Page(driver);
	return alp;
}
public Adactin_Searchpage getinstanceSearch() {
	search = new Adactin_Searchpage(driver);
	return search;
}

}


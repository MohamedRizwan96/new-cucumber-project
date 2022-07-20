package Baseclass;

import java.io.IOException;

import com.helperFile.FileReadManager;

public class Adactin_Base extends BaseClass {
	public static void main(String[] args) throws IOException {

		driver = browser("chrome");

		getUrl(FileReadManager.getinstance_FRM().getinstanc_CR().getUrl());

		Page_Object_Manager pom = new Page_Object_Manager(driver);

		textBox(pom.getinsanceAlp().getusername(), FileReadManager.getinstance_FRM().getinstanc_CR().get_uname());

		textBox(pom.getinsanceAlp().getpassword(), FileReadManager.getinstance_FRM().getinstanc_CR().get_pass());

		buttonMethod(pom.getinsanceAlp().getlogin());

		dropDown(pom.getinstanceSearch().getLocate(), "byindex", "2");
		dropDown(pom.getinstanceSearch().getHotel(), "byvalue", "Hotel Sunshine");
		dropDown(pom.getinstanceSearch().getRoomtype(), "byindex", "2");
		dropDown(pom.getinstanceSearch().getRooms(), "byvalue", "2");
		textBox(pom.getinstanceSearch().getCheckin(), "18/07/2022");
		textBox(pom.getinstanceSearch().getCheckout(), "20/07/2022");
		dropDown(pom.getinstanceSearch().getAdultsroom(), "byvalue", "2");
		dropDown(pom.getinstanceSearch().getChildsroom(), "byindex", "1");
		buttonMethod(pom.getinstanceSearch().getSubmit());

	}
}

package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Searchpage {
	public static WebDriver driver;

	@FindBy(id = "location")
	private WebElement locate;
	@FindBy(id = "hotels")
	private WebElement hotel;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(id = "room_nos")
	private WebElement rooms;
	@FindBy(id = "datepick_in")
	private WebElement checkin;
	@FindBy(id = "datepick_out")
	private WebElement checkout;
	@FindBy(id = "adult_room")
	private WebElement adultsroom;
	@FindBy(id = "child_room")
	private WebElement childsroom;
	@FindBy(id = "Submit")
	private WebElement submit;

	public Adactin_Searchpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocate() {
		return locate;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRooms() {
		return rooms;
		}
	public WebElement getCheckin() {
		return checkin;
		}
	public WebElement getCheckout() {
		return checkout;
		}
	public WebElement getAdultsroom() {
		return adultsroom;
		}
	public WebElement getChildsroom() {
		return childsroom;
		}
	public WebElement getSubmit() {
		return submit;
		}
}
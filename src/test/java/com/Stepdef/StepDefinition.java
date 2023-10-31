package com.Stepdef;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Test.Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class StepDefinition {
	public static WebDriver driver =Runner.driver; // Runner class

	@Given("^user Launch The Web Application$")
	public void user_Launch_The_Web_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");

	}

	@When("^user Enter The username In Username Filed$")
	public void user_Enter_The_username_In_Username_Filed() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("vivekvinoth");
	}

	@When("^user Enter THe In Password Filed$")
	public void user_Enter_THe_In_Password_Filed() throws Throwable {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vivek123#");
	}

	@Then("^User Click The Login Button And Navigate To Search Hotel$")
	public void user_Click_The_Login_Button_And_Navigate_To_Search_Hotel() throws Throwable {
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}

	@When("^user Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByVisibleText("Paris");
	}

	@When("^user Select The Hotel In Hotels Field$")
	public void user_Select_The_Hotel_In_Hotels_Field() throws Throwable {
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Cornice");

	}

	@When("^user Select The RoomType In RoomType Field$")
	public void user_Select_The_RoomType_In_RoomType_Field() throws Throwable {
		WebElement room = driver.findElement(By.name("room_type"));
		Select s2 = new Select(room);
		s2.selectByIndex(2);

	}

	@When("^user Select The Number Of Room In Room Field$")
	public void user_Select_The_Number_Of_Room_In_Room_Field() throws Throwable {
		WebElement roomnum = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(roomnum);
		s3.selectByValue("2");

	}

	@When("^user Give CheckInDate To The Check In Field$")
	public void user_Give_CheckInDate_To_The_Check_In_Field() throws Throwable {
		WebElement checkin = driver.findElement(By.name("datepick_in"));
		checkin.clear();
		checkin.sendKeys("28/11/2022");
	}

	@When("^user Give CheckOutDate To The Check Out Field$")
	public void user_Give_CheckOutDate_To_The_Check_Out_Field() throws Throwable {
		WebElement checkout = driver.findElement(By.name("datepick_out"));
		checkout.clear();
		checkout.sendKeys("30/11/2022");

	}

	@When("^user Give Adults Per Room To The AdultPerRoom Field$")
	public void user_Give_Adults_Per_Room_To_The_AdultPerRoom_Field() throws Throwable {
		WebElement adult = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(adult);
		s4.selectByValue("2");

	}

	@When("^user Give Childrens Per Room To The ChildrensPerRoom Field$")
	public void user_Give_Childrens_Per_Room_To_The_ChildrensPerRoom_Field() throws Throwable {
		WebElement child = driver.findElement(By.name("child_room"));
		Select s5 = new Select(child);
		s5.selectByValue("2");
	}

	@Then("^user Click The Search Btn And Navigate To Select Hotel Page$")
	public void user_Click_The_Search_Btn_And_Navigate_To_Select_Hotel_Page() throws Throwable {
		driver.findElement(By.id("Submit")).click();
	}

	@When("^user Click The Radio Button$")
	public void user_Click_The_Radio_Button() throws Throwable {
		driver.findElement(By.id("radiobutton_0")).click();
	}

	@Then("^user click The Continue Button To Navigate To Book A Hotel$")
	public void user_click_The_Continue_Button_To_Navigate_To_Book_A_Hotel() throws Throwable {
		driver.findElement(By.id("continue")).click();

	}

	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		driver.findElement(By.id("first_name")).sendKeys("Vivek");

	}

	@When("^user ENter The Last Name$")
	public void user_ENter_The_Last_Name() throws Throwable {
		driver.findElement(By.id("last_name")).sendKeys("Vinoth");

	}

	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("29a Pillaiyar kovil street,Nannagaram");
		add.sendKeys("Tenkasi 627818");

	}

	@When("^user Enter The Valid Credit card Number$")
	public void user_Enter_The_Valid_Credit_card_Number() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567891245678");

	
	}

	@When("^user Choose The Credit Card Type$")
	public void user_Choose_The_Credit_Card_Type() throws Throwable {
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cctype);
		s6.selectByVisibleText("VISA");
	}

	@When("^user Select The Expiry Month$")
	public void user_Select_The_Expiry_Month() throws Throwable {
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		Select s7 = new Select(month);
		s7.selectByIndex(7);
	}

	@When("^user Select The Expiry Year$")
	public void user_Select_The_Expiry_Year() throws Throwable {
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(year);
		s8.selectByVisibleText("2022");

	}

	@When("^user Enter The CVV Number$")
	public void user_Enter_The_CVV_Number() throws Throwable {
		driver.findElement(By.name("cc_cvv")).sendKeys("753");
	}

	@Then("^user Click The BookNow Btn And Navigate To Booking Confirmation Page$")
	public void user_Click_The_BookNow_Btn_And_Navigate_To_Booking_Confirmation_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
	}

	@Then("^user Click The Logout Button$")
	public void user_Click_The_Logout_Button() throws Throwable {
		WebElement Logout = driver.findElement(By.xpath("//input[@id='logout']"));
		Logout.click();
	}

}
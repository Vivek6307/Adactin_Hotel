Feature: Hotel Booking In Adactin Application 

@login
 Scenario: User Login Into The Web Application 
 
	Given user Launch The Web Application 
	When user Enter The username In Username Filed 
	And user Enter THe In Password Filed 
	Then User Click The Login Button And Navigate To Search Hotel 
@searchhotel	
Scenario: User Search Hotel In Search Hotel Page 
	When user Select The Location In Location Field 
	And user Select The Hotel In Hotels Field 
	And user Select The RoomType In RoomType Field 
	And user Select The Number Of Room In Room Field 
	And user Give CheckInDate To The Check In Field 
	And user Give CheckOutDate To The Check Out Field 
	And user Give Adults Per Room To The AdultPerRoom Field 
	And user Give Childrens Per Room To The ChildrensPerRoom Field 
	Then user Click The Search Btn And Navigate To Select Hotel Page 
@selecthotel	
Scenario: User Confirm The Room In Select Hotel 
	When user Click The Radio Button 
	Then user click The Continue Button To Navigate To Book A Hotel 
@bookroom	
Scenario: User Book The Room And Make A Payment 
	When user Enter The First Name 
	And user ENter The Last Name 
	And user Enter The Billing Address 
	And user Enter The Valid Credit card Number 
	And user Choose The Credit Card Type 
	And user Select The Expiry Month 
	And user Select The Expiry Year 
	And user Enter The CVV Number 
	Then user Click The BookNow Btn And Navigate To Booking Confirmation Page 
@confirmation	
Scenario: User Logout The Page After Booking Confimation 
	Then user Click The Logout Button
Feature: Form feature

@form
Scenario: User should be able to Submit the data in a form 
	Given User launch the application
	Then User should be navigated to the Form page
	And User should be able to see title page is written as Selenium Practice Form
	And User should be able to see AUTOMATE ME text
	And User should be able to see First Name field
	And User should be able to enter first name in First Name field "Muhamad Lutfi"
	And User should be able to see Last Name field
	And User should be able to enter last name in First Name field "Ramdani"
	And User should be able to see Gender Radio button
	And User should be able to select gender
	And User should be able to see Years of Experience radio button
	And User should be able to select the years of experience
	And User should be able to see Date field
	And User should be able to enter date in Date field "25/01/1997"
	And User should be able to see Profession radio button
	And User should be able to select profession
	And User should be able to see Automation Tools checkbox
	And User should be able to select the automation tool
	And User should be able to see Continent dropdown
	And User should be able to select the continent
	And User should be able to see Selenium Commands field
	And User should be able to select the selenium command
	And User should be able to see Upload Image section
	And User should be able to upload an image
	And User should be able to see Download Link
	And User should be able to click on the link
	And User should be able to see Submit button
	When User clicks Submit button
	
package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import UIConstant.FormConstant;

public class FormStepDefinition {
	
	public static WebDriver driver;

	@Given("User launch the application")
	public void user_launch_the_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\eclipse-workspace\\automation\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	    driver.manage().window().maximize();
	    Thread.sleep(10000);
	}

	@Then("User should be navigated to the Form page")
	public void user_should_be_navigated_to_the_form_page() throws Throwable {
		driver.findElement(By.xpath(FormConstant.TITLE_PAGE));
		System.out.println("User should be navigated to the Form page");
	}

	@Then("User should be able to see title page is written as Selenium Practice Form")
	public void user_should_be_able_to_see_title_page_is_written_as_selenium_practice_form() throws Throwable{
		driver.findElement(By.xpath(FormConstant.TITLE_PAGE));
		System.out.println("User should be able to see title page is written as Selenium Practice Form");
	}

	@Then("User should be able to see AUTOMATE ME text")
	public void user_should_be_able_to_see_automate_me_text() throws Throwable {
		driver.findElement(By.xpath(FormConstant.SUBTITLE_PAGE));
		System.out.println("User should be able to see AUTOMATE ME text");
	}

	@Then("User should be able to see First Name field")
	public void user_should_be_able_to_see_first_name_field() throws Throwable {
		driver.findElement(By.xpath(FormConstant.FIRSTNAME));
		System.out.println("User should be able to see First Name field");
	}

	@Then("User should be able to enter first name in First Name field {string}")
	public void user_should_be_able_to_enter_first_name_in_first_name_field(String string) throws Throwable {
		driver.findElement(By.xpath(FormConstant.FIRSTNAME)).sendKeys(FormConstant.firstname);
		System.out.println("\"User should be able to enter first name in First Name field");
	}

	@Then("User should be able to see Last Name field")
	public void user_should_be_able_to_see_last_name_field() throws Throwable {
		driver.findElement(By.xpath(FormConstant.LASTNAME));
		System.out.println("User should be able to see Last Name field");
	}

	@Then("User should be able to enter last name in First Name field {string}")
	public void user_should_be_able_to_enter_last_name_in_first_name_field(String string) throws Throwable {
		driver.findElement(By.xpath(FormConstant.LASTNAME)).sendKeys(FormConstant.lastname);
		System.out.println("User should be able to enter last name in First Name field");
	}

	@Then("User should be able to see Gender Radio button")
	public void user_should_be_able_to_see_Gender_radio_button() throws Throwable {
		driver.findElement(By.xpath(FormConstant.GENDER));
		System.out.println("User should be able to see Gender Radio button");
	}

	@Then("User should be able to select gender")
	public void user_should_be_able_to_select_gender() throws Throwable {
		driver.findElement(By.xpath(FormConstant.gender)).click();
	}

	@Then("User should be able to see Years of Experience radio button")
	public void user_should_be_able_to_see_years_of_experience_radio_button() throws Throwable {
		driver.findElement(By.xpath(FormConstant.YEARS_OF_EXPERIENCES));
		System.out.println("User should be able to see Years of Experience radio button");
	}

	@Then("User should be able to select the years of experience")
	public void user_should_be_able_to_select_the_years_of_experience() throws Throwable {
		driver.findElement(By.xpath(FormConstant.experience)).click();
	}

	@Then("User should be able to see Date field")
	public void user_should_be_able_to_see_date_field() throws Throwable {
		driver.findElement(By.xpath(FormConstant.DATE));
		System.out.println("User should be able to see Date field");
	}

	@Then("User should be able to enter date in Date field {string}")
	public void user_should_be_able_to_enter_date_in_date_field(String string) throws Throwable {
		driver.findElement(By.xpath(FormConstant.DATE)).sendKeys(FormConstant.date);
		System.out.println("User should be able to enter date in Date field");
	}

	@Then("User should be able to see Profession radio button")
	public void user_should_be_able_to_see_profession_radio_button() throws Throwable {
		driver.findElement(By.xpath(FormConstant.PROFESSION));
		System.out.println("User should be able to see Profession radio button");
	}

	@Then("User should be able to select profession")
	public void user_should_be_able_to_select_profession() throws Throwable {
		driver.findElement(By.xpath(FormConstant.profession)).click();

	}

	@Then("User should be able to see Automation Tools checkbox")
	public void user_should_be_able_to_see_automation_tools_checkbox() throws Throwable {
		driver.findElement(By.xpath(FormConstant.AUTOMATION_TOOLS));
		System.out.println("User should be able to see Automation Tools checkbox");
	}

	@Then("User should be able to select the automation tool")
	public void user_should_be_able_to_select_the_automation_tool() throws Throwable {
		driver.findElement(By.xpath(FormConstant.automationtools)).click();

	}

	@Then("User should be able to see Continent dropdown")
	public void user_should_be_able_to_see_continent_dropdown() throws Throwable {
		driver.findElement(By.xpath(FormConstant.CONTINENT));
		System.out.println("User should be able to see Continent dropdown");
	}

	@Then("User should be able to select the continent")
	public void user_should_be_able_to_select_the_continent() throws Throwable {
		driver.findElement(By.xpath(FormConstant.continent)).click();

	}

	@Then("User should be able to see Selenium Commands field")
	public void user_should_be_able_to_see_selenium_commands_field() throws Throwable {
		driver.findElement(By.xpath(FormConstant.SELENIUM_COMMAND));
		System.out.println("User should be able to see Selenium Commands field");
	}

	@Then("User should be able to select the selenium command")
	public void user_should_be_able_to_select_the_selenium_command() throws Throwable {
		driver.findElement(By.xpath(FormConstant.seleniumcommand)).click();

	}

	@Then("User should be able to see Upload Image section")
	public void user_should_be_able_to_see_upload_image_section() throws Throwable {
		driver.findElement(By.xpath(FormConstant.PHOTO_BTN));
		System.out.println("User should be able to see Upload Image section");
	}

	@Then("User should be able to upload an image")
	public void user_should_be_able_to_upload_an_image() throws Throwable {
		driver.findElement(By.xpath(FormConstant.PHOTO_BTN)).click();
		Thread.sleep(10000);
	}

	@Then("User should be able to see Download Link")
	public void user_should_be_able_to_see_download_link() throws Throwable {
		driver.findElement(By.xpath(FormConstant.DOWNLOAD_LINK));
		System.out.println("User should be able to see Download Link");
	}

	@Then("User should be able to click on the link")
	public void user_should_be_able_to_click_on_the_link() throws Throwable {
		driver.findElement(By.xpath(FormConstant.DOWNLOAD_LINK)).click();
		Thread.sleep(5000);
	}

	@Then("User should be able to see Submit button")
	public void user_should_be_able_to_see_submit_button() throws Throwable {
		driver.findElement(By.xpath(FormConstant.SUBMIT_BTN));
		System.out.println("User should be able to see Submit button");
	}

	@When("User clicks Submit button")
	public void user_clicks_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(FormConstant.SUBMIT_BTN)).click();
		
		driver.quit();
	}

}

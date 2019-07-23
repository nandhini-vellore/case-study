package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case1 {
	WebDriver driver;
	//Background
	@Given("^Browser must be installed by user$")
	public void browser_must_be_installed_by_user() throws Throwable {
		   
	}

	@When("^User enters AUT URL in browser$")
	public void user_enters_AUT_URL_in_browser() throws Throwable {
		driver=utility.startBrowser("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
	 }

	@Then("^Application must open in the browser$")
	public void application_must_open_in_the_browser() throws Throwable {
	
	  
	}
	
//Registration
	@Given("^the home page of Testme app must be launched$")
	public void the_home_page_of_Testme_app_must_be_launched() throws Throwable {
		driver.findElement(By.partialLinkText("SignUp")).click();
	  
	}

	@When("^User enters valid username as \"([^\"]*)\"$")
	public void user_enters_valid_username_as(String arg1) throws Throwable {
		 driver.findElement(By.name("userName")).sendKeys(arg1);
	   
	}

	@When("^enters Firstname as \"([^\"]*)\"$")
	public void enters_Firstname_as(String arg1) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);
	}

	@When("^enters Lastname as \"([^\"]*)\"$")
	public void enters_Lastname_as(String arg1) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(arg1);
	}

	@When("^enters password as \"([^\"]*)\"$")
	public void enters_password_as(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@When("^enters confirm password as \"([^\"]*)\"$")
	public void enters_confirm_password_as(String arg1) throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys(arg1);
	}

	@When("^selects the gender female$")
	public void selects_the_gender_female() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@When("^enters email id as \"([^\"]*)\"$")
	public void enters_email_id_as(String arg1) throws Throwable {
		driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	}

	@When("^enters mobile number as \"([^\"]*)\"$")
	public void enters_mobile_number_as(String arg1) throws Throwable {
		driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
	}

	@When("^enters DOB as \"([^\"]*)\"$")
	public void enters_DOB_as(String arg1) throws Throwable {
	    driver.findElement(By.name("dob")).sendKeys(arg1);
	}

	@When("^enters adress as \"([^\"]*)\"$")
	public void enters_adress_as(String arg1) throws Throwable {
		driver.findElement(By.name("address")).sendKeys(arg1);
	}

	@When("^selects the security question$")
	public void selects_the_security_question() throws Throwable {
		Select a=new Select(driver.findElement(By.id("securityQuestion")));
		a.selectByIndex(1);
	}

	@When("^enters the answer for the security question as \"([^\"]*)\"$")
	public void enters_the_answer_for_the_security_question_as(String arg1) throws Throwable {
		driver.findElement(By.id("answer")).sendKeys(arg1);
	}

	@Then("^Registration successfull$")
	public void registration_successfull() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}
	
	
//Login
	@Given("^User must be registered$")
	public void user_must_be_registered() throws Throwable {
		driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@When("^User logins using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_logins_using_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		driver.findElement(By.name("Login")).click();
	}

	@Then("^User must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
		 System.out.println("Login successfull");
	}
	
//Search
	@Given("^User is already logged in$")
	public void user_is_already_logged_in() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("AlexUser");
		driver.findElement(By.name("password")).sendKeys("Alex@123");
		driver.findElement(By.name("Login")).click();
	}

	@When("^User types the first four characters of the product$")
	public void user_types_the_first_four_characters_of_the_product() throws Throwable {
		 driver.findElement(By.name("products")).sendKeys("Head");
		 driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		 String a=driver.findElement(By.partialLinkText("Add to cart")).getText();
		 Assert.assertEquals("Headphone", a);
	}

	@Then("^User gets all appropriate results to purchase$")
	public void user_gets_all_appropriate_results_to_purchase() throws Throwable {
	   System.out.println("The search engine is very fast and accurate");
	}
	
//Payment
	@Given("^user is logged in$")
	public void user_registered_into_TestMeApp() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("AlexUser");
		driver.findElement(By.name("password")).sendKeys("Alex@123");
		driver.findElement(By.name("Login")).click();
	}

	@When("^user search a particular product like headphones$")
	public void user_search_a_particular_product_like_headphones() throws Throwable {
		 driver.findElement(By.name("products")).sendKeys("Headphone");
		 driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		 
	}

	@Then("^TestMeApp doesnt display cart icon$")
	public void testmeapp_doesnt_display_cart_icon() throws Throwable {
	   if(driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size()!=0)
	   {
		   System.out.println("PASS");
	   }
	   else
	   {
		   System.out.println("Payment page doesnt open without clicking on Add to cart");
		  
	   }
	}
}

















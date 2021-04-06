package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EbayPage;

@RunWith(Cucumber.class)
public class SampleStepDefinition {
	
private WebDriver driver;
private EbayPage ebayPage;
	
	@Given("today is Sunday")
	public void today_is_sunday() {
	   System.out.println("Today is Sunday");
	}

	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_friday_yet() {
		System.out.println("Today is Friday");
	}

	@Then("I should be told {string}")
	public void i_should_be_told(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Today is "+string);
	}
	
	@Given("I am on the Google search page")
	public void i_am_on_the_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("On Google search page");
	}

	@When("I search for {string}")
	public void i_search_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Search for "+string);
	}

	@Then("the page title should start with {string}")
	public void the_page_title_should_start_with(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Title should start with "+string);
	}
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on Home Page");
	}

	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		   System.out.println("User navigates to Login Page");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User enters login id: "+string + "  and password: "+string2);
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User has logged in successfully");
	}
	
	@Given("I am on the Ebay Home Page")
	public void i_am_on_the_ebay_home_page() {
		String url="https://www.ebay.com/";
		
		driver.get(url);
	}

	@When("I enter the testerlifealways@gmail.com and nsdl@{int}")
	public void i_enter_the_testerlifealways_gmail_com_and_nsdl(Integer int1) {
	   
		
	}

	@Then("I should be able to login successfully")
	public void i_should_be_able_to_login_successfully() {
	  driver.quit();
	}
	
	 @Before(value = "@web", order = 1)
	    public void initWebDriver() throws Throwable {
		 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	    }

	    @Before()
	    public void initEbayPage() throws Throwable {
	    	ebayPage = new EbayPage(driver);
	    }
	    
	    @After(value = "@web")
	    public void disposeWebDriver() throws Throwable {
	        driver.quit();
	    }



	

}

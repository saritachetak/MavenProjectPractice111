package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static StepDefinition.Hooks.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Website {
   // public static WebDriver driver;
    @Given("^I am a chrome user$")
    public void i_am_a_chrome_user() {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Chetakrao\\IdeaProjects\\MavenProjectPractice111\\src\\test\\java\\chromedriver.exe");
        //driver=new ChromeDriver();



    }

    @When("^I access facebook\\.com$")
    public void i_access_facebook_com() {
        driver.get("https://www.facebook.com");

    }

    @Then("^I see facebook login page$")
    public void i_see_facebook_login_page() {
        //driver.quit();
    }

    @When("^I access santander website\\.com$")
    public void i_access_santander_website_com(){
        driver.get("https://www.santander.com");
    }

    @Then("^I see santander website\\.com$")
    public void i_see_santander_website_com() {
       // driver.quit();

    }

    @When("^I access  booking\\.com website$")
    public void i_access_booking_com_website() {

        driver.get("https://www.booking.com");
    }

    @Then("^I see booking\\.com$")
    public void i_see_booking_com() {
       // driver.quit();
    }




}
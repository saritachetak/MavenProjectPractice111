package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static StepDefinition.Hooks.driver;

public class Login {
  //  WebDriver driver;
    @Given("^I am using the chrome browser$")
    public void i_am_using_the_chrome_browser(){
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\Chetakrao\\IdeaProjects\\MavenProjectPractice111\\src\\test\\java\\chromedriver.exe");
       // driver=new ChromeDriver();
       // driver.get("https://www.facebook.com");
    }
    @When("^I am in facebook login page$")
    public void i_am_in_facebook_login_page(){
      driver.get("https://www.facebook.com");
      System.out.println(driver.getTitle());
    }


    @Then("^I can see the  login page$")
    public void i_can_see_the_login_page(){
    }
}

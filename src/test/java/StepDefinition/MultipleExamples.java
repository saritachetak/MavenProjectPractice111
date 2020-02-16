package StepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hooks.driver; // we need to import variable from the hook
import static java.lang.Boolean.TRUE;

public class MultipleExamples {
    @When("^I access \"([^\"]*)\" website$")
    public void i_acces_website1(String website){
        driver.get("https://www."+website+".com");

        System.out.println(driver.getTitle());
    }



    @Then("^i see websiteName with \"([^\"]*)\"$")
    public void
    i_see_website2(String websiteName) {
        System.out.println("i see website");
        Assert.assertEquals(TRUE, driver.getTitle().contains(websiteName));
    }

        @When("^I go backward$")
        public void i_go_backward() {
        driver.navigate().back();
    }

    @Then("^I see facebook$")
    public void i_see_facebook(){
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(TRUE, driver.getTitle().contains("Facebook"));
    }
    @When("^I go forward$")
    public void i_go_forward()  {
        driver.navigate().forward();

    }

    @Then("^I see the booking\\.com$")
    public void i_see_the_booking_com()  {
        Assert.assertEquals(TRUE, driver.getTitle().contains("Booking"));

    }
    @When("^I access facebook websites$")
    public void i_access_facebook_websites()  {
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email"));
        driver.findElement(By.id("pass"));
        driver.findElement(By.id("u_0_b")).click();

    }

    @Then("^I see \"([^\"]*)\" is visible$")
    public void i_see_is_visible(String arg1)  {
        Assert.assertEquals(TRUE,driver.findElement(By.id(arg1)).isDisplayed());

    }



}


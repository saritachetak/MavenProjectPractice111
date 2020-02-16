package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Chetakrao\\IdeaProjects\\MavenProjectPractice111\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void after(){

       driver.quit();

    }
}

package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScenarioWithExample {
    private WebDriver driver;
    @Given("user is on homepage")
    public void userIsOnHomepage() throws Throwable{
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println("userIsOnHomepage");
    }

    @When("user navigate to login page")
    public void userNavigateToLoginPage() {
        System.out.println("userNavigateToLoginPage");
    }

    @And("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) throws Throwable{
        System.out.println(" username is " + username + " password is " + password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("message  displayed login successfully")
    public void messageDisplayedLoginSuccessfully() {
        System.out.println("Successfully logged in");
        driver.close();
    }
}

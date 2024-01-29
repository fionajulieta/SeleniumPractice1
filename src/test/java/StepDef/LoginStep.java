package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class LoginStep extends Hooks{


    @Given("user is in login page")
    public void user_is_in_login_page() {
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

    @When("user input username {string}")
    public void userInputEmail(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("login page will display error message: {string}")
    public void loginPageWillDisplayErrorMessage(String errorMessage) {
        assertEquals(errorMessage,driver.findElement(By.cssSelector("#login_button_container > div > form > h3")).getText());
    }

    @Then("user will be directed to homepage with url {string}")
    public void userWillBeDirectedToHomepageWithUrl(String homepageUrl) {
        assertEquals(homepageUrl, driver.getCurrentUrl());
        assertEquals("Products", driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/div")).getText());
    }

    @When("user log into the account using username {string} and password {string}")
    public void userLogIntoTheAccountUsingUsernameAndPassword(String username, String password) {
        driver.get("https://www.saucedemo.com/v1/index.html");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
}

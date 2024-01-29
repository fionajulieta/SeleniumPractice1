package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class ShopCartStep extends Hooks{


    @Given("user is in homepage login with username {string} and password {string}")
    public void userIsInHomepageLoginWithUsernameAndPassword(String username, String password) {
        driver.get("https://www.saucedemo.com/v1/index.html");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        assertEquals("https://www.saucedemo.com/v1/inventory.html", driver.getCurrentUrl());
    }

    @When("user click shopping cart icon")
    public void user_click_shopping_cart_icon() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
    }

    @When("user click add to cart button for item {int}")
    public void userClickAddToCartButtonForItem(int itemNumber) {
        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div["+ itemNumber +"]/div[3]/button")).click();
    }

    @Then("item {int} are displayed in the shopping cart list")
    public void itemAreDisplayedInTheShoppingCartList(int itemNumberDisplayed) {
        String[] listItemDisplayed = {"empty","Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket","Sauce Labs Onesie","Test.allTheThings() T-Shirt (Red)"};
        assertTrue(driver.getPageSource().contains(listItemDisplayed[itemNumberDisplayed]));
    }
}

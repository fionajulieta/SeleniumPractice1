package StepDef;

import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver = WebDriverManager.chromedriver().create();


}

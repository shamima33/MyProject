package Steps;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class Registration {
    public static WebDriver driver;
    @Given("I am on the registration page")
    public void i_am_on_the_registration_page(){
        String url="https://abc9262.sg-host.com/";
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\workspace 4\\TestingDemo\\chromedriver.exe");
// Instantiate a ChromeDriver class.driver = new ChromeDriver();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }






    @When("I enter a valid Username {string}")
    public void i_enter_a_valid_username(String string) {
        driver.findElement(By.xpath("//*[@id=\"reg_username\"]")).sendKeys("Jon5D66oe123");

    }
    @When("I enter a valid Email address {string}")
    public void i_enter_a_valid_email_address(String string) {
        driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys("jo5hn66oe@example.com");

    }
    @When("I enter a valid Password {string}")
    public void i_enter_a_valid_password(String string) {
        driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("joho567e@example.com");

    }
    @When("I submit the registration form")
    public void i_submit_the_registration_form() {
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")).click
                ();

    }
    @Then("I should be automatically redirected to the customer login page")
    public void i_should_be_automatically_redirected_to_the_customer_login_page() {

    }

}



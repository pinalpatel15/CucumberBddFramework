package StepDefinition;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterStepDefinition {
    WebDriver driver;
    @Given("^User open browser And Enter urls$")
    public void user_open_browser_And_Enter_urls()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }

    @Then("^User click on Register Options$")
    public void user_click_on_Register_Options()  {
driver.findElement(By.className("ico-register")).click();
    }

    @Then("^User is on Register Page and verify the Login page titles$")
    public void user_is_on_Register_Page_and_verify_the_Login_page_titles()  {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Register",title);
    }

    @Then("^User select female radio button from Gender$")
    public void user_select_female_radio_button_from_Gender() {
        driver.findElement(By.id("gender-female")).click();
    }

    @Then("^user enter First name and Last name$")
    public void user_enter_First_name_and_Last_name(){
        driver.findElement(By.id("FirstName")).sendKeys("Pinal");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
    }

    @Then("^user select day, month and year from drop down option$")
    public void user_select_day_month_and_year_from_drop_down_option() {
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("15");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("June");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1988");
    }

    @Then("^user enter valid email$")
    public void user_enter_valid_email() {
        driver.findElement(By.id("Email")).sendKeys("pinal.patel11@yahoo.com");
    }

    @Then("^user enter Company name$")
    public void user_enter_Company_name()  {
        driver.findElement(By.id("Company")).sendKeys("Unify");
    }

    @Then("^user tick checkbox for Newsletter$")
    public void user_tick_checkbox_for_Newsletter() {
        driver.findElement(By.name("Newsletter")).click();
    }

    @Then("^user enter password$")
    public void user_enter_password()  {
        driver.findElement(By.id("Password")).sendKeys("Swaminarayan1!");
    }

    @Then("^user enter Confirm Password$")
    public void user_enter_Confirm_Password() {
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Swaminarayan1!");
    }

    @Then("^user click on Register button$")
    public void user_click_on_Register_button()  {
        driver.findElement(By.id("register-button")).click();

    }

    @Then("^user can Register successfully$")
    public void user_can_Register_successfully() {


    }

}

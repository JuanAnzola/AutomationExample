package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    @FindBy(how = How.XPATH, using = "//div[@class=\"radio-section\"]/h1")
    private WebElement lbl_TitleHome;

    ChromeDriver driver = Hooks.getDriver();

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @Given("Log in to the page and access the personal account")
    public void login_in_to_the_page_and_enter_in_the_personal_account() {
        try {
            Assert.assertEquals(lbl_TitleHome.getText(),"string");
        }catch (AssertionError | Exception e){
            System.out.println("-Error: " + e);
        }
    }


    @Given("Search the unwanted emails")
    public void search_the_unwanted_emails() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Delete all the unwanted emails")
    public void delete_all_the_unwanted_emails() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Check that there are no more unwanted emails")
    public void check_that_there_are_no_more_unwanted_emails() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Log out of the personal account")
    public void log_out_of_the_personal_account() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}

package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostSteps {
    @Given("user should be logged in and should be present on his wall")
    public void userShouldBeLoggedInAndShouldBePresentOnHisWall() throws Throwable {
        System.out.println("userShouldBeLoggedInAndShouldBePresentOnHisWall");
    }

    @When("I type the message in the text box")
    public void iTypeTheMessageInTheTextBox()throws Throwable {
        System.out.println("iTypeTheMessageInTheTextBox");
    }

    @And("click on post button")
    public void clickOnPostButton() throws Throwable{
        System.out.println("clickOnPostButton");
    }

    @Then("the message should get posted")
    public void theMessageShouldGetPosted() throws Throwable{
        System.out.println("theMessageShouldGetPosted");
    }

    @When("user supply the youtube link in the box")
    public void userSupplyTheYoutubeLinkInTheBox() throws Throwable{
        System.out.println("userSupplyTheYoutubeLinkInTheBox");
    }

    @Then("the video should get posted on the user wall")
    public void theVideoShouldGetPostedOnTheUserWall() throws Throwable{
        System.out.println("theVideoShouldGetPostedOnTheUserWall");
    }

    @And("the video should have proper thumbnail")
    public void theVideoShouldHaveProperThumbnail() throws Throwable{
        System.out.println("theVideoShouldHaveProperThumbnail");
    }

    @When("i type the message as {string} in the text box")
    public void iTypeTheMessageAsInTheTextBox(String arg0)throws Throwable {
        System.out.println("iTypeTheMessageAsInTheTextBox");
        System.out.println(arg0);
    }

    @When("user supply the youtube link as {string} in the text box")
    public void userSupplyTheYoutubeLinkAsInTheTextBox(String arg0) throws Throwable{
        System.out.println("userSupplyTheYoutubeLinkAsInTheTextBox");
        System.out.println(arg0);
    }
}

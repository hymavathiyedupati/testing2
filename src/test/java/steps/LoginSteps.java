package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginSteps {
    @Given("user is at the login page of the application")
    public void userIsAtTheLoginPageOfTheApplication() throws Throwable{
        System.out.println("userIsAtTheLoginPageOfTheApplication");
    }

    @When("user logs in with following username and password")
    public void userLogsInWithFollowingUsernameAndPassword(DataTable dataTable) throws Throwable{
        List<List<String>> data = dataTable.asLists(String.class);
        for (List<String> row : data) {
            for (String str : row) {
                System.out.println("Data : " + str);
//        List<List<String>> list_of_rows=dataTable.raw();
//        for(List<String> row:list_of_rows){
//            for(String str:row){
//                System.out.println("Data : " + str);
            }
        }
    }

    @Then("user should be able to login with correct username and password")
    public void userShouldBeAbleToLoginWithCorrectUsernameAndPassword() throws Throwable{
        System.out.println("userShouldBeAbleToLoginWithCorrectUsernameAndPassword");
    }
}

package co.com.bancolombia.certification.example.stepdefinitions;

import co.com.bancolombia.certification.example.questions.VerifyDashboard;
import co.com.bancolombia.certification.example.task.MakeLogin;
import co.com.bancolombia.certification.example.task.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStartSharpStepDefinitions {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }

    @Given("^(.*) get into the website of startSharp app$")
    public void alejandroGetIntoTheWebsiteOfStartSharpApp(String alejandro) {
        theActorCalled(alejandro).wasAbleTo(OpenUp.thePage());
    }


    @When("^he logged with the credentials (.*) and (.*) as password$")
    public void heLoggedWithTheCredentialsAdminAndSerenityAsPassword(String username, String password) {
        theActorInTheSpotlight().attemptsTo(MakeLogin.withCredentials(username, password));
    }

    @Then("^he should see the main dashboard with the title (.*)$")
    public void heShouldSeeTheDashboardOfTheApp(String dashboardTitle) {
        theActorInTheSpotlight().should(seeThat(VerifyDashboard.withTheTitle(dashboardTitle)));
    }
}

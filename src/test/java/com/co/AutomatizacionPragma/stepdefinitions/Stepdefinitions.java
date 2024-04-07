package com.co.AutomatizacionPragma.stepdefinitions;

import com.co.AutomatizacionPragma.models.ConstructorVAR;
import com.co.AutomatizacionPragma.questions.*;
import com.co.AutomatizacionPragma.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Stepdefinitions {

    @Before
    public void initSet() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that Kevin wants to open the page {string}")
    public void that_kevin_wants_to_open_the_page(String strUrl) {
        OnStage.theActorCalled("Kevin").wasAbleTo(Open.theWebSite(strUrl));
    }

    @When("Kevin enters all teh data requested in the record")
    public void kevin_enters_all_teh_data_requested_in_the_record(List<ConstructorVAR> constructorVars) {
        theActorInTheSpotlight().attemptsTo(Create.users(constructorVars));
    }

    @Then("Kevin completes the registration on the page")
    public void kevin_completes_the_registration_on_the_page(List<ConstructorVAR> constructorVars) {
        theActorInTheSpotlight().should(seeThat(Verify.createUser(constructorVars)));
    }

    @Then("Kevin fail the registration on the page")
    public void kevin_fail_the_registration_on_the_page(List<ConstructorVAR> constructorVars) {
        theActorInTheSpotlight().should(seeThat(Verify.createUser(constructorVars)));
    }

    @When("Kevin enters the login information")
    public void kevin_enters_the_login_information(List<ConstructorVAR> constructorVars) {
        theActorInTheSpotlight().attemptsTo(Login.tothepage(constructorVars));
    }

    @Then("Kevin successful Login")
    public void kevin_successful_login() {
        theActorInTheSpotlight().should(seeThat(Successful.login()));
    }

    @Then("Kevin fail Login")
    public void kevin_fail_login(List<ConstructorVAR> constructorVars) {
        theActorInTheSpotlight().should(seeThat(FailLogin.page(constructorVars)));
    }
    @When("Select the products to add")
    public void select_the_products_to_add() {
        theActorInTheSpotlight().attemptsTo(Select.products());
    }
    @Then("validate the shopping cart")
    public void validate_the_shopping_cart(List<ConstructorVAR> constructorVars) {
        theActorInTheSpotlight().should(seeThat(Validate.shoppingcart(constructorVars)));
    }
    @When("Go to shopping cart page")
    public void go_to_shopping_cart_page() {
        theActorInTheSpotlight().attemptsTo(GoToShopping.cart());
    }
    @Then("Validate product list")
    public void validate_product_list() {
        theActorInTheSpotlight().should(seeThat(ValidateShoppingCart.page()));
    }
}

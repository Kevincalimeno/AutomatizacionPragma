package com.co.AutomatizacionPragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.co.AutomatizacionPragma.userinterfaces.SamsungPage.BTNSHOPPINGCART;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToShopping implements Task {


    public static GoToShopping cart() {
        return Tasks.instrumented(GoToShopping.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        actor.attemptsTo(
                WaitUntil.the(BTNSHOPPINGCART, isVisible()),
                Click.on(BTNSHOPPINGCART)
        );
    }
}

package com.co.AutomatizacionPragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.AutomatizacionPragma.userinterfaces.LoginPage.LBLSAMSUNG;
import static com.co.AutomatizacionPragma.userinterfaces.SamsungPage.BTNADDCART;
import static com.co.AutomatizacionPragma.userinterfaces.SamsungPage.LBLSAMSUNG2;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Select implements Task {

    public static Select products() {
        return Tasks.instrumented(Select.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LBLSAMSUNG, isVisible()),
                Click.on(LBLSAMSUNG),
                WaitUntil.the(LBLSAMSUNG2, isVisible()),
                Click.on(BTNADDCART)
        );
    }
}

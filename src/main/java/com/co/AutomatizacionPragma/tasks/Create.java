package com.co.AutomatizacionPragma.tasks;

import com.co.AutomatizacionPragma.models.ConstructorVAR;

import static com.co.AutomatizacionPragma.userinterfaces.HomePage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Create implements Task {

    private List<ConstructorVAR> constructorVars;

    public Create(List<ConstructorVAR> constructorVars) {
        this.constructorVars = constructorVars;
    }

    public static Create users(List<ConstructorVAR> constructorVars) {
        return Tasks.instrumented(Create.class, constructorVars);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (ConstructorVAR constructorVar : constructorVars) {

            actor.attemptsTo(
                    WaitUntil.the(BTNSIGNUP, isVisible()),
                    Click.on(BTNSIGNUP),
                    WaitUntil.the(TXTUSERNAME, isVisible()),
                    Click.on(TXTUSERNAME),
                    Enter.theValue(constructorVar.getStrUsername()).into(TXTUSERNAME),
                    Click.on(TXTPASS),
                    Enter.theValue(constructorVar.getStrPassword()).into(TXTPASS),
                    Click.on(BTNSIGNUP2)
            );
        }
    }
}
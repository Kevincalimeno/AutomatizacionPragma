package com.co.AutomatizacionPragma.tasks;

import com.co.AutomatizacionPragma.models.ConstructorVAR;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.co.AutomatizacionPragma.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    private List<ConstructorVAR> constructorVars;

    public Login(List<ConstructorVAR> constructorVars) {
        this.constructorVars = constructorVars;
    }

    public static Login tothepage(List<ConstructorVAR> constructorVars) {
        return Tasks.instrumented(Login.class, constructorVars);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (ConstructorVAR constructorVar : constructorVars) {
            actor.attemptsTo(
                    WaitUntil.the(BTNLOGIN, isVisible()),
                    Click.on(BTNLOGIN),
                    WaitUntil.the(TXTUSERNAMELOGIN, isVisible()),
                    Click.on(TXTUSERNAMELOGIN),
                    Enter.theValue(constructorVar.getStrUsername()).into(TXTUSERNAMELOGIN),
                    Click.on(TXTPASSLOGIN),
                    Enter.theValue(constructorVar.getStrPassword()).into(TXTPASSLOGIN),
                    Click.on(BTNLOGIN2)
            );
        }
    }
}

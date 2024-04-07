package com.co.AutomatizacionPragma.questions;

import com.co.AutomatizacionPragma.userinterfaces.LoginPage;
import com.co.AutomatizacionPragma.util.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Successful implements Question<Boolean> {
    Boolean respuesta = false;

    public static Successful login() {
        return new Successful();
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        Wait.millis(4000);
        return LoginPage.LBLLOGIN.isVisibleFor(actor);
    }
}

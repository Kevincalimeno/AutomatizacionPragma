package com.co.AutomatizacionPragma.questions;

import com.co.AutomatizacionPragma.userinterfaces.ShoppingCartPage;
import com.co.AutomatizacionPragma.util.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateShoppingCart implements Question<Boolean> {

    Boolean respuesta = false;

    public static ValidateShoppingCart page() {
        return new ValidateShoppingCart();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Wait.millis(5000);
        respuesta = ShoppingCartPage.BTNDELETE.resolveFor(actor).isClickable();
        return respuesta;
    }
}

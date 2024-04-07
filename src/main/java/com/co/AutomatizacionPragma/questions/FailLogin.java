package com.co.AutomatizacionPragma.questions;

import com.co.AutomatizacionPragma.models.ConstructorVAR;
import com.co.AutomatizacionPragma.util.Utils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FailLogin implements Question<Boolean> {
    Boolean respuesta = false;
    private List<ConstructorVAR> constructorVars;

    public FailLogin(List<ConstructorVAR> constructorVars) {
        this.constructorVars = constructorVars;
    }

    public static FailLogin page(List<ConstructorVAR> constructorVars) {
        return new FailLogin(constructorVars);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String mensajePagina = alert.getText();
        Utils.formatiarAviso(mensajePagina);
        for (ConstructorVAR constructorVar : constructorVars) {
            respuesta = mensajePagina.equals(constructorVar.getStrFinalText());
        }
        return respuesta;
    }
}

package com.co.AutomatizacionPragma.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SamsungPage {
    public static final Target LBLSAMSUNG2 = Target.the("Label producto samsung").located(By.xpath("//h2[contains(text(),'Samsung galaxy s6')]"));

    public static final Target BTNSHOPPINGCART = Target.the("Boton para ir a pagina de carrito").located(By.id("cartur"));

    public static final Target BTNADDCART = Target.the("Boton añadir a carrito").located(By.xpath("//a[contains(text(),'Add to cart')]"));
}

package com.co.AutomatizacionPragma.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartPage {
    public static final Target LBLPRODUCTS = Target.the("Label Productos en pagina Carrito").located(By.xpath("//h2[contains(text(),'Products')]"));
    public static final Target BTNDELETE = Target.the("Boton delete").located(By.xpath("//tbody/tr[1]/td[4]/a[1]"));
}

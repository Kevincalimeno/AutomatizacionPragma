package com.co.AutomatizacionPragma.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target LBLLOGIN = Target.the("Label con el nombre de usuario").located(By.id("nameofuser"));

    public static final Target LBLSAMSUNG = Target.the("Label producto celular").located(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
}

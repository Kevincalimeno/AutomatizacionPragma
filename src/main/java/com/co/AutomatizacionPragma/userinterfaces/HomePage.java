package com.co.AutomatizacionPragma.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BTNSIGNUP = Target.the("Clic en el botón Sign UP").located(By.id("signin2"));
    public static final Target TXTUSERNAME = Target.the("Caja de texto username").located(By.id("sign-username"));
    public static final Target TXTPASS = Target.the("Caja de texto Password").located(By.id("sign-password"));
    public static final Target BTNSIGNUP2 = Target.the("Clic en el botón completar registro ").located(By.xpath("//button[contains(.,'Sign up')]"));

    public static final Target BTNLOGIN = Target.the("Clic en el botón de inicio de sesion").located(By.id("login2"));

    public static final Target TXTUSERNAMELOGIN = Target.the("Caja de texto username LOGIN").located(By.id("loginusername"));

    public static final Target TXTPASSLOGIN = Target.the("Caja de texto pass LOGIN").located(By.id("loginpassword"));

    public static final Target BTNLOGIN2= Target.the("Clic en el botón iniciar sesion ").located(By.xpath("//button[contains(text(),'Log in')]"));
}

package com.co.AutomatizacionPragma.tasks;

import com.co.AutomatizacionPragma.util.Utils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenTheWebSitePage implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(OpenTheWebSitePage.class);

    private String strUrl;

    public OpenTheWebSitePage(String strUrl) {
        this.strUrl = strUrl;
    }

    public <T extends Actor> void performAs(T actor) {
        String s = Utils.formatiarAviso("abriendo pagina Web Url. " + strUrl);
        LOGGER.info(s);
        actor.attemptsTo(Open.url(strUrl));
    }
}

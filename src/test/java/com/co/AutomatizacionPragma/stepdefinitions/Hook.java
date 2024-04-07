package com.co.AutomatizacionPragma.stepdefinitions;


import com.co.AutomatizacionPragma.models.ConstructorVAR;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class Hook {
    @DataTableType
    public ConstructorVAR defineConstructorVar(Map<String, String> dataTable) {
        // Crea una instancia de ConstructorVar usando los datos de la tabla
        return new ConstructorVAR
                (
                        dataTable.get("strUsername"),
                        dataTable.get("strPassword"),
                        dataTable.get("strFinalText")
                );
    }
}

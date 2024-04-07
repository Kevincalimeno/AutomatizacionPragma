package com.co.AutomatizacionPragma.models;

public class ConstructorVAR {

    private String strUsername, strPassword, strFinalText;

    public String getStrUsername() {
        return strUsername;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public String getStrFinalText() {
        return strFinalText;
    }

    public ConstructorVAR(String strUsername, String strPassword, String strFinalText) {
        this.strUsername = strUsername;
        this.strPassword = strPassword;
        this.strFinalText = strFinalText;
    }
}

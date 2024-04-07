package com.co.AutomatizacionPragma.util;

public class Utils {
    private static final String AVISO = "\n----------------------------------------------------------------\n%s\n----------------------------------------------------------------";
    public static final String URLDemoBlaze = "https://www.demoblaze.com/";
    public static final int ZERO = 0;

    public static String formatiarAviso(String texto) {
        return String.format(AVISO, texto);
    }
}

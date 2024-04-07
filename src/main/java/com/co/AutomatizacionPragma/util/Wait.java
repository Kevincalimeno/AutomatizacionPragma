package com.co.AutomatizacionPragma.util;

public class Wait {

    private Wait() { throw new IllegalStateException("Wait Exception");}

    public static void millis(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

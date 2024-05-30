package Widgets;

import Interface.Internet.Web;

public class Stock extends Web {

    /* 
     * WEB
     * public void buscar();
     * private void ver(){};
     * 
     * TOUCH
     * public void navegar();
     * public void clicar();
    */

    public void buscar() {
        System.out.println("Digitando Stock...");
    }

    public void navegar() {
        System.out.println("Deslizando pelas Stock...");
    }

    public void clicar() {
        System.out.println("Cliclando na Stock...");
        ver();
    }

    private void ver() {
        System.out.println("Mostando Stocks...");
    }
}

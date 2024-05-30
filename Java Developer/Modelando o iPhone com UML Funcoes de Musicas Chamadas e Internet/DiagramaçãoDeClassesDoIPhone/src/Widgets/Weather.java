package Widgets;

import Interface.Internet.Web;

public class  Weather extends Web {

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
        System.out.println("Digitando cidade...");
    }

    public void navegar() {
        System.out.println("Deslizando pelas cidade...");
    }

    public void clicar() {
        System.out.println("Cliclando na cidade...");
        ver();
    }

    private void ver() {
        System.out.println("Mostando o Clima na cidade...");
    }
}

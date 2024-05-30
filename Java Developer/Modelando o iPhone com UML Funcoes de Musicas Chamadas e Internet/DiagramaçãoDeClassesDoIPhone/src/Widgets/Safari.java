package Widgets;

import Interface.Funcionalidade.Visual;
import Interface.Internet.Web;

public class Safari extends Web implements Visual {
    /* 
     * WEB
     * public void buscar();
     * private void ver(){};

     *  VISUAL
     * private void iniciar(){};
     * public void aumentarZoom();
     * public void diminuirZoom();
     * 
     * TOUCH
     * public void navegar();
     * public void clicar();
    */

    public void buscar () {
        System.out.println("Digitando...");
        ver();
    }

    private void ver () {
        System.out.println("Buscando...");
        iniciar();
    }

    public void clicar() {
        System.out.println("Clicando no site...");
        iniciar();
    }

    private void iniciar() {
        System.out.println("Iniciando renderizacao...");
    }

    public void navegar() {
        System.out.println("Deslizando pelo site...");
    }

    public void aumentarZoom() {
        System.out.println("Aumentando o zoom do site...");
    }

    public void diminuirZoom() {
        System.out.println("Diminuindo zoom do site...");
    }

    public void abrirAba() {
        System.out.println("Abrindo nova aba...");
    }
}

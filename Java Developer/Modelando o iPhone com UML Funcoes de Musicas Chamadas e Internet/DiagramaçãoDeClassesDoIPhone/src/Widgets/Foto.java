package Widgets;

import Interface.Funcionalidade.Visual;

public class Foto implements Visual{
    /* 
     *  VISUAL
     * private void iniciar(){};
     * public void aumentarZoom();
     * public void diminuirZoom();
     * 
     * TOUCH
     * public void navegar();
     * public void clicar();
    */

    public void navegar() {
        System.out.println("Deslizando pelas fotos...");
    }

    public void clicar() {
        System.out.println("Clicando na foto...");
        iniciar();
    }

    private void iniciar() {
        System.out.println("Renderizando foto...");
    }

    public void aumentarZoom() {
        System.out.println("Aumentando zoom...");
    }

    public void diminuirZoom() {
        System.out.println("Diminuindo zoom...");
    }

    public void definirPapelParede() {
        System.out.println("Definindo como papel de parede...");
    }
}

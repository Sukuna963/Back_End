package Widgets;

import Interface.Funcionalidade.Visual;
import Interface.Internet.Web;

public class GoogleMaps extends Web implements Visual{

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

    public void pegarLocalizacaoUsuario() {
        System.out.println("Mostrando localizacao do usuario...");
    }

    public void buscar () {
        System.out.println("Digitando um lugar...");
        ver();
    }

    private void ver () {
        System.out.println("Encontrando o lugar...");
        iniciar();
    }

    private void iniciar() {
        System.out.println("Iniciando renderização...");
    }

    public void navegar() {
        System.out.println("Deslizando pelo mapa...");
    }

    public void aumentarZoom() {
        System.out.println("Aumentando o zoom do mapa...");
    }

    public void clicar() {
        System.out.println("Clicando no lugar escolhido...");
    }

    public void diminuirZoom() {
        System.out.println("Diminuindo zoom do mapa ...");
    }
}

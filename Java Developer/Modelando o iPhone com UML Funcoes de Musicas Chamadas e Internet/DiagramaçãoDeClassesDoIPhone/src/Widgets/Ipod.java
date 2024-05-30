package Widgets;

import Interface.Funcionalidade.Audio;

public class Ipod implements Audio {
    /* 
     *  Audio
     * private void iniciar(){};
     * public void aumentarVolume();
     * public void diminuirVolume();
     * 
     * TOUCH
     * public void navegar();
     * public void clicar();
    */

    public void navegar() {
        System.out.println("Deslizando pelas musicas...");
    }

    public void clicar() {
        System.out.println("Clicando na musica...");
        iniciar();
    }

    private void iniciar() {
        System.out.println("Tocando Musica...");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando volume...");
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo volume...");
    }

    public void pausar() {
        System.out.println("Pausando a musica...");
    }

    public void adiantar() {
        System.out.println("Adiantando a Musica...");
    }
}
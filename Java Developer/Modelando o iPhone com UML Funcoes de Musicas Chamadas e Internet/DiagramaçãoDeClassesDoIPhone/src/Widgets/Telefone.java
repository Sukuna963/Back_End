package Widgets;

import Interface.Funcionalidade.Audio;
import Interface.Input.Receber;

public class Telefone implements Audio, Receber {
    /* 
     * Audio
     * private void iniciar(){};
     * public void aumentarVolume();
     * public void diminuirVolume();
     * 
     * TOUCH
     * public void navegar();
     * public void clicar();
     * 
     * Receber
     * public void receber();
    */

    public void navegar() {
        System.out.println("Deslizando pelos contatos...");
    }

    public void clicar() {
        System.out.println("Clicando no contato...");
        iniciar();
    }

    private void iniciar() {
        System.out.println("Iniciando ligacao...");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando volume...");
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo volume...");
    }

    public void discar() {
        System.out.println("Discando Numero...");
        iniciar();
    }

    public void receber() {
        System.out.println("Recebendo chamada...");
        abrir();
    }

    private void abrir() {
        System.out.println("Atendendo chamada...");
    }

    public void colocarEspera() {
        System.out.println("Colocando chamada na espera...");
    }

    public void conferencia() {
        System.out.println("Iniciando conferencia...");
    }

    public void desligar() {
        System.out.println("Finalizando chamada...");
    }

}

package Widgets;

import Interface.Input.Receber;
import Interface.Output.Enviar;

public class Email extends Enviar implements Receber {
     /* 
     * Enviar
     * public void discar();
     * public void digitar();
     * public void enviar();
     * 
     * Receber
     * public void receber();
     * 
     * TOUCH
     * public void navegar();
     * public void clicar();
    */

    public void navegar() {
        System.out.println("Deslizando pelos email...");
    }

    public void clicar() {
        System.out.println("Clicando novo email...");
    }

    public void digitar() {
        System.out.println("Digitando mensagem...");
    }

    public void enviar() {
        System.out.println("Enviando E-mail...");
    }

    public void receber() {
        System.out.println("Recebendo E-mail...");
        abrir();
    }

    public void discar() {
        System.out.println("Discando endereco de e-mail...");
    }

    private void abrir() {
        System.out.println("Abrindo e-mail...");
    }
}

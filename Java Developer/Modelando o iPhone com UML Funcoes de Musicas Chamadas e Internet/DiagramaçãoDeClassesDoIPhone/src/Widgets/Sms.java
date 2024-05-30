package Widgets;

import Interface.Input.Receber;
import Interface.Output.Enviar;

public class Sms extends Enviar implements Receber{
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
        System.out.println("Deslizando pelas mensagens...");
    }

    public void clicar() {
        System.out.println("Clicando nova mensagem...");
    }

    public void digitar() {
        System.out.println("Digitando mensagem...");
    }

    public void enviar() {
        System.out.println("Enviando Mensagem...");
    }

    public void receber() {
        System.out.println("Recebendo mensagem...");
        abrir();
    }

    public void discar() {
        System.out.println("Discando Numero...");
    }

    private void abrir() {
        System.out.println("Abrindo mensagem...");
    }
}

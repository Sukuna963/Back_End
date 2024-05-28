package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();

        System.out.println("----");

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        System.out.println("----");

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
    }
}
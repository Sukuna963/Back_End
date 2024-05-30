package com.example;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final String NOME = "Banco Dio";
    private List<Conta> contas = new  ArrayList<>();;

    public void contasBanco(Conta conta) {
        contas.add(conta);
    }

    public void imprimiBancoInfo() {

        System.out.println(String.format("==== %s ====\nclientes:", this.NOME));
        getContas();
    }

    private void getContas() {
        for(Conta conta : contas) {
            System.out.println("  " + conta.cliente.getNome());
        }
    }
}

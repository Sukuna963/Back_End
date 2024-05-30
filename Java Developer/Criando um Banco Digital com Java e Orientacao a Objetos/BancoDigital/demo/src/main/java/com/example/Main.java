package com.example;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jose alves", "24756812457");
        Cliente cliente2 = new Cliente("Claudio alves", "18765874155");

        Banco banco = new Banco();
        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente1);
        Conta contaCorrente2 = new ContaCorrente(cliente2);
        Conta contaPoupanca2 = new ContaPoupanca(cliente2);

        banco.contasBanco(contaPoupanca);
        banco.contasBanco(contaPoupanca2);
        contaCorrente.depositar(700.00);
        contaCorrente.transferir(contaPoupanca,600.00);
        contaCorrente2.depositar(100.00);
        contaCorrente2.transferir(contaPoupanca,200.00);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
        contaCorrente2.imprimirExtrato();
        contaPoupanca2.imprimirExtrato();
        banco.imprimiBancoInfo();
    }
}

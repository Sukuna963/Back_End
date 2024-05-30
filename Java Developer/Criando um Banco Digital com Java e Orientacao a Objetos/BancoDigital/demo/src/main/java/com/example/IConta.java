package com.example;
public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta ContaDestino, double valor);
    void imprimirExtrato();
}

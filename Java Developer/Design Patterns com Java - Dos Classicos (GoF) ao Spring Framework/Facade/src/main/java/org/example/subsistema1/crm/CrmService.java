package org.example.subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente " + nome + " com as informacoes: " + cep + "/" + cidade + "-" + estado);
    }
}

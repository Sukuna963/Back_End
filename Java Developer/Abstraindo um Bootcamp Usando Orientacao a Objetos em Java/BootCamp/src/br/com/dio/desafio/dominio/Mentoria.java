package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * <h1>Mentoria</h1>
 * A classe descreve um Mentoria
 * <p>
 * <b>Note:</b> A classe possui os atributos e metodos
 *  da classe (Conteudo)
 *
 * @author  Leonardo Marques
 * @version 1.0
 * @since   09/04/2024
 */
public class Mentoria extends Conteudo {
    LocalDate data;

    public Mentoria() {}

    /**
     * Calcula o XP total do curso somando o XP_PADRAO
     * que esta definido na classe (Conteudo) pelo
     * valor padrao 20.0
     */
    @Override
    public double calcularXp(){
        return XP_PADRAO + 20.0;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
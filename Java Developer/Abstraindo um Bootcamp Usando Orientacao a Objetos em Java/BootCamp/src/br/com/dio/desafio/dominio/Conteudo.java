package br.com.dio.desafio.dominio;

/**
 * <h1>Conteudo</h1>
 * A classe descreve os conteudos
 * <p>
 * <b>Note:</b> A classe possui getters e settes dos atributos
 *  e um metodo abstract que esta sendo usado na classes (Curso)
 *
 * @author  Leonardo Marques
 * @version 1.0
 * @since   09/04/2024
 */
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10.0;
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

package br.com.dio.desafio.dominio;

/**
 * <h1>Curso</h1>
 * A classe descreve um Curso
 * <p>
 * <b>Note:</b> A classe possui os atributos e metodos
 *  da classe (Conteudo)
 *
 * @author  Leonardo Marques
 * @version 1.0
 * @since   09/04/2024
 */
public class Curso extends Conteudo {
    private int cargaHoraria;

    /**
     * Calcula o XP total do curso multiplicando o XP_PADRAO
     * que esta definido na classe (Conteudo) pela carga horaria
     * do (Curso)
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}

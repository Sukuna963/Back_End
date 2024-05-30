package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 * <h1>Dev</h1>
 * A classe descreve um dev
 * <p>
 * <b>Note:</b> A classe possui tres metodos de logica
 * de negocio
 *
 * @author  Leonardo Marques
 * @version 1.0
 * @since   09/04/2024
 */
public class Dev {

    private String nome;
    // Cria um LinkedHash dos Cursos que o aluno esta inscrito em ordem
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    // Cria um LinkedHash dos Cursos que o aluno concluiu em ordem
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    /**
     * Esta metodo e utilizado para armazenar os cursos
     * que o dev esta inscrito em (conteudosInscritos)
     * e tambem para armezar o dev no (getDevsInscritos())
     * da Classe BootCamp
     * @param bootcamp recebe um objeto de Bootcamp
     */
    public void inscrever(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    /**
     * Esse metodo extrai o primeiro conteudo de (conteudosInscritos)
     * se nao estiver vazio, ele adicionar o conteudo em (conteudosConcluidos)
     * e remove de (conteudosInscritos), senao ele retorna uma mensagem de error
     */
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Voce nao iniciou nenhum bootcamp.");
        }
    }

    /**
     *  Esse metodo calcula o xp total do dev, a medida que ele conclui
     *  os cursos
     * @return a soma dos xp dos curso concluidos
     */
    public double calcularTotalXp(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}

package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * <h1>BootCamp</h1>
 * A classe descreve um bootcamp
 * <p>
 * <b>Note:</b> Apenas possui gettes e settes dos atributos
 *
 * @author  Leonardo Marques
 * @version 1.0
 * @since   09/04/2024
 */
public class Bootcamp {

    private String nome;
    private String descricao;
    // Atraves do object LocalDate recebe a data atual
    private final LocalDate dataInicial = LocalDate.now();
    // Some-se a data atual mais 45 dias que seria o tempo de termino do BootCamp
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    // Armazena um HashSet de Devs que estao inscritos no BootCamp
    private Set<Dev> devsInscritos = new HashSet<>();
    // Armazena um LinkedHash de conteudo(cursos) que fazem parte do BootCamp
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devs) {
        this.devsInscritos = devs;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}

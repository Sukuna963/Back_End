import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

/**
 * <h1>Main</h1>
 * A classe principal do programa
 * <p>
 * <b>Note:</b> A classe possui as instancias
 * dos objetos das classes Curso, Mentoria,
 * BootCamp e Dev
 *
 * @author  Leonardo Marques
 * @version 1.0
 * @since   09/04/2024
 */
public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Aprender a programar em java");
        curso1.setCargaHoraria(87);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java OOP");
        curso2.setDescricao("Programacao Orientada a Objeto");
        curso2.setCargaHoraria(45);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Empregos na area de java");
        mentoria.setDescricao("Instrutora Camila da DIO");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Spring Experience");
        bootcamp.setDescricao("Framework Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscrever(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("-----");
        devJoao.progredir();
        System.out.println("Conteudos Restantes Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("-----");
        System.out.println("Total Xp: " + devJoao.calcularTotalXp());

        System.out.println("\n");

        Dev devJulia = new Dev();
        devJulia.setNome("Julia");
        devJulia.inscrever(bootcamp);
        System.out.println("Conteudos Inscritos Julia: " + devJulia.getConteudosInscritos());
        System.out.println("-----");
        devJulia.progredir();
        devJulia.progredir();
        System.out.println("Conteudos Restantes Julia: " + devJulia.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Julia: " + devJulia.getConteudosConcluidos());
        System.out.println("-----");
        System.out.println("Total Xp: " + devJulia.calcularTotalXp());
    }
}

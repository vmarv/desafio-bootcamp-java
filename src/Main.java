import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos VInicius:" + devVinicius.getConteudosIncritos());
        devVinicius.progredir();
        devVinicius.progredir();
        System.out.println("Conteudos Inscritos VInicius:" + devVinicius.getConteudosIncritos());
        System.out.println("Conteudos Concluidos VInicius:" + devVinicius.getConteudosConcluidos());
        System.out.println("XP: " + devVinicius.calcularTotalXP());

        System.out.println("------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João:" + devJoao.getConteudosIncritos());
        devJoao.progredir();
        System.out.println("Conteudos Inscritos João:" + devJoao.getConteudosIncritos());
        System.out.println("Conteudos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());

    }
}
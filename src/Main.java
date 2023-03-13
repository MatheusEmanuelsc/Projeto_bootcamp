import br.com.bootcamp.dio.dominio.Bootcamp;
import br.com.bootcamp.dio.dominio.Curso;
import br.com.bootcamp.dio.dominio.Dev;
import br.com.bootcamp.dio.dominio.Mentorias;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDesc("descrição de java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso php");
        curso2.setDesc("descrição de php ");
        curso2.setCargaHoraria(4);

        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDesc("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java ");
        bootcamp.setDesc("Descrição Bootcamp Java ");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devJao = new Dev();
        devJao.setNome("Jao");
        devJao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jao:" + devJao.getConteudosInscritos());
        devJao.progredir();
        devJao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jao:" + devJao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jao:" + devJao.getConteudosConcluidos());
        System.out.println("XP:" + devJao.calcularTotalXp());

        System.out.println("--------------------------------------------------------------");

        Dev devGab = new Dev();
        devGab.setNome("Gab");
        devGab.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gab:" + devGab.getConteudosInscritos());
        devGab.progredir();
        devGab.progredir();
        devGab.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gab:" + devGab.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Gab:" + devGab.getConteudosConcluidos());
        System.out.println("XP:" + devGab.calcularTotalXp());
    }
}
package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso sobre Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso sobre JavaSript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria sobre Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp sobre Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Felipe:" + devFelipe.getConteudosInscritos());

        devFelipe.progredir();
        System.out.println("Conteúdos inscritos Felipe:" + devFelipe.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Felipe:" + devFelipe.getConteudosConcluidos());
        System.out.println("XP:" + devFelipe.calcularTotalXp());

        System.out.println("------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila:" + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();

        System.out.println("Conteúdos inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
    }
}

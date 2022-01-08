package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descrição do Curso");
		curso.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Java2");
		curso2.setDescricao("Descrição do Curso2");
		curso2.setCargaHoraria(2);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição da mentoria");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("bootcampo Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev = new Dev();
		dev.setNome("Jair");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
		dev.progredir();
		dev.progredir();
		System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + dev.getConteudosConcluidos());
		System.out.println("XP: " + dev.calcularTotalXp());
		
		Dev dev2 = new Dev();
		dev2.setNome("João");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());
		
		
//		System.out.println(curso);
//		System.out.println(curso2);
//		System.out.println(mentoria);
	}

}

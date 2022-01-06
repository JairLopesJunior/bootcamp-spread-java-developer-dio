package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descri��o do Curso");
		curso.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Java2");
		curso2.setDescricao("Descri��o do Curso2");
		curso2.setCargaHoraria(2);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descri��o da mentoria");
		mentoria.setData(LocalDate.now());

		System.out.println(curso);
		System.out.println(curso2);
		System.out.println(mentoria);
	}

}

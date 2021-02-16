package br.com.Academy.Enums;

public enum Curso {
	
	ADMINISTRACAO("Administracao"),
	INFORMATICA("Informatica"),
	CONTABILIDADE("Contabilidade"),
	PROGRAMACAO("Programacao"),
	ENFERMAGEM("Enfermagem");
	
	private String curso;
	
	private Curso(String curso) {
		this.curso = curso;
	}
}

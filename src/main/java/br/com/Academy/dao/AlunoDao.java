package br.com.Academy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Academy.model.Aluno;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {

}

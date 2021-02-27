package br.com.rogerioreis.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rogerioreis.curso.entity.Matric_Disc_Aluno;

@Repository
public interface MatricDiscAlunoDao extends JpaRepository<Matric_Disc_Aluno, Long> {

}

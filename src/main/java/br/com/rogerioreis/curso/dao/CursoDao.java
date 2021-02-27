package br.com.rogerioreis.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rogerioreis.curso.entity.Curso;

@Repository
public interface CursoDao extends JpaRepository<Curso, Long> {

}

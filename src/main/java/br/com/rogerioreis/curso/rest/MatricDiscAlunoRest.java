package br.com.rogerioreis.curso.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rogerioreis.curso.dao.MatricDiscAlunoDao;
import br.com.rogerioreis.curso.entity.Matric_Disc_Aluno;

@RestController
@RequestMapping("/matDiscAluno")
public class MatricDiscAlunoRest {
	
	@Autowired
	private MatricDiscAlunoDao matricDiscAlunoDao;
	
	@GetMapping
	public List<Matric_Disc_Aluno> get(){
		return matricDiscAlunoDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Matric_Disc_Aluno matdiscAluno) {
		matricDiscAlunoDao.save(matdiscAluno);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		matricDiscAlunoDao.deleteById(id);
	}

}

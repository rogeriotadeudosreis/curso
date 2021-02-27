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

import br.com.rogerioreis.curso.dao.AlunoDao;
import br.com.rogerioreis.curso.entity.Aluno;

@RestController
@RequestMapping("/aluno")
public class AlunoRest {
	
	@Autowired
	private AlunoDao alunoDao;
	
	@GetMapping
	public List<Aluno> get(){
		return alunoDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Aluno aluno) {
		alunoDao.save(aluno);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		alunoDao.deleteById(id);
	}
	
	
	
	
	
	

}

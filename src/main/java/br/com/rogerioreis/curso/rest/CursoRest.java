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

import br.com.rogerioreis.curso.dao.CursoDao;
import br.com.rogerioreis.curso.entity.Curso;

@RestController
@RequestMapping("/curso")
public class CursoRest  {
	
	@Autowired
	private CursoDao cursoDao;
	
	@GetMapping
	public List<Curso> get(){
		return cursoDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Curso curso) {
		cursoDao.save(curso);
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable("id") Long id) {
		cursoDao.deleteById(id);
	}
	
}

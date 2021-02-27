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

import br.com.rogerioreis.curso.dao.DisciplinaDao;
import br.com.rogerioreis.curso.entity.Disciplina;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaRest {
	
	@Autowired
	private DisciplinaDao discDao;
	
	@GetMapping
	public List<Disciplina> get(){
		return discDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Disciplina disciplina) {
		discDao.save(disciplina);		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		discDao.deleteById(id);
	}

}

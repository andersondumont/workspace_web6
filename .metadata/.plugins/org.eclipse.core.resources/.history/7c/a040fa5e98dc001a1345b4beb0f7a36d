package br.com.dumontcorp.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.dumontcorp.projetofinal.dao.AgenciaDAO;
import br.com.dumontcorp.projetofinal.model.Agencia;

@RestController
public class AgenciaController {
	@Autowired
	AgenciaDAO dao;
	
	@GetMapping("/agencias")
	public ArrayList<Agencia> getAll(){
		ArrayList<Agencia> lista;
		lista = (ArrayList<Agencia>)dao.findAll();
		return lista;
	}
	
/*	@GetMapping("/departamentos/{id}")
	public ResponseEntity<Departamento> getPeloId(@PathVariable int id){
		Departamento result = dao.findById(id).orElse(null);
		if (result != null) {
			return ResponseEntity.ok(result);
		}else {
			return ResponseEntity.status(404).build();
		}
		
	}*/

}
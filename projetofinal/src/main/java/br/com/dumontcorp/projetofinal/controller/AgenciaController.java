package br.com.dumontcorp.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dumontcorp.projetofinal.dao.AgenciaDAO;
import br.com.dumontcorp.projetofinal.model.Agencia;

@RestController
@CrossOrigin("*")
public class AgenciaController {
	@Autowired
	AgenciaDAO dao;
	
	@GetMapping("/agencias")
	public ArrayList<Agencia> getAllAgencias(){
		ArrayList<Agencia> lista;
		lista =  dao.findAllByOrderByNome();
		return lista;
	}

}
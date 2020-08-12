package br.com.dumontcorp.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.dumontcorp.projetofinal.dao.AgendamentoDAO;
import br.com.dumontcorp.projetofinal.model.Agencia;
import br.com.dumontcorp.projetofinal.model.Agendamento;

@RestController
@CrossOrigin("*")
public class AgendamentoController {
    
	@Autowired
	AgendamentoDAO dao;
	
	@PostMapping("/agendamentos/novo")
	public ResponseEntity<Agendamento> inserirNovoAgendamento(@RequestBody Agendamento novo){
		
//		System.out.println("DEBUG - HORA - "+novo.getHoraAgendamento().toString());
//		System.out.println("DEBUG - DATA - "+novo.getDataAgendamento().toString());
		
		try {
			dao.save(novo);
			return ResponseEntity.status(201).body(novo);
		}
		catch(Exception ex) {
			return ResponseEntity.status(400).build(); // requisicao errada
		}
	}
	
	@GetMapping("/agendamentos/todos")
	public ArrayList<Agendamento> recuperarTodos(){
		ArrayList<Agendamento> lista;
		lista = (ArrayList<Agendamento>)dao.findAll();
		return lista;
	}
	
	@GetMapping("/agendamentos/filtrarporcliente")
	public ArrayList<Agendamento> filtrarPorCliente(@RequestParam(name="nomecli") String nome){
		System.out.println("nome do cliente = "+nome);
		return dao.findAllByNomeClienteContaining(nome);
	}
	@GetMapping("/agendamentos/filtrarporagencia")
	public ArrayList<Agendamento> filtrarPorAgencia(@RequestParam(name="agencia") int agencia){
		System.out.println("agencia = "+agencia);
		Agencia ag = new Agencia();
		ag.setId(agencia);
		return dao.findAllByAgencia(ag);
	}
}
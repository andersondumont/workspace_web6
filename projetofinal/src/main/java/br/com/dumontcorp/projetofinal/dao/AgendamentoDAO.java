package br.com.dumontcorp.projetofinal.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.dumontcorp.projetofinal.model.Agencia;
import br.com.dumontcorp.projetofinal.model.Agendamento;

public interface AgendamentoDAO extends CrudRepository<Agendamento, Integer> {
	
	public ArrayList<Agendamento> findAllByNomeClienteContaining(String nomeCliente);
	
	public ArrayList<Agendamento> findAllByAgencia(Agencia agencia);

	
	
}
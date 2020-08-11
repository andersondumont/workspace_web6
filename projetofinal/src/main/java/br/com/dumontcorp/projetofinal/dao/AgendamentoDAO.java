package br.com.dumontcorp.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.dumontcorp.projetofinal.model.Agendamento;

public interface AgendamentoDAO extends CrudRepository<Agendamento, Integer>{

}
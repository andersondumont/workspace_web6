package br.com.dumontcorp.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.dumontcorp.projetofinal.model.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer>{

}
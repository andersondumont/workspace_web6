package com.isidrocorp.hello.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isidrocorp.hello.model.Produto;

@RestController
public class ProdutoController {
	@GetMapping ("/produtoexemplo")
	public Produto getInfoProduto() {
		Produto p = new Produto();
		p.setId(9876);
		p.setDescricao("Computador zerado");
		p.setPreco(3500);
		return p;
	}
	@GetMapping ("/produtos")
	public ArrayList<Produto> getAll(){
		ArrayList<Produto> lista = new ArrayList<Produto>();
		for (int cont=1; cont <= 10; cont++);
		
	}
}
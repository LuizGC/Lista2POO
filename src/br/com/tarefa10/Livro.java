package br.com.tarefa10;

import java.util.List;

public class Livro {

	private String nome;
	private List<String> autores;
	private Editora editora;
	
	
	
	
	public Livro(String nome, List<String> autores, Editora editora) {
		this.nome = nome;
		this.autores = autores;
		this.editora = editora;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public List<String> getAutores() {
		return autores;
	}




	public void setAutores(List<String> autores) {
		this.autores = autores;
	}




	public Editora getEditora() {
		return editora;
	}




	public void setEditora(Editora editora) {
		this.editora = editora;
	}




	@Override
	public boolean equals(Object obj) {
		return this.nome.equals(((Livro) obj).getNome());
	}
	
	
}

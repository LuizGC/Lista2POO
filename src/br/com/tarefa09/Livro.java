package br.com.tarefa09;

public class Livro {

	private String nome, autores, editora;

	public String getNome() {
		return nome;
	}
	
	public Livro(String nome, String autores, String editora) {
		this.nome = nome;
		this.autores = autores;
		this.editora = editora;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.nome.equals(((Livro) obj).getNome());
	}
	
	
}

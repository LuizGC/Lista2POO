package br.com.tarefa10;

import java.util.List;

public interface Usuario {

	public void addLivro(String nome, List<String> autores, Editora editora);
	public int addLivro(Livro livro);
	public Livro getLivro(String nome);
	public List<Livro> getLivros();
	
}

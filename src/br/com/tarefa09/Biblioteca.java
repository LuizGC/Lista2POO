package br.com.tarefa09;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private final int MAXLIV = 50;
	private List<Livro> acervo;
	
	public Biblioteca() {
		acervo = new ArrayList<Livro>();
	}
	
	public void addLivro(String nome, String autores, String editora){
		this.addLivro(new Livro(nome, autores, editora));
	}
	
	public int addLivro(Livro livro){
		if(acervo.size() < MAXLIV)
			acervo.add(livro);
		return acervo.size();
	}
	
	public void removerLivro(String nome){
		acervo.remove(this.getLivro(nome));
	}
	
	public Livro getLivro(String nome){
		Livro livroDesejado = new Livro(nome, "", "");
		for (Livro livro : acervo) {
			if(livro.equals(livroDesejado)){
				System.out.println("Nome: " + livro.getNome() + " Autores: " + livro.getAutores() + " Editora: " + livro.getEditora());
				return livro;
			}
		}
		System.out.println("N‹o existe o livro!");
		return null;
	}
	
	public List<Livro> getLivros(){
		return this.acervo;
	}
	
	public int sizeAcervo(){
		return acervo.size();
	}
	
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.addLivro("1", "12", "13");
		biblioteca.addLivro("2", "22", "23");
		biblioteca.addLivro(new Livro("3", "32", "33"));
		biblioteca.addLivro(new Livro("4", "42", "43"));
		
		biblioteca.getLivro("1");
		biblioteca.getLivro("5");
		
		System.out.println("\nImprimir acervo!");
		for (Livro livro : biblioteca.getLivros()) {
			System.out.println("Nome: " + livro.getNome() + " Autores: " + livro.getAutores() + " Editora: " + livro.getEditora());
		}
		
		System.out.println("\n Excluir dois Livros");
		biblioteca.removerLivro("2");
		biblioteca.removerLivro("5");
		biblioteca.removerLivro("4");
		
		System.out.println("\nImprimir acervo!");
		for (Livro livro : biblioteca.getLivros()) {
			System.out.println("Nome: " + livro.getNome() + " Autores: " + livro.getAutores() + " Editora: " + livro.getEditora());
		}
			
	}
	
}

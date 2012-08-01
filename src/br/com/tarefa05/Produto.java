package br.com.tarefa05;

public class Produto {

	private int id;
	private double preco;
	private int estoque;
	
	public Produto(int id) {
		this.id = id;
		this.preco = 0;
		this.estoque = 0;
	}
	
	public int getId() {
		return id;
	}

	public int getEstoque() {
		return estoque;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setPreco(int porcentagem) {
		this.preco = this.preco + (this.preco/100)*porcentagem;
	}
	
	public void add(){
		this.estoque++;
	}
	
	public void remover(){
		if(estoque>0){
			estoque--;
		}
	}	
	
	public void inserirEstoque(int quantidade){
		for(int i =0; i < quantidade; i++){
			this.add();
		}
	}
	
	public String vender(int quantidade){
		for(int i =quantidade; i > 0; i--){
			if(this.getEstoque() == 0)
				return "N‹o foi poss’vel vender " + i +" produtos, fim do estoque." ;
			else
				this.remover();
		}
		return "Venda realizada com sucesso!";
	}
	
	public static void main(String[] args) {
		Produto um = new Produto(1);
		Produto dois = new Produto(2);
		
		um.setPreco(2.00);
		um.inserirEstoque(10);
		System.out.println(um.vender(35));
		um.setPreco(50);
		System.out.println(um.getPreco());
		
		dois.setPreco(100.00);
		dois.inserirEstoque(20);
		System.out.println(dois.vender(10));
		dois.setPreco(70);
		System.out.println(dois.getPreco());
	}
	
	
	
}

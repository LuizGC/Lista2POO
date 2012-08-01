package br.com.tarefa03;

public class Cubo {

	private int aresta;

	public Cubo() {
		this.aresta = 10;
	}
	
	public Cubo(int aresta) {
		this.aresta = aresta;
	}

	public int getAresta() {
		return aresta;
	}

	public void setAresta(int aresta) {
		this.aresta = aresta;
	}
	
	public int volume(){
		return  (int)Math.pow(this.aresta, 3);
	}
	
	public static void main(String[] args) {
		Cubo cubo = new Cubo();
		System.out.println(cubo.getAresta());
		System.out.println(cubo.volume());
		
		cubo.setAresta(20);
		System.out.println(cubo.getAresta());
		System.out.println(cubo.volume());
		
		cubo = new Cubo(50);
		System.out.println(cubo.getAresta());
		System.out.println(cubo.volume());
		
		cubo.setAresta(100);
		System.out.println(cubo.getAresta());
		System.out.println(cubo.volume());
	}
	
}

package br.com.tarefa07;

public class Ponto2D {

	private int x;
	private int y;
	
	public Ponto2D() {
		this.x = 0;
		this.y = 0;
	}

	public Ponto2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Ponto2D(Ponto2D ponto) {
		this.x = ponto.getX();
		this.y = ponto.getY();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public double distanciaAte(Ponto2D ponto){
		return Math.sqrt(Math.pow(this.x - ponto.getX(), 2) + Math.pow(this.y - ponto.getY(), 2));
	}
	
	
	public static void main(String[] args) {
		Ponto2D ponto1 = new Ponto2D(-4, 4);
		Ponto2D ponto2 = new Ponto2D(ponto1);
		
		ponto1.setX(-2);
		ponto1.setY(-3);
		
		System.out.println(ponto1.distanciaAte(ponto2));
	}
	
}

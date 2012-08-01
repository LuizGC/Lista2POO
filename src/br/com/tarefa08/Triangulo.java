package br.com.tarefa08;

import br.com.tarefa07.Ponto2D;

public class Triangulo {

	private Ponto2D vertice1, vertice2, vertice3;
	private double lado1, lado2, lado3;

	public Triangulo(Ponto2D vertice1, Ponto2D vertice2, Ponto2D vertice3) {
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
		this.lado1 = this.vertice1.distanciaAte(this.vertice2);
		this.lado2 = this.vertice2.distanciaAte(this.vertice3);
		this.lado3 = this.vertice3.distanciaAte(this.vertice1);
	}

	public static boolean formaTriangulo(Ponto2D p1, Ponto2D p2, Ponto2D p3) {
		if (p1.distanciaAte(p2) + p1.distanciaAte(p3) > p2.distanciaAte(p3)
				&& (p1.distanciaAte(p2) + p2.distanciaAte(p3) > p3
						.distanciaAte(p1))
				&& (p2.distanciaAte(p3) + p1.distanciaAte(p3) > p1
						.distanciaAte(p2))) {
			return true;
		}

		return false;
	}

	public boolean equilatero() {
		if ((lado1 == lado2) && (lado2 == lado3))
			return true;
		return false;
	}

	public boolean isosceles() {
		if ((lado1 == lado2) || (lado2 == lado3))
			return true;
		return false;
	}

	public boolean escaleno() {
		if (((lado1 != lado2) && (lado2 != lado3)) && (lado1 != lado3))
			return true;
		return false;
	}

	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	public double area() {
		double sp = ((lado1 + lado2 + lado3) / 2);
		return (Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3)));
	}

	public static void main(String[] args) {
		Ponto2D v1 = new Ponto2D(4, 3);
		Ponto2D v2 = new Ponto2D(2, 9);
		Ponto2D v3 = new Ponto2D(5, 4);
		Triangulo t1 = new Triangulo(v1, v2, v3);

		System.out.println("ƒ um tri‰ngulo? " + formaTriangulo(v1, v2, v3));
		System.out.println("ƒ um Equil‡tero? " + t1.equilatero());
		System.out.println("ƒ um Is—sceles? " + t1.isosceles());
		System.out.println("ƒ um Escaleno? " + t1.escaleno());
		System.out.println("A ‡rea do Tri‰ngulo t1 Ž: " + t1.area());
		v1.setX(1);
		v1.setY(0);
		v2.setX(3);
		v2.setY(2);
		v3.setX(5);
		v3.setY(4);
		System.out.println("ƒ um tri‰ngulo? " + formaTriangulo(v1, v2, v3));
	}

}

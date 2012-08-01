package br.com.tarefa06;

public class Conta {

	private int id;
	private double saldo;
	
	public Conta(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public double saque(double valor){
		if(this.saldo >= valor){
			this.saldo = this.saldo - valor;
		}
		return this.saldo;
	}
	
	public double deposito(double valor){
		return this.saldo = this.saldo + valor;
	}
	
	public double tranferencia(double valor, Conta destino){
		if(this.saldo >= valor){
			destino.deposito(valor);
			return this.saque(valor);
		}
		return this.saldo;
	}
	
	public static void main(String[] args) {
		Conta um = new Conta(1);
		Conta dois = new Conta(2);
		
		System.out.println("um deposito " + um.deposito(300.00));
		System.out.println("dois deposito " + dois.deposito(100.00));
		
		
		System.out.println("um saque de 100 = " + um.saque(100));
		System.out.println("dois saque de 200 = " + dois.saque(200));
		
		System.out.println("um tranferencia de 150 para dois, saldo de um = " + um.tranferencia(150, dois));
		System.out.println("dois saque de 200 = " + dois.saque(200));
	}
	
}

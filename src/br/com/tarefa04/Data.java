package br.com.tarefa04;

public class Data {

	private int dia;
	private int mes = 4;
	private int ano = 2012;

	public Data(int dia) {
		this.dia = dia;
	}

	public Data(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
	}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	} 
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public static void main(String[] args) {
		Data data = new Data(12);
		System.out.println(data.getDia()+"/"+data.getMes()+"/"+data.getAno());
		
		data = new Data(24, 8);
		System.out.println(data.getDia()+"/"+data.getMes()+"/"+data.getAno());

		data = new Data(26, 6, 1989);
		System.out.println(data.getDia()+"/"+data.getMes()+"/"+data.getAno());
	}

}

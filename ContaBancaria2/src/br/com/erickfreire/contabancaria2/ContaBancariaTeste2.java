package br.com.erickfreire.contabancaria2;

public class ContaBancariaTeste2 {
	public static void main(String[] args) {
		
		ContaBancaria2 conta1 = new ContaBancaria2("Joao Silva");
		ContaBancaria2 conta2 = new ContaBancaria2("Maria Oliveira");
		
		System.out.printf("O nome do cliente 1 é: %s%n", conta1.getNome());
		System.out.printf("O nome do cliente 2 é: %s%n", conta2.getNome());
	}

}

package br.com.logica.inicio;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		double salario,med,tran, taxa, valor,calc, calcliq;
		med = 7;
		tran = 6.22;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu salário: ");
		salario = entrada.nextDouble();
		
		
		calc = salario/100*(med+tran);
		calcliq = salario - calc;
		
		System.out.println("O valor de desconto é : "+calc);
		System.out.println("O valor final é : "+calcliq);
		

	}

}

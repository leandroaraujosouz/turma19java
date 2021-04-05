package lista2;

import java.util.Scanner;

public class Exer4 {

	/*
	 * 	Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		Scanner leia = new Scanner(System.in);
		double raiz;
		double potencia;
		System.out.println("Digite um numero:");
		numero = leia.nextInt();
		
		if(numero%2 ==0 && numero > 0)
		{
			System.out.printf("O numero %d é par",numero);
			raiz = Math.sqrt((double)numero);
			System.out.printf("A raiz quadrada de %d é %.2f",numero,raiz);
		}
		else if(numero%2 ==1 && numero > 0)
		{
			System.out.printf("O numero %d é impar",numero);
			System.out.printf("A elevação ao quadrado de %d é %.2f",numero,Math.pow(numero,2));
		}
	}

}

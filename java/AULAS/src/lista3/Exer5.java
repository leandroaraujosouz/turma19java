package lista3;

import java.util.Scanner;

public class Exer5 {
	/*
	 * 	Crie um programa que leia um n�mero do teclado at� que encontre um
		n�mero igual a zero. No final, mostre a soma dos n�meros
		digitados.(DO...WHILE)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int numero;
		int soma=0;
		do
		{
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			soma = soma+numero;
		}while(numero != 0);
		
		System.out.println("Soma dos numeros: "+soma);
	}

}

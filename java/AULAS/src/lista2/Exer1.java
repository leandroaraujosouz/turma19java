package lista2;

import java.util.Scanner;

public class Exer1 {
	//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int maior = 0;
		Scanner leia = new Scanner(System.in);
		for(int x=1; x <= 3; x++)
		{
			System.out.printf("Digite o %d numero:",x);
			numero = leia.nextInt();
			if(maior < numero)
			{
				maior = numero;
			}
		}
		System.out.println("O maior numero �: "+maior);
	}

}

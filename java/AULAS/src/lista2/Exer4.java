package lista2;

import java.util.Scanner;

public class Exer4 {

	/*
	 * 	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		�mpar exiba o n�mero elevado ao quadrado.
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
			System.out.printf("O numero %d � par",numero);
			raiz = Math.sqrt((double)numero);
			System.out.printf("A raiz quadrada de %d � %.2f",numero,raiz);
		}
		else if(numero%2 ==1 && numero > 0)
		{
			System.out.printf("O numero %d � impar",numero);
			System.out.printf("A eleva��o ao quadrado de %d � %.2f",numero,Math.pow(numero,2));
		}
	}

}

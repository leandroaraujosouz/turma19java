package lista3;

import java.util.Scanner;

public class exer6 {
	
	/*
	 * 	Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		double numero;
		double media=0;
		double contador =0;
		do
		{
			System.out.println("Digite um numero: ");
			numero = leia.nextDouble();
			if(numero%3 == 0 && numero > 0)
			{
				media += numero;
				contador++;
			}
		}while(numero != 0);
		media = media/contador;
		System.out.printf("m�dia dos n�meros m�ltiplos de 3: %.2f",media);
	}

}

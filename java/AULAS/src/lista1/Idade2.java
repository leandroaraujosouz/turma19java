package lista1;

import java.util.Scanner;

public class Idade2 {
	public static void main(String[] args) {
		int ano,mes,dia,dias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite quantos dias você viveu: ");
		dia = leia.nextInt();
		ano = dia/365;
		mes = dia%365/30;
		dias=dia%365%30;

		System.out.println("Sua idade é "+ano+" anos "+mes+" meses e "+dias+" dias");
	}
}

package Exemplo;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Olá mundo");
		linha();
		Scanner leia = new Scanner(System.in);
		
	}

	public static void linha() {
		System.out.println();
		System.out.println(soma(10,5));
	}
	
	public static int soma(int n1, int n2)
	{
		int soma;
		soma = n1+n2;
		return soma;
	}
}

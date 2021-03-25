package lista1;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade,mes,dia;
		Scanner leia = new Scanner(System.in);
		
		int diasVida;
		System.out.println("digite sua idade: ");
		idade = leia.nextInt();
		System.out.println("digite quantos meses: ");
		mes = leia.nextInt();
		System.out.println("digite os dias: ");
		dia = leia.nextInt();

		diasVida=((idade*365)+(mes*30)+dia);
		System.out.println("Você tem "+diasVida+" dias vividos");
	}

}

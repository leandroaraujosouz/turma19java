package lista2;

import java.util.Scanner;

public class Exer3 {

	/* 
	 * 	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		categoria ela se encontra:
		 10-14 infantil
		 15-17 juvenil
		 18-25 adulto
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		
		if(idade >=10 && idade <=14)
		{
			System.out.println("Sua categoria é Infantil");
		}
		else if(idade >=15 && idade <=17)
		{
			System.out.println("Sua categoria é Juvenil");
		}
		else if(idade >=18 && idade <=25)
		{
			System.out.println("Sua categoria é Adulto");
		}
		else
		{
			System.out.println("Você não faz parte de nenhuma categoria!!!");
		}
	}

}

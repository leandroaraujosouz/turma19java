package lista3;

import java.util.Scanner;

public class Exer3 {
	/*
	 * 	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int	idade = 0;
		int mais50=0;
		int ate21 =0;
		while(idade != -99)
		{
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			if(idade < 21 && idade >=0)
			{
				ate21++;
			}
			else if(idade > 50)
			{
				mais50++;
			}
		}
		
		System.out.println("Total de pessoas com idade menor que 21 anos: "+ate21);
		System.out.println("Total de pessoas com idade maior que 50 anos: "+mais50);

	}

}

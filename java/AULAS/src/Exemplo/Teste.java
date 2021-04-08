package Exemplo;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int numero;
		int x=0;
		//System.out.println("Digite um numero: ");
		//numero = leia.nextInt();
		char continua = 'S';
		while(continua == 'S' || x < 10)
		{
			System.out.println(x+" ");
			x+=5;
			
			System.out.print("Você deseja conitnuar? S - Sim N - Não\nDigite uma Opção: ");
			continua = leia.next().toUpperCase().charAt(0);
			do
			{
				if(continua != 'S' && continua != 'N')
				{
					System.out.println("Opção invalida tente novamente");
					System.out.print("Você deseja conitnuar? S - Sim N - Não\nDigite uma Opção: ");
					continua = leia.next().toUpperCase().charAt(0);
				}
			}while(continua != 'S' && continua != 'N');
			
			
		}
		
		System.out.println("O programa acaba aqui");
		
	}

}

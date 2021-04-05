package lista2;

import java.util.Scanner;

public class Exer2 {

	//Faça um programa que entre com três números e coloque em ordem crescente.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int numero[] = new int[3];
		int troca;
		for(int x=0; x < 3; x++)
		{
			System.out.printf("Digite o %d numero:",x+1);
			numero[x] = leia.nextInt();
		}
		
		for(int x=0; x < 2; x++)
		{
			for(int y=1; y < 3; y++)
			{
				if(numero[y] < numero[x])
				{
					troca = numero[x];
					numero[x] = numero[y];
					numero[y] = troca;
				}
			}
		}
		
		for(int x=0; x < 3; x++)
		{
			System.out.printf("%d |",numero[x]);
			
		}
	}

}

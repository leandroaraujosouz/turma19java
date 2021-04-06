package lista3;

import java.util.Scanner;

public class Exer2 {
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	public static void main(String args[])
	{
		int numero;
		int par = 0;
		int impar = 0;
		Scanner leia = new Scanner(System.in);
		
		for(int x=1;x<=10;x++)
		{
			System.out.printf("Digite o numero%d: ",x);
			numero = leia.nextInt();
			if(numero%2 == 0 && numero > 0)
			{
				par++;
			}
			else if(numero%2 == 1 && numero > 0)
			{
				impar++;
			}
		}
		System.out.println("Quantidade de numeros pares: "+par);
		System.out.println("Quantidade de numeros impares: "+impar);
	}
}

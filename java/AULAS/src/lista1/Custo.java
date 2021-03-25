package lista1;

import java.util.Scanner;

public class Custo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double impostoEstado = 0.45;
		double impostoFabrica = 0.28;
		double valorInicial;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor inicial: ");
		valorInicial = leia.nextDouble();
		double total = valorInicial + (valorInicial * impostoEstado) + (valorInicial * impostoFabrica); 
		System.out.printf("O valor total a ser pago é de: %.2f", total);
	
	}
}

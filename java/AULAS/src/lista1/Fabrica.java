package lista1;

import java.util.Scanner;

public class Fabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempoSegundos, horas,minutos, segundos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite o Total de segundos do evento: ");
		tempoSegundos = leia.nextInt();
		horas = tempoSegundos/(60*60);
		minutos = tempoSegundos%(60*60)/60;
		segundos = tempoSegundos%(60*60)%60;

		System.out.println("o tempo do evento é "+horas+":"+minutos+":"+segundos);
	}

}

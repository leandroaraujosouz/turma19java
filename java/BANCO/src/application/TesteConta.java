package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Conta;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Conta contajoao = new Conta();
		
		System.out.println("Digite o numero da conta: ");
		contajoao.numero = leia.nextInt();
		
		System.out.println("Digite o cpf da conta: ");
		contajoao.cpf = leia.next();
		
		System.out.println("Digite o valor");
		double valor = leia.nextDouble();
		
		System.out.println("Opera��o de 1-credito ou 2-debito ?");
		char opcao = leia.next().charAt(0);
		if(opcao == '1')
		{
			contajoao.credito(valor);
		}
		else if(opcao == '2')
		{
			contajoao.debito(valor);
		}
		
		System.out.printf("CPF : %s \n",contajoao.cpf);
		System.out.printf("Numero conta : %d \n",contajoao.numero);
		System.out.printf("Saldo : %.2f \n",contajoao.saldo);
	}

}

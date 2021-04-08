package lista4OOP;

import java.util.Scanner;

public class ApplicationCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
				
		System.out.print("Digite o nome do cliente 1: ");
		cliente1.setNome(leia.next());
		System.out.print("Digite o ano de nascimento do cliente 1: ");
		cliente1.setAnoNascimento(leia.nextInt()); 
		System.out.print("Qual seu cpf? ");
		cliente1.setCpf(leia.next()); 
				
		System.out.print("Digite o nome do cliente 2: ");
		cliente2.setNome(leia.next());
		System.out.print("Digite o ano de nascimento do cliente 2: ");
		cliente2.setAnoNascimento(leia.nextInt());
		System.out.print("Qual seu cpf? ");
		cliente2.setCpf(leia.next());
		
		System.out.printf("Cliente 1 se chama %s tem %d anos e CPF: %s",cliente1.getNome(),cliente1.calculaIdade(2021), cliente1.getCpf());
		System.out.printf("\nCliente 2 se chama %s tem %d anos e CPF: %s",cliente2.getNome(),cliente2.calculaIdade(2021), cliente2.getCpf());

	}

}

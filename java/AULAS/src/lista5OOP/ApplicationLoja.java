package lista5OOP;

import java.util.Scanner;



public class ApplicationLoja {
	
	public static void main(String args[]) 
	{
		 Scanner leia = new Scanner(System.in);
		 Produto prod = new Produto();
		 char opcao;
		do {
			do {
				System.out.println("Menu");
				System.out.println("1 - Cadastro Produtos\n2 - Remove Produtos\n3 - Atualiza Produtos\n4 - Mostrar Produto\n5 - Sair");
				System.out.print("Digite uma opção: ");
				opcao = leia.next().charAt(0);
				if(opcao != '1' && opcao != '2' && opcao != '3' && opcao != '4' && opcao != '5')
				{
					System.out.println("Opção invalida!!! Tente novamente");
				}
			}while(opcao != '1' && opcao != '2' && opcao != '3' && opcao != '4' && opcao != '5');
			
			if(opcao == '1')
			{
				prod.cadastrar();
			}
			else if(opcao == '2')
			{
				prod.remove();
			}
			else if(opcao == '3')
			{
				prod.atualizar();
			}
			else if(opcao == '4')
			{
				prod.mostrar();
			}
			
		}while(opcao != '5');	
		
	}
	
	
}

package Exemplo;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String nome1;
		String nome2;
		int ano1;
		int ano2;
		char opcao;
		String genero1;
		String genero2;
		
		System.out.println("Digite seu nome: ");
		nome1 = leia.nextLine();
		System.out.println("Digite o ano de Nascimento: ");
		ano1 = leia.nextInt();
		System.out.print("Genero:\n1 - Feminino\n2 - Masculino\n3 - Outros\nDigite uma das opções: ");
		opcao = leia.next().charAt(0);
		
		if(opcao == '1')
		{
			genero1 ="Feminino";
		}
		else if(opcao == '2')
		{
			genero1 ="Masculino";
		}
		else
		{
			genero1 ="Outros";
		}
		
		leia.nextLine();
		
		System.out.println("Digite seu nome: ");
		nome2 = leia.nextLine();
		System.out.println("Digite o ano de Nascimento: ");
		ano2 = leia.nextInt();
		System.out.print("Genero:\n1 - Feminino\n2 - Masculino\n3 - Outros\nDigite uma das opções: ");
		opcao = leia.next().charAt(0);
		
		if(opcao == '1')
		{
			genero2 ="Feminino";
		}
		else if(opcao == '2')
		{
			genero2 ="Masculino";
		}
		else
		{
			genero2 ="Outros";
		}
		
		
		System.out.println("Nome: "+nome1+"\nGenero: "+genero1+"\nAno Nasc.: "+ano1);
		System.out.println("Nome: "+nome2+"\nGenero: "+genero2+"\nAno Nasc.: "+ano2);
		if(ano1>ano2)
		{
			System.out.println(nome1+" é mais Novo que "+nome2);
		}
		else if(ano1<ano2)
		{
			System.out.println(nome2+" é mais Novo que "+nome1);
		}
		else
		{
			System.out.println(nome2+" e "+nome1+ " tem a mesma idade");
		}
	}

}

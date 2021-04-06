package lista3;

import java.util.Scanner;

public class Exer4 {
	/*
	 * 	Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		 o número de pessoas calmas; *
		 o número de mulheres nervosas; *
		 o número de homens agressivos;
		 o número de outros calmos; *
		 o número de pessoas nervosas com mais de 40 anos; *
		 o número de pessoas calmas com menos de 18 anos. *
	 */
	
	public static void main(String args[])
	{
		Scanner leia = new Scanner(System.in);
		final int PESSOA = 150;
		int idade;
		char sexo;
		char sentimento;
		int pessoasCalmas=0;
		int mulheresNervosas=0;
		int homensAgressivos=0;
		int outrosCalmos=0;
		int pessoasNervosas40=0;
		int pessoasCalmas18=0;
		int contador = 0;
		
		while(contador < PESSOA)
		{
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			do
			{
				System.out.print("Sexo:\n1 - Feminino\n2 - Masculino\n3 - Outros\nDigite uma das opções: ");
				sexo = leia.next().charAt(0);
				if(sexo != '1' && sexo != '2' && sexo != '3')
				{
					System.out.println("Opção invalida tente novamente!!!");
				}
			}while(sexo != '1' && sexo != '2' && sexo != '3');
			
			do
			{
				System.out.print("Estado Emocional:\n1 - Pessoa calma\n2 - Pessoa Nervosa\n3 - Pessoa Agressiva\nDigite uma das opções: ");
				sentimento = leia.next().charAt(0);
				if(sentimento != '1' && sentimento != '2' && sentimento != '3')
				{
					System.out.println("Opção invalida tente novamente!!!");
				}
			}while(sentimento != '1' && sentimento != '2' && sentimento != '3');
			
			if(sentimento == '1')
			{
				pessoasCalmas++;
				if(sexo == '3')
				{
					outrosCalmos++;
				}
				if(idade < 18)
				{
					pessoasCalmas18++;
				}
			}
			else if(sentimento == '2')
			{
				if(sexo == '1')
				{
					mulheresNervosas++;
				}
				if(idade > 40)
				{
					pessoasNervosas40++;
				}
			}
			else if(sentimento == '3')
			{
				if(sexo == '2')
				{
					homensAgressivos++;
				}
			}
			contador++;
		}
		
		System.out.println("número de pessoas calmas: "+pessoasCalmas);
		System.out.println("número de mulheres nervosas: "+mulheresNervosas);
		System.out.println("número de homens agressivos: "+homensAgressivos);
		System.out.println("número de outros calmos: "+outrosCalmos);
		System.out.println("número de pessoas nervosas com mais de 40 anos: "+pessoasNervosas40);
		System.out.println("número de pessoas calmas com menos de 18 anos: "+pessoasCalmas18);
	}

}

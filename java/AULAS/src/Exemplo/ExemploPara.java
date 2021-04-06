package Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class ExemploPara {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		final double HABITANTES = 3;   
		double maiorSalario=0.00; 
		double percentualPessoasSalarioAte100= 0.00;
		double contadorPessoasSalario100 = 0.00;
		double totalSalario = 0;
		double salario;
		double numeroFilhos;
		double totalFilhos = 0;
		double mediaSalario;
		double mediaFilhos;
        //x++ = x = x + 1
        //%s = String
        //%d= int
        //%f= double
        for (int x=1;x<=HABITANTES;x++) {
            //dentro do laço
            System.out.printf("Informe o salário do habitante %d R$ :",x);//comum
            salario = leia.nextDouble();
            System.out.print("Informe a qtde de filhos: ");
            numeroFilhos = leia.nextDouble();
            System.out.println();
            totalSalario = totalSalario + salario; // totalSalario += Salario
            totalFilhos += numeroFilhos; 
            if(maiorSalario < salario)
            {
            	maiorSalario = salario;
            }
            
            if(salario <= 100)
            {
            	contadorPessoasSalario100++;
            }

        }
        //fora do laço
        mediaSalario = totalSalario /  HABITANTES ;
        mediaFilhos = totalFilhos / HABITANTES;
        percentualPessoasSalarioAte100 = contadorPessoasSalario100 *100/HABITANTES;
        
        
        
        //entradas
        //processamentos
        //saidas
        System.out.printf("\nTotal dos salarios R$ %.2f",totalSalario);
        System.out.printf("\nMédia salarios: R$ %.2f", mediaSalario);
        System.out.printf("\nMaior salario: %.2f",maiorSalario);
        System.out.printf("\nMédia de filhos: %.2f",mediaFilhos);
        System.out.printf("\nPorcentagem de pessoas com salario até R$100: %.2f%%",percentualPessoasSalarioAte100);
        //fim
	}

}

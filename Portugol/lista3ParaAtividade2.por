programa
{
	
	funcao inicio()
	{
		inteiro numero
		inteiro soma=0
		para(numero = 1; numero <= 500; numero++)
		{
			se(numero % 3 == 0 e numero % 2 == 1)
			{
				soma = soma + numero
			}	
		}
		escreva("Soma dos numeros impares: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 104; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
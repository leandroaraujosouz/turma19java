programa
{
	
	funcao inicio()
	{
		inteiro numero, conta
		escreva("digite um numero inteiro:")
		leia(numero)
		conta = numero % 2
		se(numero != 0)
		{
			se(conta == 1 ou conta == -1)
			{
				escreva("o Numero é impar\n")
			}
			senao
			{
				escreva("o Numero é par\n")
			}

			se(numero < 0)
			{
				escreva("o Numero é Negativo\n")	
			}
			senao
			{
				escreva("o Numero é Positivo\n")
			}
			
		}
		senao se (numero == 0)
			{
				escreva("Numero 0 é neutro\n")
			}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 185; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
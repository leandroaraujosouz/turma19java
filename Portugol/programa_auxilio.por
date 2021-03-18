programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro chefadefamilia
		escreva("Digite seu nome:")
		leia(nome)
		escreva("Você é chefa de familia? \n Digite 1- sim \n 2 -não:")
		leia(chefadefamilia)
		limpa()
		se(chefadefamilia == 1)
		{
			escreva("Olá ",nome," você tem direito a receber R$1.200 reias de auxílio")
		}
		senao se(chefadefamilia == 2)
		{
			escreva("Olá ",nome," você tem direito a receber R$600 reias de auxílio")
		}
		senao
		{
			escreva("Opção Invalida!!!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 183; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
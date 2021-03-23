programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		real pontuacao[5]
		real maiorValor = 0.0
		para(inteiro x=0;x<Util.numero_elementos(pontuacao);x++)
		{
			escreva("Digite o Valor da Atividade ",x+1,": ")
			leia(pontuacao[x])
			se(maiorValor<pontuacao[x])
			{
				maiorValor = pontuacao[x]
			}
		}
		limpa()
		escreva("Maior valor das Atividades: ",maiorValor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 213; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
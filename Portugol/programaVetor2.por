programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro lanceDados[10]
		inteiro lancamento = 0
		real media = 0.0
		inteiro maiorValor = 0
		inteiro contador = 0
		para(inteiro x=0; x< Util.numero_elementos(lanceDados);x++)
		{
			faca
			{
				limpa()
				escreva("Digite o valor do ",x+1," lançamento do dado: ")
				leia(lancamento)
				se(lancamento < 1 ou lancamento > 6)
				{
					escreva("Numero Invalido!!!\n Tente novamente")
					Util.aguarde(3000)
				}
			}enquanto(lancamento < 1 ou lancamento > 6)
			lanceDados[x] = lancamento
		}
		escreva("Lançamento:\n")
		para(inteiro x=0; x< Util.numero_elementos(lanceDados);x++)
		{
			escreva(lanceDados[x]," | ")
			media = media+lanceDados[x]
			se(maiorValor<lanceDados[x])
			{
				maiorValor = lanceDados[x]
				contador=1
			}
			senao se(maiorValor==lanceDados[x])
			{
				contador++
			}
		}
		media = media / Util.numero_elementos(lanceDados)
		escreva("\n\nValor da Média de lançamentos: ",media,"\n")
		escreva("Maior Lançamento: ",maiorValor,"\n Vezes que o maior lance saiu: ",contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1056; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
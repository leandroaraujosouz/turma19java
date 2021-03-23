programa
{
	
	funcao inicio()
	{
		inteiro Matriz[3][3]
		inteiro soma = 0
		para(inteiro x=0; x<3;x++)
		{
			para(inteiro y=0; y<3; y++)
			{
				escreva("Primeira Matriz\n")
				escreva("Digite o valor da Linha ",x+1," Coluna ",y+1,": ")
				leia(Matriz[x][y])
				limpa()
			}
		}

		para(inteiro x=0; x<3;x++)
		{
			para(inteiro y=0; y<3; y++)
			{
				escreva(Matriz[x][y]," | ")
			}
			escreva("\n")
		}

		para(inteiro x=0; x<3;x++)
		{
			para(inteiro y=0; y<3; y++)
			{
				se(x==y)
				{
					soma = soma + Matriz[x][y]
				}
			}
		}

		escreva("Soma dos Valores da Diagonal Principal: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 349; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
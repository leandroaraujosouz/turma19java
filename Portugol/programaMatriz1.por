programa
{
	
	funcao inicio()
	{
		inteiro N1[4][6]
		inteiro N2[4][6]
		inteiro M1[4][6]
		inteiro M2[4][6]
		
		para(inteiro x=0; x<4;x++)
		{
			para(inteiro y=0; y<6; y++)
			{
				escreva("Primeira Matriz\n")
				escreva("Digite o valor da Linha ",x+1," Coluna ",y+1,": ")
				leia(N1[x][y])
				limpa()
			}
		}
		para(inteiro x=0; x<4;x++)
		{
			para(inteiro y=0; y<6; y++)
			{
				escreva("Segunda Matriz\n")
				escreva("Digite o valor da Linha ",x+1," Coluna ",y+1,": ")
				leia(N2[x][y])
				limpa()
			}
		}

		para(inteiro x=0; x<4;x++)
		{
			para(inteiro y=0; y<6; y++)
			{
				M1[x][y] = N1[x][y] + N2[x][y]
			}
		}

		para(inteiro x=0; x<4;x++)
		{
			para(inteiro y=0; y<6; y++)
			{
				M2[x][y] = N1[x][y] - N2[x][y]
			}
		}

		escreva("Matriz 1:\n")
		para(inteiro x=0; x<4;x++)
		{
			para(inteiro y=0; y<6; y++)
			{
				escreva(N1[x][y]," | ")
			}
			escreva("\n")
		}

		escreva("\nMatriz 2:\n")
		para(inteiro x=0; x<4;x++)
		{
			para(inteiro y=0; y<6; y++)
			{
				escreva(N2[x][y]," | ")
			}
			escreva("\n")
		}
		
		escreva("\nSoma:\n")
		para(inteiro x=0; x<4;x++)
		{
			para(inteiro y=0; y<6; y++)
			{
				escreva(M1[x][y]," | ")
			}
			escreva("\n")
		}

		escreva("\nDiferença:\n")
		para(inteiro x=0; x<4;x++)
		{
			para(inteiro y=0; y<6; y++)
			{
				escreva(M2[x][y]," | ")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 919; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
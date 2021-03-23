programa
{
	
	funcao inicio()
	{
		real nota1
		real nota2
		real nota3
		real nota4
		real media

		escreva("Digite a nota 1: ")
		leia(nota1)

		escreva("Digite a nota 2: ")
		leia(nota2)

		escreva("Digite a nota 3: ")
		leia(nota3)

		escreva("Digite a nota 4: ")
		leia(nota4)

		media = (nota1 + nota2 + nota3 + nota4)/4

		escreva("A media é: ",media)

		se(media < 7 e media >= 5)
		{
			escreva("\nRecuperação")
			escreva("Digite a nota de Recuperação: ")
			leia(media)
			se(media >= 7)
			{
				escreva("Aprovado por Recupera")
			}
			senao
			{
				escreva("reprovado")
			}


		}
		senao se(media >= 7)
		{
			escreva("\nAprovado")
		}
		senao se(media < 7)
		{
			escreva("reprovado")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 503; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
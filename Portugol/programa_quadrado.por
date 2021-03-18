programa
{
	
	funcao inicio()
	{
		real num1, num2, num3, num4
		escreva("Digite o valor do numero1: ")
		leia(num1)
		
		escreva("Digite o valor do numero2: ")
		leia(num2)
		
		escreva("Digite o valor do numero3: ")
		leia(num3)
		
		escreva("Digite o valor do numero4: ")
		leia(num4)

		num1 = num1*num1
		num2 = num2*num2
		num3 = num3*num3
		num4 = num4*num4
		se(num3 >= 1000)
		{
			escreva("O valor do terceiro numero é ",num3) 
		}
		senao
		{
			escreva("O valor do primeiro numero é ",num1,"\n") 
			escreva("O valor do segundo numero é ",num2,"\n") 
			escreva("O valor do terceiro numero é ",num3,"\n") 
			escreva("O valor do quarto numero é ",num4) 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 625; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
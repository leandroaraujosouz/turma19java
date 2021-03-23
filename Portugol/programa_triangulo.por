programa
{
	
	funcao inicio()
	{
		real base
		real altura
		real area

		escreva("Digite o valor da base:")
		leia(base)
		escreva("Digite o valor da altura:")
		leia(altura)
		se(base > 0 e altura > 0)
		{
			area = (base*altura)/2
			escreva("a area do triangulo é: ",area)
		}
		senao
		{
			escreva("numeros invalidos!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 292; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
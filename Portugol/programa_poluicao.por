programa
{
	
	funcao inicio()
	{
		real indicePoluicao
		escreva("Digite o Índice de Poluição: ")
		leia(indicePoluicao)
		se(indicePoluicao <0.3)
		{
			escreva("Índice de poluição aceitável")
		}
		senao se(indicePoluicao >=0.3 e indicePoluicao <0.4)
		{
			escreva("Indústrias do 1° grupo devem suspender as atividades")
		}
		senao se(indicePoluicao >=0.4 e indicePoluicao <0.5)
		{
			escreva("Indústrias do 1° grupo e 2° grupo devem suspender as atividades")
		}
		senao se(indicePoluicao >=0.5)
		{
			escreva("Indústrias do 1° grupo, 2° grupo e 3° grupo devem suspender as atividades")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 147; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
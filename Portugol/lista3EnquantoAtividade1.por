programa
{
	
	funcao inicio()
	{
		real numero = 0.0
		inteiro contador=0
		real media
		real soma = 0.0
		enquanto(numero >=0){
			soma = soma+numero
			escreva("Digite um numero positivo: ")
			leia(numero)
			contador++
		}
		contador--
		media = soma/contador

		escreva("Soma total: ",soma,"\n")
		escreva("Média: ",media,"\n")
		escreva("Total de numero lidos: ",contador,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 382; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
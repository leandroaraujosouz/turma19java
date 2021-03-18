programa
{
	
	funcao inicio()
	{
		real horas=0.0
		inteiro codigo=0
		real excesso=0.0
		real salario=0.0
		escreva("Digite seu Codigo: ")
		leia(codigo)
		escreva("Digite o valor de horas trabalhadas: ")
		leia(horas) 
		se(horas > 50)
		{
			excesso = horas - 50
			salario = (horas - excesso)*10 + excesso*20			
		}
		senao
		{
			salario = horas*10			
		}

		limpa()
		escreva("Codigo: ",codigo)
		escreva("\nO salario total é R$ ",salario)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{	
		const inteiro habitantes = 20
		real salario[habitantes]
		inteiro filhos[habitantes]
		real percentualSalario
		inteiro contador = 0
		real contador2 = 0.0
		real mediaSalario = 0.0
		real maiorSalario = 0.0
		real mediaFilhos = 0.0
		para(contador = 0; contador <= habitantes; contador++)
		{
			escreva("Digite o ",contador+1," Salario R$")
			leia(salario[contador])
			
			escreva("Digite quantos filhos o ",contador+1," habitante tem:")
			leia(filhos[contador])
			limpa()
		}
		
		para(contador = 0; contador <= habitantes; contador++)
		{
			mediaSalario = mediaSalario + salario[contador]
		}

		mediaSalario = mediaSalario/habitantes

		para(contador = 0; contador <= habitantes; contador++)
		{
			mediaFilhos = mediaFilhos + filhos[contador]
		}
		
		mediaFilhos = mediaFilhos/habitantes

		maiorSalario = salario[0]
		para(contador = 0; contador <= habitantes; contador++)
		{
			se(maiorSalario <= salario[contador])
				{
					maiorSalario = salario[contador]
				}
		}

		para(contador = 0; contador <= habitantes; contador++)
		{
			se(salario[contador] <= 100)
			{
				contador2++	
			}
		}
		percentualSalario = (contador2 * 100)/habitantes

		limpa()
		escreva("Média Salario: ",mediaSalario,"\n")
		escreva("Média filhos: ",mediaFilhos,"\n")
		escreva("Maior Salario: ",maiorSalario,"\n")
		escreva("Percentual de habitantes com salario de até R$100.00 reias: ",percentualSalario,"%\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 865; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
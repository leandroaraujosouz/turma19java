programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		cadeia nome
		real salarioBruto
		real salarioLiquido
		inteiro opcaoTratamento
		cadeia tratamento
		cadeia isento =" "
		real imposto
		inteiro pause = 0

		escreva("Digite seu nome:")
		leia(nome)
		limpa()
		escreva("Olá ",nome," Qual a forma de posso me digirir a você?\n 1 - Senhor\n 2 - Senhora\n 3 - Senhore\n Digite uma das opções acima:")
		leia(opcaoTratamento)
		limpa()
		se(opcaoTratamento == 1)
		{
			tratamento = "Senhor"
			isento="isento"
		}
		senao 
		{
			se(opcaoTratamento == 2)
			{
				tratamento = "Senhora"
				isento="isenta"
			}
			senao 
			{
				se(opcaoTratamento == 3)
				{
					tratamento = "Senhore"
					isento="isente"
				}
				senao
				{
					limpa()
					escreva("Você escolheu uma opção invalida, por padrão identificaremos você por 'Senhore'\n ")
					tratamento = "Senhore"
					escreva("Aguarde 15 segundos que iremos dar continuidade...")
					Util.aguarde(15000)
					limpa()
				}
			}
		}
		escreva("Qual o valor Bruto do salario que você recebe:")
		leia(salarioBruto)
		se(salarioBruto > 0.0 e salarioBruto <= 1200.0)
		{
			escreva(tratamento, " ",nome, " você está ",isento," de imposto")
		}
		senao se(salarioBruto > 1200.0  e salarioBruto <= 2500.0)
		{
			imposto = salarioBruto*0.12
			salarioLiquido=salarioBruto - imposto
			escreva(tratamento, " ",nome, " você pagará R$",imposto," de imposto\n Salario Liquido: R$",salarioLiquido)
		}
		senao se(salarioBruto > 2500.0)
		{
			imposto = salarioBruto*0.25
			salarioLiquido=salarioBruto - imposto
			escreva(tratamento, " ",nome, " você pagará R$",imposto," de imposto\n Salario Liquido: R$",salarioLiquido)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 997; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
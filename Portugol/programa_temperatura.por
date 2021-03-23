programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		cadeia nome
		real celsius
		real fahrenheit
		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite a temperatura em Graus celsius: ")
		leia(celsius)
		fahrenheit = ((celsius * 1.8) + 32) 
		limpa()
		escreva("Olá ",nome,"\n")
		escreva("A temperatura em graus celsius é: ",celsius,"\n")
		escreva("A temperatura em fahrenheit é: ",Matematica.arredondar(fahrenheit, 2))
		
	}
 }
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 444; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
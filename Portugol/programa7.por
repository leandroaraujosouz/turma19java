programa
{

    funcao inicio()
    {

        real a, b, c, d, e1, f, x, y

        escreva("Insira o valor de A: ")
        leia(a)
        escreva("Insira o valor de B: ")
        leia(b)
        escreva("Insira o valor de C: ")
        leia(c)
        escreva("Insira o valor de D: ")
        leia(d)
        escreva("Insira o valor de E: ")
        leia(e1)
        escreva("Insira o valor de F: ")
        leia(f)

        x = ((c*e1) - (b*f)) / ((a*e1) - (b*d))
        y = ((a*f) - (c*d)) / ((a*e1) - (b*d))

        escreva("O valor de X é: ",x," 6e o valor de Y é: ",y)

       
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 588; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
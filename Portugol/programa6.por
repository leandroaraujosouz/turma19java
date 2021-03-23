programa
{
    inclua biblioteca Matematica

    funcao inicio()
    {
        real x1
        real y1
        real x2
        real y2

        escreva("Insira o x1: ")
        leia(x1)

        escreva("Insira o x2: ")
        leia(x2)

        escreva("Insira o y1: ")
        leia(y1)

        escreva("Insira o y2: ")
        leia(y2)

        real potenciaX = (x2 - x1) * (x2 - x1)
        real potenciaY = (y2 - y1) * (y2 - y1)
        real totalSoma = potenciaX + potenciaY

        real d = Matematica.raiz(potenciaX + potenciaY, 2.0)
        real dArrumado = Matematica.arredondar(d, 2)
        escreva("A distancia dos pontos é ",dArrumado)
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
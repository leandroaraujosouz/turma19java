programa
{

    funcao inicio()
    {
        //5 - Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.

    real p1, p2, p3, n1, n2, n3, media

    p1 = 2.0
    p2 = 3.0
    p3 = 5.0

    escreva("Qual sua nota 1? ")
    leia(n1)

    escreva("Qual sua nota 2? ")
    leia(n2)

    escreva("Qual sua nota 3? ")
    leia(n3)

    media = (((p1*n1)+(p2*n2)+(p3*n3))/(p1+p2+p3))
    escreva("Sua média ponderada é: ",media)


    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
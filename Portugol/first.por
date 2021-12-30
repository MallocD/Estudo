programa
{
	
	funcao inicio()
	{
		real nota1, nota2, media
		cadeia aluno

		escreva ("Qual seu nome?\n")
		leia (aluno)
		escreva ("Qual sua primeira nota?\n")
		leia (nota1)
		escreva ("Qual sua segunda nota?/n")
		leia(nota2)
		media = (((nota1+nota2)/2)*0.8)+2
		escreva ( aluno + " Sua nota no bimestre é de : " + media)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 338; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
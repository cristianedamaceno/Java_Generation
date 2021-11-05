programa
{
	
	funcao inicio()
	{
		real vetor[5], pontMaior=0.0
		inteiro pont , x

		para(pont=0 ; pont <4 ; pont ++){
			escreva("\n Digite sua pontuação", pont+1, ":" )
			leia(x)


			se (x > pontMaior){
				
				pontMaior = x
			}
		}

		escreva("\n O valor da maior pontuação foi:" , pontMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 312; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
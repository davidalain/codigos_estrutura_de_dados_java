package matriz;

public class JogadaSinuca {

	public static void main(String[] args) {
		
		int[] posicao = {3,3};
		int angulo = 225;
		int deslocamento = 512;
		int[] dimensaoMesa = {20, 10};
		
		int[] posicaoResultante = jogada(posicao, angulo, deslocamento, dimensaoMesa);
		System.out.println("Posição final: linha="+posicaoResultante[0]+", coluna="+posicaoResultante[1]);
		
	}
	
	
	/**
	 *    === MESA ===
	 * 
	 *   0 1 2 3 4 5 6 ...
	 * 0  
	 * 1
	 * 2
	 * 3 
	 * 4
	 * 5
	 * 6
	 * ...
	 * 
	 * 
	 * 
	 *  === Ângulos ===
	 * 
	 *        |
	 *  315º  |  45º 
	 * ______\|/_______
	 *       /|\
	 *  225º  |  135º
	 *        |
	 * 
	 * @param posicao	{linhaAtual, colunaAtual}
	 * 
	 * @param angulo	Valor em graus
	 * 	{@value} 45
	 *  {@value} 135
	 *  {@value} 225
	 *  {@value} 315  
	 *  
	 * @param deslocamento
	 * 
	 * @param dimensaoMesa	{qtdLinhas, qtdColunas}
	 * 
	 * @return	Posicao Final => {linhaFinal, colunaFinal}
	 * 
	 */
	public static int[] jogada(int[] posicao, int angulo, int deslocamento, int[] dimensaoMesa){

		int altura, largura, d;

		switch(angulo){
		case 45:
		{
			altura = posicao[0];
			largura = (dimensaoMesa[1] - 1) - posicao[1];
			d = Math.min(altura, largura);
			d = Math.min(deslocamento, d);

			posicao[0] -= d;
			posicao[1] += d;
			deslocamento -= d;

			if(deslocamento == 0){
				return posicao;
			}

			if(altura == largura){ //canto da mesa
				angulo = 225;
				
			}else if(altura < largura){ //bateu no 'teto'
				angulo = 135;
				
			}else{ //altura > largura,	bateu na lateral direita
				angulo = 315;
			}

			return jogada(posicao, angulo, deslocamento, dimensaoMesa);
		}

		case 135:
		{
			altura = (dimensaoMesa[0] - 1) - posicao[0];
			largura = (dimensaoMesa[1] - 1) - posicao[1];
			d = Math.min(altura, largura);
			d = Math.min(deslocamento, d);

			posicao[0] += d;
			posicao[1] += d;
			deslocamento -= d;

			if(deslocamento == 0){
				return posicao;
			}

			if(altura == largura){ //canto da mesa
				angulo = 315;
				
			}else if(altura < largura){ //bateu no 'chão'
				angulo = 45;
				
			}else{ //altura > largura,	bateu na lateral direita
				angulo = 225;
			}

			return jogada(posicao, angulo, deslocamento, dimensaoMesa);
		}

		case 225:
		{
			altura = (dimensaoMesa[0] - 1) - posicao[0];
			largura = posicao[1];
			d = Math.min(altura, largura);
			d = Math.min(deslocamento, d);

			posicao[0] += d;
			posicao[1] -= d;
			deslocamento -= d;

			if(deslocamento == 0){
				return posicao;
			}

			if(altura == largura){ //canto da mesa
				angulo = 45;
				
			}else if(altura < largura){ //bateu no 'chão'
				angulo = 315;
				
			}else{ //altura > largura,	bateu na lateral esquerda
				angulo = 135;
			}

			return jogada(posicao, angulo, deslocamento, dimensaoMesa);
		}

		case 315:
		{
			altura = posicao[0];
			largura = posicao[1];
			d = Math.min(altura, largura);
			d = Math.min(deslocamento, d);

			posicao[0] -= d;
			posicao[1] -= d;
			deslocamento -= d;

			if(deslocamento == 0){
				return posicao;
			}

			if(altura == largura){ //canto da mesa
				angulo = 135;
				
			}else if(altura < largura){ //bateu no 'teto'
				angulo = 225;
				
			}else{ //altura > largura,	bateu na lateral esquerda
				angulo = 45;
			}

			return jogada(posicao, angulo, deslocamento, dimensaoMesa);
		}

		}//fim do switch

		return null;
	}

}

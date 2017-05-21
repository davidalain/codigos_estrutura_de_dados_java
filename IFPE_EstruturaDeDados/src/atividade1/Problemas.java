package atividade1;


/**
 * Regras:
 * 	1. Os retornos e par�metros dos m�todos desta classe n�o podem ser alterados.
 * 	2. M�todos auxiliares podem ser criados para ajudar a solucionar os problemas, mas estes dever�o estar dentro desta classe.
 */
public class Problemas {

	/**
	 * Retorna o nome completo do aluno que implementou o conte�do dos m�todos dessa classe
	 * 
	 * @return
	 */
	public static String getNomeCompletoAluno(){
		"COLOQUE PRA RETORNAR SEU NOME COMPLETO AQUI";
	}

	/**
	 * Concatena dois arrays criando um �nico com o conte�do dos dois
	 * 
	 * @param array1
	 * @param array2
	 * 
	 * @return
	 */
	public static int[] concatenarArray(int[] array1, int[] array2){

	}

	/**
	 * Conta a quantidade de ocorrencias do valor 'valor' dentro do array
	 * 
	 * @param array
	 * @param valor
	 * @return
	 */
	public static int contaOcorrencia(int[] array, int valor){

	}


	/**
	 * Calcula a m�dia aritm�tica de todos os valores do array 
	 * 
	 * @param array
	 * @return
	 */
	public static double mediaAritmetica(double[] array){

	}

	/**
	 * Calcula o desvio padr�o (fun��o estat�stica) dos valores do array
	 * 
	 * @param array
	 * @return
	 */
	public static double desvioPadrao(double[] array){

	}

	/**
	 * Conta a quantidade de n�meros �mpares contidos no array
	 * 
	 * @param array
	 * @return
	 */
	public static int contaQuantidadeNumeroImpar(int[] array){

	}

	/**
	 * Calcula a soma de todos os n�meros pares do array (somente os n�meros pares)
	 * 
	 * @param array
	 * @return
	 */
	public static int somaNumerosPares(int[] array){

	}

	/**
	 * Calcula a soma de todos os n�meros negativos contidos no array (somente os negativos)
	 * 
	 * @param array
	 * @return
	 */
	public static int somaNumerosNegativos(int[] array){

	}

	/**
	 * Compara os arrays e retorna true se os dois forem iguais (todos os elementos iguais).
	 * 
	 * Obs.: N�o � permitido utilizar o m�todo de compara��o de arrays do Java. Voc� deve implementar o seu pr�prio.
	 * 
	 * @param array1
	 * @param array2
	 * @return
	 */
	public static boolean comparaArraysInteiros(int[] array1, int[] array2){

	}

	/**
	 * Compara os arrays e retorna true se os dois forem iguais (todos os elementos iguais).
	 * 
	 * @param array1
	 * @param array2
	 * @return
	 */
	public static boolean comparaArraysCasas(Casa[] array1, Casa[] array2){

	}

	/**
	 * Cria um array com os caracteres da placa de um ve�culo, dados os caracteres (letras e numeros) da placa.
	 * 
	 * Formato de sa�da: ['K', 'K', 'K', '-', '2', '0', '1', '5'].
	 * 
	 * Obs.: N�o � para retornar ['K', 'K', 'K', '-', '2', '0', '1', '5'], isto � apenas um exemplo de formato de sa�da.
	 * 
	 * Note que tem um h�fen entre as letras e os n�meros.
	 * 
	 * 
	 * @param l1	Primeira letra
	 * @param l2	Segunda letra
	 * @param l3	Terceira letra
	 * @param n1	Primeiro n�mero
	 * @param n2	Segundo n�mero
	 * @param n3	Terceiro n�mero
	 * @param n4	Quarto n�mero
	 * 
	 * @return Array contendo todos os caracteres
	 */
	public static char[] criaArrayPlacaVeiculo(char l1, char l2, char l3, char n1, char n2, char n3, char n4){

	}

	/**
	 * Cria uma String com os caracteres da placa de um ve�culo, dados os caracteres (letras e numeros) da placa
	 * 
	 * Formato de sa�da: "KKK-2015" (sem aspas)
	 * 
	 * Obs.: N�o � para retornar "KKK-2015", isto � apenas um exemplo de formato de sa�da.
	 * 
	 * Note que tem um h�fen entre as letras e os n�meros.
	 * 
	 * @param l1	Primeira letra
	 * @param l2	Segunda letra
	 * @param l3	Terceira letra
	 * @param n1	Primeiro n�mero
	 * @param n2	Segundo n�mero
	 * @param n3	Terceiro n�mero
	 * @param n4	Quarto n�mero
	 * 
	 * @return String contendo todos os carecteres
	 */
	public static String criaStringPlacaVeiculo(char l1, char l2, char l3, char n1, char n2, char n3, char n4){

	}

	/**
	 * Inverte o array (os primeiros elementos se tornar�o os �ltimos e os �ltimos se tornar�o os primeiros).
	 * 
	 * Obs. � necess�rio criar um novo array, o array original n�o deve ser modificado.
	 * 
	 * @param array
	 * @return
	 */
	public static int[] inverterArray(int[] array){

	}

	/**
	 * Inverte o sinal de todos os n�meros do array (n�mero positivo vira negativo e n�mero negativo vira positivo)
	 * 
	 * Obs. � necess�rio criar um novo array, o array original n�o deve ser modificado.
	 * 
	 * @param array
	 * @return
	 */
	public static int[] inverterSinal(int[] array){

	}

	/**
	 * Inverte o sinal de todos os n�meros do array (n�mero positivo vira negativo e n�mero negativo vira positivo) e 
	 * tamb�m inverte o array (os primeiros elementos se tornar�o os �ltimos e os �ltimos se tornar�o os primeiros)
	 * 
	 * Obs. � necess�rio criar um novo array, o array original n�o deve ser modificado.
	 * 
	 * @param array
	 * @return
	 */
	public static int[] inverterArraySinal(int[] array){

	}
	
	/**
	 * Retorna um array que cont�m apenas os n�meros primos que est�o no array de entrada.
	 * 
	 * Obs. � necess�rio criar um novo array, o array original n�o deve ser modificado.
	 * 
	 * @param array Array com os n�meros
	 * 
	 * @return Array contendo apenas os n�meros primos
	 */
	public static int[] somentePrimos(int[] array){
		
	}
	
	/**
	 * Dois �ngulos s�o ditos complementares quando a soma dos dois �ngulos � igual a 90 graus.
	 * 
	 * Dado um array de �ngulos, este m�todo retornar� um array com os �ngulos complementares.
	 * 
	 * Obs. � necess�rio criar um novo array, o array original n�o deve ser modificado.
	 * 
	 * Exemplo:
	 * 		Entrada:	[20, 0,  60, 90]
	 * 		Sa�da:  	[70, 90, 30, 0]
	 * 
	 * @param array Array com os �ngulos.
	 * 
	 * @return Array contendo �ngulos complementares do array de entrada.
	 */
	public static int[] angulosComplementares(int[] array){
		
	}
	
	/**
	 * Recebe um array de caracteres com qualquer caractere e retorna um array de caracteres que contem apenas letras (mai�sculas e min�sculas) e n�meros.
	 * 
	 * Exemplo:
	 * 		Entrada:	['a', 'b', 'c', ' ', '.', '1', '9', '&', '#', '\', 'K', 'T']
	 * 		Sa�da:		['a', 'b', 'c', '1', '9', 'K', 'T']
	 * 
	 * @param array
	 * @return
	 */
	public static char[] removeCaracteresEspeciais(char[] array){
		
	}

	/**
	 * Calcula a m�dia aritm�tica entre o maior valor e o menor valor dentre os valores contidos no array.
	 * 
	 * @param array
	 * @return
	 */
	public static int mediaMaiorMenor(int[] array){

	}

	/**
	 * !!!!!!! QUEST�O BONUS !!!!!!!
	 * 
	 * Calcula a fatura de consumo de energia em KWh seguindo a seguinte tabela:
	 * 
	 * Faixa de consumo (KWh)	Pre�o (por KWh)
	 * at� 10					inclu�do na franquia
	 * 11 a 30					R$ 1,50 (por cada KWh nesta faixa)
	 * 31 a 100					R$ 2,30 (por cada KWh nesta faixa)
	 * 101 em diante			R$ 5,20 (por cada KWh nesta faixa)
	 * 
	 * Valor da franquia � R$19,50
	 * 
	 * @param consumo		Valor do consumo de energia em KWh
	 * @return				Valor da fatura de acordo com o consumo
	 */
	public static double calculaFatura(int consumo){

	}

}

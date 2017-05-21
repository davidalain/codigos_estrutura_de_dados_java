package atividade1;


/**
 * Regras:
 * 	1. Os retornos e parâmetros dos métodos desta classe não podem ser alterados.
 * 	2. Métodos auxiliares podem ser criados para ajudar a solucionar os problemas, mas estes deverão estar dentro desta classe.
 */
public class Problemas {

	/**
	 * Retorna o nome completo do aluno que implementou o conteúdo dos métodos dessa classe
	 * 
	 * @return
	 */
	public static String getNomeCompletoAluno(){
		"COLOQUE PRA RETORNAR SEU NOME COMPLETO AQUI";
	}

	/**
	 * Concatena dois arrays criando um único com o conteúdo dos dois
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
	 * Calcula a média aritmética de todos os valores do array 
	 * 
	 * @param array
	 * @return
	 */
	public static double mediaAritmetica(double[] array){

	}

	/**
	 * Calcula o desvio padrão (função estatística) dos valores do array
	 * 
	 * @param array
	 * @return
	 */
	public static double desvioPadrao(double[] array){

	}

	/**
	 * Conta a quantidade de números ímpares contidos no array
	 * 
	 * @param array
	 * @return
	 */
	public static int contaQuantidadeNumeroImpar(int[] array){

	}

	/**
	 * Calcula a soma de todos os números pares do array (somente os números pares)
	 * 
	 * @param array
	 * @return
	 */
	public static int somaNumerosPares(int[] array){

	}

	/**
	 * Calcula a soma de todos os números negativos contidos no array (somente os negativos)
	 * 
	 * @param array
	 * @return
	 */
	public static int somaNumerosNegativos(int[] array){

	}

	/**
	 * Compara os arrays e retorna true se os dois forem iguais (todos os elementos iguais).
	 * 
	 * Obs.: Não é permitido utilizar o método de comparação de arrays do Java. Você deve implementar o seu próprio.
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
	 * Cria um array com os caracteres da placa de um veículo, dados os caracteres (letras e numeros) da placa.
	 * 
	 * Formato de saída: ['K', 'K', 'K', '-', '2', '0', '1', '5'].
	 * 
	 * Obs.: Não é para retornar ['K', 'K', 'K', '-', '2', '0', '1', '5'], isto é apenas um exemplo de formato de saída.
	 * 
	 * Note que tem um hífen entre as letras e os números.
	 * 
	 * 
	 * @param l1	Primeira letra
	 * @param l2	Segunda letra
	 * @param l3	Terceira letra
	 * @param n1	Primeiro número
	 * @param n2	Segundo número
	 * @param n3	Terceiro número
	 * @param n4	Quarto número
	 * 
	 * @return Array contendo todos os caracteres
	 */
	public static char[] criaArrayPlacaVeiculo(char l1, char l2, char l3, char n1, char n2, char n3, char n4){

	}

	/**
	 * Cria uma String com os caracteres da placa de um veículo, dados os caracteres (letras e numeros) da placa
	 * 
	 * Formato de saída: "KKK-2015" (sem aspas)
	 * 
	 * Obs.: Não é para retornar "KKK-2015", isto é apenas um exemplo de formato de saída.
	 * 
	 * Note que tem um hífen entre as letras e os números.
	 * 
	 * @param l1	Primeira letra
	 * @param l2	Segunda letra
	 * @param l3	Terceira letra
	 * @param n1	Primeiro número
	 * @param n2	Segundo número
	 * @param n3	Terceiro número
	 * @param n4	Quarto número
	 * 
	 * @return String contendo todos os carecteres
	 */
	public static String criaStringPlacaVeiculo(char l1, char l2, char l3, char n1, char n2, char n3, char n4){

	}

	/**
	 * Inverte o array (os primeiros elementos se tornarão os últimos e os últimos se tornarão os primeiros).
	 * 
	 * Obs. É necessário criar um novo array, o array original não deve ser modificado.
	 * 
	 * @param array
	 * @return
	 */
	public static int[] inverterArray(int[] array){

	}

	/**
	 * Inverte o sinal de todos os números do array (número positivo vira negativo e número negativo vira positivo)
	 * 
	 * Obs. É necessário criar um novo array, o array original não deve ser modificado.
	 * 
	 * @param array
	 * @return
	 */
	public static int[] inverterSinal(int[] array){

	}

	/**
	 * Inverte o sinal de todos os números do array (número positivo vira negativo e número negativo vira positivo) e 
	 * também inverte o array (os primeiros elementos se tornarão os últimos e os últimos se tornarão os primeiros)
	 * 
	 * Obs. É necessário criar um novo array, o array original não deve ser modificado.
	 * 
	 * @param array
	 * @return
	 */
	public static int[] inverterArraySinal(int[] array){

	}
	
	/**
	 * Retorna um array que contém apenas os números primos que estão no array de entrada.
	 * 
	 * Obs. É necessário criar um novo array, o array original não deve ser modificado.
	 * 
	 * @param array Array com os números
	 * 
	 * @return Array contendo apenas os números primos
	 */
	public static int[] somentePrimos(int[] array){
		
	}
	
	/**
	 * Dois ângulos são ditos complementares quando a soma dos dois ângulos é igual a 90 graus.
	 * 
	 * Dado um array de ângulos, este método retornará um array com os ângulos complementares.
	 * 
	 * Obs. É necessário criar um novo array, o array original não deve ser modificado.
	 * 
	 * Exemplo:
	 * 		Entrada:	[20, 0,  60, 90]
	 * 		Saída:  	[70, 90, 30, 0]
	 * 
	 * @param array Array com os ângulos.
	 * 
	 * @return Array contendo ângulos complementares do array de entrada.
	 */
	public static int[] angulosComplementares(int[] array){
		
	}
	
	/**
	 * Recebe um array de caracteres com qualquer caractere e retorna um array de caracteres que contem apenas letras (maiúsculas e minúsculas) e números.
	 * 
	 * Exemplo:
	 * 		Entrada:	['a', 'b', 'c', ' ', '.', '1', '9', '&', '#', '\', 'K', 'T']
	 * 		Saída:		['a', 'b', 'c', '1', '9', 'K', 'T']
	 * 
	 * @param array
	 * @return
	 */
	public static char[] removeCaracteresEspeciais(char[] array){
		
	}

	/**
	 * Calcula a média aritmética entre o maior valor e o menor valor dentre os valores contidos no array.
	 * 
	 * @param array
	 * @return
	 */
	public static int mediaMaiorMenor(int[] array){

	}

	/**
	 * !!!!!!! QUESTÃO BONUS !!!!!!!
	 * 
	 * Calcula a fatura de consumo de energia em KWh seguindo a seguinte tabela:
	 * 
	 * Faixa de consumo (KWh)	Preço (por KWh)
	 * até 10					incluído na franquia
	 * 11 a 30					R$ 1,50 (por cada KWh nesta faixa)
	 * 31 a 100					R$ 2,30 (por cada KWh nesta faixa)
	 * 101 em diante			R$ 5,20 (por cada KWh nesta faixa)
	 * 
	 * Valor da franquia é R$19,50
	 * 
	 * @param consumo		Valor do consumo de energia em KWh
	 * @return				Valor da fatura de acordo com o consumo
	 */
	public static double calculaFatura(int consumo){

	}

}

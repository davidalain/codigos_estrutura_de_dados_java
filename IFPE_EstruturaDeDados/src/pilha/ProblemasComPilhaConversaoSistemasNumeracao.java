package pilha;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class ProblemasComPilhaConversaoSistemasNumeracao {

	public static void main(String[] args) {

		/**
		 * 1) Implemente um algoritmo que insira 10 n�meros inteiros em uma fila e imprima-a.
		 * Depois retire 5 elementos, imprimindo-os e imprima a fila novamente.
		 * 
		 * 2) Implemente um algoritmo que insira 10 n�meros inteiros em uma pilha e imprima-a.
		 * Depois retire 5 elementos, imprimindo-os e imprima a pilha novamente.
		 * 
		 * 3) Implemente um m�todo que receba um n�mero inteiro e retorne uma String com a representa��o do n�mero em bin�rio.
		 * 
		 * 4) Implemente um m�todo que receba uma lista com 100 caracteres escolhidos aleatoriamente, filtre e retorne um array de filas em que
		 * na primeira posi��o do array ter�o apenas as letras min�sculas,
		 * na segunda posi��o do array apenas as letras mai�sculas, e 
		 * na terceira posi��o os caracteres que n�o s�o letras.
		 * 
		 * 5) Implemente um m�todo que receba uma String representando um valor em bin�rio (contendo apenas os caracteres 0 e 1) e 
		 * retorne um n�mero inteiro que represente o n�mero recebido no sistema de numera��o decimal.
		 * 
		 * 6) Implemente um m�todo que receba um valor inteiro no sistema de numera��o decimal,
		 * um inteiro representando a base {2 p/ bin�rio, 8 p/ octal e 16 p/ hexadecimal},
		 * e retorne uma String que representa o valor recebido no sistema de numera��o da base recebida.
		 * 
		 * 7) Implemente um m�todo que receba um valor inteiro no sistema de numera��o decimal,
		 * um inteiro representando a base {2 p/ bin�rio e 8 p/ octal}
		 * e retorne um N�MERO INTEIRO representando o valor no sistema de numera��o da base recebida.
		 * 
		 * 8) Implemente um m�todo que receba um valor em String representando um n�mero N em um sistema de numera��o,
		 * um inteiro representando a base {2 p/ bin�rio, 8 p/ octal, 10 p/ decimal e 16 p/ hexadecimal} do sistema de numera��o em que est� o n�mero N,
		 * um inteiro representando a base {2 p/ bin�rio, 8 p/ octal, 10 p/ decimal e 16 p/ hexadecimal} do sistema de numera��o o qual o n�mero N ser� convertido,
		 * e retorne uma String que � o n�mero N transfornado para a base destino.
		 */

		//		//==== Quest�o 1 ====
		//		questao1();
		//		
		//		//==== Quest�o 2 ====
		//		questao2();
		//
		//		//==== Quest�o 3 ====
				questao3();

		//		//==== Quest�o 4 ====
		//		questao4();

		//		//==== Quest�o 5 ====
		//				questao5();

		//		//==== Quest�o 6 ====
		//		questao6();

		//==== Quest�o 7 ====
		//questao7();

		//==== Quest�o 8 ====
//		questao8_1();
		//questao8();

	}

	public static void questao1(){
		Queue<Integer> fila = new LinkedList<>();
		for(int i = 0 ; i < 10 ; i++){
			fila.offer(i);	
		}
		System.out.println(fila);
		for(int i = 0 ; i < 5 ; i++){
			System.out.println(fila.poll());
		}
		System.out.println(fila);		
	}

	public static void questao2(){
		Deque<Integer> pilha = new LinkedList<>();
		for(int i = 0 ; i < 10 ; i++){
			pilha.push(i);	
		}
		System.out.println(pilha);
		for(int i = 0 ; i < 5 ; i++){
			System.out.println(pilha.pop());
		}
		System.out.println(pilha);
	}

	public static void questao3(){
		for(int i = 0 ; i < 32 ; i++){
			System.out.println("dec="+i + ",\tbin="+decimalParaBinario(i));	
		}
	}

	public static String decimalParaBinario(int n){

		String str = "";
		Stack<Integer> pilha = new Stack<Integer>();

		while(n > 0){
			pilha.push(n % 2);
			n /= 2;
		}

		while(!pilha.empty()){
			str += pilha.pop();
		}

		return str.length() == 0 ? "0" : str;
		
		
		//========= Modo de resolver sem esfor�o algum ;) =======
		/**
		return Integer.toString(n, 2);
		**/
	}

	public static void questao4(){

		Random r = new Random();
		List<Character> lista = new LinkedList<>();
		for(int i = 0 ; i < 100 ; i++){
			lista.add((char)r.nextInt(128));
		}
		System.out.println(lista);

		int quantidadeTotal = 0;
		Queue<Character>[] filaArray = filtroQuestao4(lista);
		for(int i = 0 ; i < filaArray.length ; i++){
			quantidadeTotal += filaArray[i].size();
			System.out.println("quantidade: " + filaArray[i].size() + ", elementos: " + filaArray[i]);	
		}
		System.out.println("Quantidade total: " + quantidadeTotal);

	}

	public static Queue<Character>[] filtroQuestao4(List<Character> lista){

		Queue<Character>[] saida = new Queue[3];

		for(int i = 0 ; i < saida.length ; i++){
			saida[i] = new LinkedList<>();
		}

		for(Character c : lista){
			if(c >= 'a' && c <= 'z')
				saida[0].offer(c);
			else if(c >= 'A' && c <= 'Z')
				saida[1].offer(c);
			else
				saida[2].offer(c);
		}

		return saida;
	}

	public static void questao5(){

		String[] binarios = {"0", "1", "10", "11", "100", "101", "110", "111"};
		for(String bin : binarios){
			System.out.println("binario:" + bin + "\tdecimal: " + binarioParaDecimal(bin));
		}

	}

	public static int binarioParaDecimal(String str){

		int n = 0;
//		Stack<Character> pilha = new Stack<Character>();
		Deque<Character> pilha = new LinkedList<>();
		char[] binario = str.toCharArray();

		for(char c : binario){
			pilha.push(c);
		}

		int i = 0;
		while(!pilha.isEmpty()){
			int bit = pilha.pop() - '0';
			int potencia = (int) Math.pow(2, i++);
			n += bit * potencia;
		}

		return n;

		/*
		// == Modo de resolver sem usar pilha == 		
		int n = 0;
		char[] binario = str.toCharArray();

		for(int i = 0 ; i < binario.length ; i++){
			n |= (((binario[i] == '1') ? 1 : 0) << (binario.length - 1 - i));
		}

		return n;
		 */
		
		//========= Modo de resolver sem esfor�o algum ;) =======
		/**
		return Integer.parseInt(str, 2);
		 **/

	}

	public static void questao6(){
		for(int i = 0 ; i < 32 ; i++){
			System.out.println("dec="+i + ",\tbinario="+decimalParaBaseString(i,2));	
		}

		for(int i = 0 ; i < 32 ; i++){
			System.out.println("dec="+i + ",\toctal="+decimalParaBaseString(i,8));	
		}

		for(int i = 0 ; i < 32 ; i++){
			System.out.println("dec="+i + ",\thexa="+decimalParaBaseString(i,16));	
		}
	}

	public static String decimalParaBaseString(int n, int base){

		String str = "";
		Stack<Integer> pilha = new Stack<Integer>();

		while(n > 0){
			pilha.push(n % base);
			n /= base;
		}

		while(!pilha.empty()){
			int digito = pilha.pop();
			if(digito < 10)
				str += digito;
			else
				str += (char)(digito - 10 + 'A');
		}
		
		/*//===== IMPORTANTE =======
		while(!pilha.empty()){
			int digito = pilha.pop();
			str += (digito < 10 ? ((int)digito) : ((char)(digito - 10 + 'A') ));
			// N�O PODE SER UTILIZADO DESTA MANEIRA PORQUE O TERN�RIO (a ? b : c) FAZ O CAST AUTOM�TICO PARA O MAIOR DOS TIPOS DOS OPERANDOS (int) e (char), o resultado ser� um (int).
			// Assim quando o d�gito for 0, por exemplo, ser� concatenado o inteiro 65 ao inv�s do caractere 'A'.
		}
		 */

		return str.length() == 0 ? "0" : str;
		
		
		//========= Modo de resolver sem esfor�o algum ;) =======
		/**
		return Integer.toString(n, base);
		**/
		
	}

	public static void questao7(){
		for(int i = 0 ; i < 64 ; i++){
			System.out.println("dec="+i + ",\tbinario="+decimalParaBaseInt(i,2));	
		}

		for(int i = 0 ; i < 64 ; i++){
			System.out.println("dec="+i + ",\toctal="+decimalParaBaseInt(i,8));	
		}
	}

	public static int decimalParaBaseInt(int n, int base){

		int valor = 0;
		Stack<Integer> pilha = new Stack<Integer>();

		while(n > 0){
			pilha.push(n % base);
			n /= base;
		}

		while(!pilha.empty()){
			valor = (valor * 10) + pilha.pop();
		}

		return valor;
	}

	public static int baseStringParaDecimal(String str, int base){

		int n = 0;
		Stack<Character> pilha = new Stack<Character>();
		char[] binario = str.toCharArray();

		for(char c : binario){
			pilha.push(c);
		}

		int i = 0;
		while(!pilha.isEmpty()){
			int c = pilha.pop();
			int digito = (int)(c >= 'A' ? (c - 'A' + 10) : c - '0');
			int potencia = (int) Math.pow(base, i++);
			n += digito * potencia;
		}

		return n;

		//========= Modo de resolver sem usar pilha ============
		/** 		
		int n = 0;
		char[] binario = str.toCharArray();

		for(int i = 0 ; i < binario.length ; i++){
			n |= (((binario[i] == '1') ? 1 : 0) << (binario.length - 1 - i));
		}

		return n;
		 **/

		//========= Modo de resolver sem esfor�o algum ;) =======
		/**
		return Integer.parseInt(str, base);
		 **/

	}

	public static void questao8_1(){
		//======== bin�rios ==========
		String[] binarios = {"0", "1", "10", "11", "100", "101", "110", "111", "1000", "1111", "11111", "10000"};
		for(String bin : binarios){
			System.out.println("binario:" + bin + "\tdecimal: " + baseStringParaBaseString(bin, 2, 10));
		}

		//======== octais ==========
		String[] octais = {"0", "1", "2", "11", "17", "22", "777", "700"};
		for(String octal : octais){
			System.out.println("octal:" + octal + "\tdecimal: " + baseStringParaBaseString(octal, 8, 10));
		}

		//======== decimais ==========
		String[] decimais = {"0", "1", "2", "11", "17", "22", "777", "700"};
		for(String decimal : decimais){
			System.out.println("decimal:" + decimal + "\tdecimal: " + baseStringParaBaseString(decimal, 10, 10));
		}

		//======== hexadecimais ==========
		String[] hexadecimais = {"0", "1", "A", "1FF", "20", "22", "777", "700"};
		for(String hexa : hexadecimais){
			System.out.println("hexa:" + hexa + "\tdecimal: " + baseStringParaBaseString(hexa, 16, 10));
		}

	}

	public static void questao8(){

		//======== bin�rios ==========
		String[] binarios = {"0", "1", "10", "11", "100", "101", "110", "111", "1000", "1111", "11111", "10000"};
		for(String bin : binarios){
			System.out.println("binario:" + bin + "\tbinario: " + baseStringParaBaseString(bin, 2, 2));
		}
		for(String bin : binarios){
			System.out.println("binario:" + bin + "\toctal: " + baseStringParaBaseString(bin, 2, 8));
		}
		for(String bin : binarios){
			System.out.println("binario:" + bin + "\tdecimal: " + baseStringParaBaseString(bin, 2, 10));
		}
		for(String bin : binarios){
			System.out.println("binario:" + bin + "\thexa: " + baseStringParaBaseString(bin, 2, 16));
		}

		//======== octais ==========
		String[] octais = {"0", "1", "2", "11", "17", "22", "777", "700"};
		for(String octal : octais){
			System.out.println("octal:" + octal + "\tbinario: " + baseStringParaBaseString(octal, 8, 2));
		}
		for(String octal : octais){
			System.out.println("octal:" + octal + "\toctal: " + baseStringParaBaseString(octal, 8, 8));
		}
		for(String octal : octais){
			System.out.println("octal:" + octal + "\tdecimal: " + baseStringParaBaseString(octal, 8, 10));
		}
		for(String octal : octais){
			System.out.println("octal:" + octal + "\thexa: " + baseStringParaBaseString(octal, 8, 16));
		}

		//======== decimais ==========
		String[] decimais = {"0", "1", "2", "11", "17", "22", "777", "700"};
		for(String decimal : decimais){
			System.out.println("decimal:" + decimal + "\tbinario: " + baseStringParaBaseString(decimal, 10, 2));
		}
		for(String decimal : decimais){
			System.out.println("decimal:" + decimal + "\tdecimal: " + baseStringParaBaseString(decimal, 10, 8));
		}
		for(String decimal : decimais){
			System.out.println("decimal:" + decimal + "\tdecimal: " + baseStringParaBaseString(decimal, 10, 10));
		}
		for(String decimal : decimais){
			System.out.println("decimal:" + decimal + "\thexa: " + baseStringParaBaseString(decimal, 10, 16));
		}

		//======== hexadecimais ==========
		String[] hexadecimais = {"0", "1", "A", "1FF", "20", "22", "777", "700"};
		for(String hexa : hexadecimais){
			System.out.println("hexa:" + hexa + "\tbinario: " + baseStringParaBaseString(hexa, 16, 2));
		}
		for(String hexa : hexadecimais){
			System.out.println("hexa:" + hexa + "\toctal: " + baseStringParaBaseString(hexa, 16, 8));
		}
		for(String hexa : hexadecimais){
			System.out.println("hexa:" + hexa + "\tdecimal: " + baseStringParaBaseString(hexa, 16, 10));
		}
		for(String hexa : hexadecimais){
			System.out.println("hexa:" + hexa + "\thexa: " + baseStringParaBaseString(hexa, 16, 16));
		}
	}

	public static String baseStringParaBaseString(String valorIn, int baseIn, int baseOut){

		if(baseIn == baseOut)
			return valorIn;

		return decimalParaBaseString(baseStringParaDecimal(valorIn, baseIn), baseOut);
		
		//========= Modo de resolver sem esfor�o algum ;) =======
		/**
		return Integer.toString(Integer.parseInt(valorIn, baseIn), baseOut);
		**/
		
		//		String str = "";
		//		
		//		switch (baseIn) {
		//		case 2:
		//		{
		//			switch (baseOut) {
		//			case 2:	return valorIn;
		//			case 8:	{  /*TODO*/ break; }
		//			case 10: return Integer.toString(baseStringParaDecimal(valorIn, baseIn));
		//			case 16: { /*TODO*/ break; }
		//			default: break;
		//			}
		//
		//			break;
		//		}
		//		case 8:
		//		{
		//			switch (baseOut) {
		//			case 2:	{ /*TODO*/ break; }
		//			case 8:	return valorIn;
		//			case 10: return Integer.toString(baseStringParaDecimal(valorIn, baseIn));
		//			case 16: { /*TODO*/ break; }
		//			default: break;
		//			}
		//
		//			break;
		//		}
		//		case 10:
		//		{
		//			return decimalParaBaseString(Integer.parseInt(valorIn), baseOut);
		//		}
		//		case 16:
		//		{
		//			switch (baseOut) {
		//			case 2: {  /*TODO*/ break; }
		//			case 8: {  /*TODO*/ break; }
		//			case 10: return Integer.toString(baseStringParaDecimal(valorIn, baseIn));
		//			case 16: {  /*TODO*/ break; }
		//			default: break;
		//			}
		//
		//			break;
		//		}
		//		default: break;
		//		}
		//
		//		return str.length() == 0 ? "0" : str;
	}

}

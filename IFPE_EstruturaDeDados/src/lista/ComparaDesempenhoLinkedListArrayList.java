package lista;

import java.util.ArrayList;
import java.util.LinkedList;

public class ComparaDesempenhoLinkedListArrayList {

	public static void main3(String[] args) {

		System.out.println("Rodando...");
		System.out.println();


		for(int rodada = 1, quantidadeElementos = 1000; rodada < 7 ; rodada++, quantidadeElementos *= 10){
			System.out.println("======== Rodada " + rodada + " ==========");
			avaliacaoDesempenho(quantidadeElementos);
		}

		//		System.out.println("======== Rodada " + rodada++ + " ==========");
		//		quantidadeElementos *= 10;
		//		avaliacaoDesempenho(quantidadeElementos);
		//
		//		System.out.println("======== Rodada " + rodada++ + " ==========");
		//		quantidadeElementos *= 10;
		//		avaliacaoDesempenho(quantidadeElementos);
		//
		//		System.out.println("======== Rodada " + rodada++ + " ==========");
		//		quantidadeElementos *= 10;
		//		avaliacaoDesempenho(quantidadeElementos);
		//
		//		System.out.println("======== Rodada " + rodada++ + " ==========");
		//		quantidadeElementos *= 10;
		//		avaliacaoDesempenho(quantidadeElementos);
		//
		//		System.out.println("======== Rodada " + rodada++ + " ==========");
		//		quantidadeElementos *= 10;
		//		avaliacaoDesempenho(quantidadeElementos);

		System.out.println("Terminou!");

	}

	public static void avaliacaoDesempenho(int quantidadeElementos){

		long ini, end;

		//===== Criando a LinkedList =====
		System.out.println("Criando e preenchendo LinkedList com " + quantidadeElementos + " elementos");
		ini = System.currentTimeMillis();
		LinkedList<Integer> listaEncadeada = new LinkedList<Integer>();
		for(int i = 0 ; i < quantidadeElementos ; i++){
			listaEncadeada.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList: tempo=" + (end - ini) + " ms");


		//===== Criando a ArrayList =====
		System.out.println("Criando e preenchendo ArrayList com " + quantidadeElementos + " elementos");
		ini = System.currentTimeMillis();
		ArrayList<Integer> listaArray = new ArrayList<Integer>(quantidadeElementos);
		for(int i = 0 ; i < quantidadeElementos ; i++){
			listaArray.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList: tempo=" + (end - ini) + " ms");



		//=========== Calculando o tempo de busca =================
		ini = System.currentTimeMillis();
		int iMeio1 = listaEncadeada.get(quantidadeElementos/2);
		end = System.currentTimeMillis();
		System.out.println("LinkedList: iMeio=" + iMeio1 +  ", tempo=" + (end - ini) + " ms");

		ini = System.currentTimeMillis();
		int iMeio2 = listaArray.get(quantidadeElementos/2);
		end = System.currentTimeMillis();
		System.out.println("ArraysList: iMeio=" + iMeio2 +  ", tempo=" + (end - ini) + " ms");

		System.out.println();

	}
	
	public static void main2(String[] args) {

		final int QUANTIDADE_ELEMENTOS = 1000000;

		LinkedList<Integer> listaEncadeada = new LinkedList<Integer>();

		for(int i = 0 ; i < QUANTIDADE_ELEMENTOS ; i++){
			listaEncadeada.add( -100 + (int)(Math.random()*200.0) );
			//			listaEncadeada.add( i );
		}

		//		//Calcular a soma de todos os valores usando o Iterator
		//		int soma = 0;
		//		Iterator<Integer> it = listaEncadeada.iterator();
		//		while(it.hasNext()){
		//			int v = it.next();
		//			soma += v;
		//		}
		//		System.out.println("soma=" + soma);
		//		System.out.println();
		//
		//		//Modificar elementos da lista (sem utilizar o Iterator, já que com o Iterator não é possível modificar o conteúdo de um elemento da lista, apenas ler ou remover o elemento)
		//		System.out.println("listaEncadeada");
		//		System.out.println(listaEncadeada.toString());
		//		for(int i = 0 ; i < listaEncadeada.size() ; i++){
		//			if(listaEncadeada.get(i) < 0)
		//				listaEncadeada.set(i, 0);
		//		}
		//		System.out.println(listaEncadeada.toString());
		//		System.out.println();


		//Criando uma nova lista
		ArrayList<Integer> listaArray = new ArrayList<Integer>(QUANTIDADE_ELEMENTOS);
		for(int i = 0 ; i < QUANTIDADE_ELEMENTOS ; i++){
			//			listaArray.add( -100 + (int)(Math.random()*200.0) );
			listaArray.add( i );
		}

		//		//Modificar elementos da nova lista (sem utilizar o Iterator, já que com o Iterator não é possível modificar o conteúdo de um elemento da lista, apenas ler ou remover o elemento)
		//		System.out.println("listaArray");
		//		System.out.println(listaArray.toString());
		//		for(int i = 0 ; i < listaEncadeada.size() ; i++){
		//			if(listaArray.get(i) < 0)
		//				listaArray.set(i, 0);
		//		}
		//		System.out.println(listaArray.toString());
		//		System.out.println();
		//		
		//		
		//		//Comparando as listas utilizando o Iterator
		//		Iterator<Integer> it1 = listaEncadeada.iterator();
		//		Iterator<Integer> it2 = listaArray.iterator();
		//		boolean iguais = true;
		//		while(it1.hasNext() && it2.hasNext()){
		//			
		//			int v1 = it1.next();
		//			int v2 = it2.next();
		//			
		//			if(v1 != v2){
		//				iguais = false;
		//			}
		//			
		//		}
		//		if(iguais){
		//			System.out.println("A listas são iguais");
		//		}else{
		//			System.out.println("A listas são diferentes");
		//		}



		long ini1 = System.currentTimeMillis();
		int iMeio1 = listaEncadeada.get(QUANTIDADE_ELEMENTOS/2);
		long end1 = System.currentTimeMillis();
		System.out.println("LinkedList: iMeio=" + iMeio1 +  ", tempo=" + (end1 - ini1));

		long ini2 = System.currentTimeMillis();
		int iMeio2 = listaArray.get(QUANTIDADE_ELEMENTOS/2);
		long end2 = System.currentTimeMillis();
		System.out.println("ArraysList: iMeio=" + iMeio2 +  ", tempo=" + (end2 - ini2));
	}

}

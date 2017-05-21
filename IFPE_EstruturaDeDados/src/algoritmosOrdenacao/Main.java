package algoritmosOrdenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import algoritmosOrdenacao.Produto;

public class Main {
	
	public static void main(String[] args) {

		List<Produto> minhaLista = new ArrayList<Produto>();
		minhaLista.add(new Produto("arroz", "12345", 50.0));
		minhaLista.add(new Produto("feijão", "123456", 49.90));
		minhaLista.add(new Produto("arroz2", "1234567", 5.0));

		Produto chave = new Produto("", "1234567", 5.0);
		ComparaProdutoPrecoCrescente precoCresc = new ComparaProdutoPrecoCrescente();
		
		long tempoInicial = System.currentTimeMillis();

		Collections.sort(minhaLista, precoCresc); //ordena a lista antes
		System.out.println(minhaLista);

		int indice = Collections.binarySearch(minhaLista, chave, precoCresc); //Faz a busca binária
		
		long tempoFinal = System.currentTimeMillis();
		long tempoGasto = tempoFinal - tempoInicial;
		System.out.println("indice: "+ indice);
		System.out.println(minhaLista.get(indice));
		System.out.println("Tempo gasto " + tempoGasto + " ms");

		

	}

	public static void main4(String[] args) {

		Produto[] meuArray = new Produto[3];
		meuArray[0] = new Produto("arroz", "12345", 50.0);
		meuArray[1] = new Produto("feijão", "12345", 49.90);
		meuArray[2] = new Produto("arroz", "12345", 5.0);

		Produto chave = new Produto("arroz", "0", 0.0);
		ComparaProdutoNomeCrescente nomeCresc = new ComparaProdutoNomeCrescente();

		Arrays.sort(meuArray, nomeCresc); //ordena o array antes
		System.out.println(Arrays.toString(meuArray));

		int indice = Arrays.binarySearch(meuArray, chave, nomeCresc); //Faz a busca binária
		System.out.println("indice: "+ indice);
		System.out.println(meuArray[indice]);

	}

	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Produto> minhaLista = new ArrayList<Produto>();
		minhaLista.add(new Produto("arroz", "12345", 50.0));
		minhaLista.add(new Produto("feijão", "12345", 49.90));
		minhaLista.add(new Produto("arroz", "12345", 5.0));

		ComparaProdutoNomeCrescente nomeCresc = new ComparaProdutoNomeCrescente();
		ComparaProdutoNomeDecrescente nomeDec = new ComparaProdutoNomeDecrescente();
		ComparaProdutoPrecoCrescente precoCresc = new ComparaProdutoPrecoCrescente();
		ComparaProdutoPrecoDecrescente precoDec = new ComparaProdutoPrecoDecrescente();

		String linha;
		while( (linha = sc.nextLine()) != null){
			if(linha.equals("nc")){
				Collections.sort(minhaLista, nomeCresc);
			}
			else if(linha.equals("nd")){
				Collections.sort(minhaLista, nomeDec);
			}
			else if(linha.equals("pc")){
				Collections.sort(minhaLista, precoCresc);
			}
			else if(linha.equals("pd")){
				Collections.sort(minhaLista, precoDec);
			}
			else{
				System.out.println("Entrada inválida!");
				break;
			}

			System.out.println(minhaLista);
		}

		sc.close();
	}

	public static void main3(String[] args) {

		Scanner sc = new Scanner(System.in);

		Produto[] meuArray = new Produto[3];
		meuArray[0] = new Produto("arroz", "12345", 50.0);
		meuArray[1] = new Produto("feijão", "12345", 49.90);
		meuArray[2] = new Produto("arroz", "12345", 5.0);

		ComparaProdutoNomeCrescente nomeCresc = new ComparaProdutoNomeCrescente();
		ComparaProdutoNomeDecrescente nomeDec = new ComparaProdutoNomeDecrescente();
		ComparaProdutoPrecoCrescente precoCresc = new ComparaProdutoPrecoCrescente();
		ComparaProdutoPrecoDecrescente precoDec = new ComparaProdutoPrecoDecrescente();

		String linha;
		while( (linha = sc.nextLine()) != null){
			if(linha.equals("nc")){
				Arrays.sort(meuArray, nomeCresc);
			}
			else if(linha.equals("nd")){
				Arrays.sort(meuArray, nomeDec);
			}
			else if(linha.equals("pc")){
				Arrays.sort(meuArray, precoCresc);
			}
			else if(linha.equals("pd")){
				Arrays.sort(meuArray, precoDec);
			}
			else{
				System.out.println("Entrada inválida!");
				break;
			}

			System.out.println(Arrays.toString(meuArray));
		}

		sc.close();
	}

}

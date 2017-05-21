package ordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Questao3 {

	/**
	 * A classe ItemPedido � a letra A da quest�o 3.
	 */

	/**
	 * Implementado por David Alain
	 * 
	 * @param listaProduto
	 * @return
	 */
	public static List<ItemPedido> letraB(List<Produto> listaProduto){

		//Cria uma lista vazia
		List<ItemPedido> listaItemPedido = new ArrayList<ItemPedido>();

		//Percorre todos os produtos da 'listaProduto'
		for(Produto p : listaProduto){
			ItemPedido novo = new ItemPedido(1, p); //Cria um novo ItemPedido com quantidade 1 para caso n�o exista na lista, j� adiciona com a quantidade certa. 

			/**
			 * Verifica se j� existe na 'listaItemPedido' algum ItemPedido que tenha o produto 'p'.
			 * Internamente � utilizado o m�todo equals da classe ItemPedido, e este m�doto compara dois ItemPedido apenas pelo Produto que cada um tem.  
			 */
			int index = listaItemPedido.indexOf(novo);
			if(index >= 0){
				//J� existe na lista, ent�o aumenta a quantidade

				ItemPedido salvo = listaItemPedido.get(index);
				salvo.setQtdeProd(salvo.getQtdeProd() + 1);
			}else{
				//N�o existe na lista, ent�o adiciona
				listaItemPedido.add(novo);
			}
		}

		return listaItemPedido;
	}

	/**
	 * OK
	 * 
	 * @param listaItemPedido
	 * @return
	 */
	public static Produto[] letraC(List<ItemPedido> listaItemPedido){

		Produto[] array = new Produto[3];

		ComparaPorMaisCompradoDecresc porQtdeMais = new ComparaPorMaisCompradoDecresc(); 
		Collections.sort(listaItemPedido, porQtdeMais);

		array[0] = listaItemPedido.get(0).getProduto();
		array[1] = listaItemPedido.get(1).getProduto();
		array[2] = listaItemPedido.get(2).getProduto();

		return array;

	}

	/**
	 * Consertado por David Alain
	 * 
	 * @param listaItemPedido
	 */
	public static void letraD(List<ItemPedido> listaItemPedido){

		ComparaPorMenosComprado porQtdeMenos =  new ComparaPorMenosComprado();
		Collections.sort(listaItemPedido, porQtdeMenos);

		System.out.println("qtd: " + listaItemPedido.get(0).getQtdeProd() + ", produto:" + listaItemPedido.get(0).getProduto());
	}

	/**
	 * Consertado por David Alain
	 * 
	 * @param listaItemPedido
	 */
	public static void letraE(List<ItemPedido> listaItemPedido){

		ComparaPorMenorPrecoMaisComprado porQtdeMenosPreco =  new ComparaPorMenorPrecoMaisComprado();
		Collections.sort(listaItemPedido, porQtdeMenosPreco);

		System.out.println(listaItemPedido.get(0).getProduto());
	}

	/**
	 * Implementado por David Alain
	 * 
	 * @param listaItemPedido
	 * @return
	 */
	public static double letraF(List<ItemPedido> listaItemPedido){

		double valorTotalPedido = 0;

		for(ItemPedido itemPedido : listaItemPedido){

			//Se a quantidade for maior ou igual a 3, ent�o tem desconto de 10%, ou seja, s� se paga 90% do valor.
			if(itemPedido.getQtdeProd() >= 3){
				valorTotalPedido += ((itemPedido.getProduto().getPreco() * itemPedido.getQtdeProd()) * 0.9);

			}else{ //Se a quantidade for menor que 3, ent�o n�o tem desconto.
				valorTotalPedido += (itemPedido.getProduto().getPreco() * itemPedido.getQtdeProd());	
			}

		}

		return valorTotalPedido;
	}

	/**
	 * Main n�o obrigat�rio usado apenas para teste do m�todos da quest�o 3
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		//Cria os protudos para teste
		List<Produto> listaProdutos = new ArrayList<Produto>();
		listaProdutos.add(new Produto("1111", "feij�o", 10.0));
		listaProdutos.add(new Produto("1111", "feij�o", 10.0));
		listaProdutos.add(new Produto("2222", "arroz", 5.95));
		listaProdutos.add(new Produto("2222", "arroz", 5.95));
		listaProdutos.add(new Produto("3333", "macarr�o", 2.39));
		listaProdutos.add(new Produto("3333", "macarr�o", 2.39));
		listaProdutos.add(new Produto("3333", "macarr�o", 2.39));
		listaProdutos.add(new Produto("3333", "macarr�o", 2.39));
		listaProdutos.add(new Produto("4444", "biscoito", 1.39));
		listaProdutos.add(new Produto("4444", "biscoito", 1.39));
		listaProdutos.add(new Produto("4444", "biscoito", 1.39));
		listaProdutos.add(new Produto("5555", "bolacha", 1.39));
		listaProdutos.add(new Produto("5555", "bolacha", 1.39));
		listaProdutos.add(new Produto("5555", "bolacha", 1.39));
		listaProdutos.add(new Produto("5555", "bolacha", 1.39));
		
		//====== Letra A ======
		//Implementa��o da classe ItemPedido

		//====== Letra B ======
		System.out.println("====== Letra B ======");
		System.out.println("Lista de ItemPedido com as quantidades:");
		List<ItemPedido> listaItemPedido = letraB(listaProdutos);
		System.out.println(listaItemPedido);
		System.out.println();

		//====== Letra C ======
		System.out.println("====== Letra C ======");
		System.out.println("Tr�s produtos mais comprados:");
		List<ItemPedido> listaItemPedidoLetraC = new ArrayList<ItemPedido>(listaItemPedido);
		Produto[] produtos = letraC(listaItemPedidoLetraC);
		System.out.println(Arrays.toString(produtos));
		System.out.println();

		//====== Letra D ======
		System.out.println("====== Letra D ======");
		System.out.println("Produto menos comprado e quantidade:");
		List<ItemPedido> listaItemPedidoLetraD = new ArrayList<ItemPedido>(listaItemPedido);
		letraD(listaItemPedidoLetraD);
		System.out.println();

		//====== Letra E ======
		System.out.println("====== Letra E ======");
		System.out.println("Produto com menor pre�o que foi mais comprado");
		List<ItemPedido> listaItemPedidoLetraE = new ArrayList<ItemPedido>(listaItemPedido);
		letraE(listaItemPedidoLetraE);
		System.out.println();

		//====== Letra F ======
		System.out.println("====== Letra F ======");
		List<ItemPedido> listaItemPedidoLetraF = new ArrayList<ItemPedido>(listaItemPedido);
		System.out.println("Valor total do pedido com os descontos:");
		System.out.println(letraF(listaItemPedidoLetraF));
		System.out.println();

	}

}

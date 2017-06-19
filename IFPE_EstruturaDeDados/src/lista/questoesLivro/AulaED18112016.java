package lista.questoesLivro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AulaED18112016 {

	public static void main(String[] args) {
		//questao1();
		//questao2();
	}

	/**
	 * Aplicar desconto em todos os produtos de uma lista de Produtos.
	 */
	public static void questao1() {

		List<Produto> lista = new ArrayList<Produto>(5);
		lista.add(new Produto(1, 10, 400));
		lista.add(new Produto(2, 100, 800));
		lista.add(new Produto(3, 50, 400));
		lista.add(new Produto(4, 40, 700));
		lista.add(new Produto(5, 25, 400));

		double desconto = 20.0 / 100.0; //10%

		//Aplica o desconto a todos os produtos
		for(Produto p : lista){
			p.setPreco(p.getPreco()*(1.0 - desconto));
		}

		//Imprime a lista com os novos valores
		for(Produto p : lista){
			System.out.println("cod:"+p.getCodigo() + ", preco:"+p.getPreco());
		}

		//Mostrar quantos produtos tem quantidade maior que 500
		int quantidadeMaiorQue500 = 0;
		for(Produto p : lista){
			if(p.getQuantidadeEstocada() > 500)
				quantidadeMaiorQue500 ++;
		}
		System.out.println("Quantidade de produtos com mais de 500 unidades:" + quantidadeMaiorQue500);

	}

	/**
	 * Realizar opera��es numa lista de funcion�rios.
	 */
	public static void questao2(){

		double valorSalarioComparar = 106; //Valor de sal�rio a ser fornecido pelo usu�rio

		List<Funcionario> lista = new LinkedList<Funcionario>();
		insereOrdenado(lista, new Funcionario("ana1", 100));
		insereOrdenado(lista, new Funcionario("ana2", 107));
		insereOrdenado(lista, new Funcionario("ana3", 107));
		insereOrdenado(lista, new Funcionario("ana4", 104));
		insereOrdenado(lista, new Funcionario("ana5", 105));
		insereOrdenado(lista, new Funcionario("ana6", 106));
		insereOrdenado(lista, new Funcionario("ana7", 107));
		insereOrdenado(lista, new Funcionario("ana8", 100));

		//Letra a: o nome do funcion�rio que tem o maior sal�rio (em caso de empate mostrar todos);
		double maiorSalario = lista.get(0).getSalario();
		for(Funcionario f : lista){
			if(f.getSalario() == maiorSalario){
				System.out.println(f.getNome());
			}else{
				break;
			}
		}

		//Letra b: a m�dia salarial de todos os funcion�rios juntos
		double media = 0;
		for(Funcionario f : lista){
			media += f.getSalario();
		}
		media /= (double)lista.size();
		System.out.println(media);

		//Letra c: a quantidade de funcion�rios com sal�rio superior a um valor fornecido pelo usu�rio.
		//Caso nenhum funcion�rio satisfaca essa condi��o, mostrar mensagem.
		int quantidade = 0;
		for(Funcionario f : lista){
			if(f.getSalario() > valorSalarioComparar){
				quantidade++;
			}
		}
		if(quantidade != 0){
			System.out.println(quantidade + " funcion�rios tem sal�rio superior a " + valorSalarioComparar);
		}else{
			System.out.println("Nenhum funcion�rio tem sal�rio superior a " + valorSalarioComparar);
		}

	}

	//ordenado de forma decrescente: do maior para o menor
	public static void insereOrdenado(List<Funcionario> lista, Funcionario novo){
		lista.add(novo);
		Collections.sort(lista);
	}

}


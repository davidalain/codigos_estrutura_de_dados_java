package questoesProvas.gerenciamentoGovernamental;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GerenciamentoGovernamental {

	/**
	 * Sempre a classe que � a chave no mapa tem que ter implementado corretamente o m�todo hashCode.
	 * Ent�o na classe Estado tem que ter o m�todo hashCode() (e j� tem).
	 */
	private Map<Estado,List<Municipio>> mapa;
	
	
	public GerenciamentoGovernamental(Map<Estado,List<Municipio>> mapa) {
		this.mapa = mapa;
	}
	

	/**
	 * Dado um nome de funcion�rio, imprimir todos os estados que possuem pelo menos um funcionario com aquele nome.
	 * 
	 * Para resolver essa quest�o devemos iterar por todos os funcion�rios para descobrir quais deles tem o nome que estamos procurando.
	 * Mas os funcion�rio est�o armazenados em uma lista dentro de Municipio, ent�o precisamos percorrer os Municipios.
	 * 
	 * Mas a lista de Municipio est� relacionada com o Estado atrav�s do mapa. E precisamos manter a rela��o entre Estado e List<Municipio> para poder imprimir o estado.
	 * Para fazer isso temos que usar o m�todo entrySet() do mapa.
	 * 
	 * Esta � uma das maneiras mais simples de resolver essa quest�o e
	 * pode acontecer de imprimir o mesmo nome do estado v�rias vezes se tiver v�rios funcion�rios com o mesmo nome trabalhando no mesmo estado.
	 * Como eu n�o espec�fiquei nada sobre isso, ent�o pode ficar assim. 
	 * 
	 * @param nomeFuncionario
	 */
	public void letraA(String nomeFuncionario) {

		/**
		 * Percorre por todo o mapa iterando entre as tuplas (Estado , List<Municipio>) que foram armazenadas no mapa.
		 */
		for(Entry<Estado, List<Municipio>> entry : mapa.entrySet()) {

			/**
			 * entry.getValue() retorna o valor do mapa que � List<Municipio>
			 * Ent�o iremos iterar por cada Munic�pio para pegar os funcionarios 
			 */
			for(Municipio municipio : entry.getValue()) {

				/**
				 * Percorre por todos os funcionarios de todos os municipios para saber quais funcion�rios tem o nome que estamos procurando.
				 */
				for(Funcionario funcionario : municipio.getFuncionarios()) {

					/**
					 * Se tem o nome que estamos procurando, imprime o nome do estado onde aquele funcion�rio trabalha.
					 */
					if(funcionario.getNome().equals(nomeFuncionario)) {
						/**
						 * entry.getKey() retorna a chave do mapa, que nesse caso � Estado.
						 * 
						 * S� funciona imprimir desta maneira porque foi implementado o m�todo toString() na classe Estado.
						 */
						System.out.println(entry.getKey());
						break;
					}

				}

			}

		}

	}

	/**
	 * Dado um municipio, retornar a regi�o de qual � o estado que ele pertence.
	 * 
	 *  Neste problema tem que prestar aten��o que o Munic�pio n�o armazena a Regi�o. A regi�o est� dentro de Estado.
	 *  Ent�o temos que percorrer o mapa tendo sempre a rela��o do Estado com a List<Municipio> para poder pegar a Regi�o que est� no estado e tamb�m pegar o Municipio.
	 *  
	 *  
	 * @param municipio
	 * @return
	 */
	public Regiao letraB(Municipio municipio) {

		/**
		 * Percorre por todo o mapa iterando entre as tuplas (Estado , List<Municipio>) que foram armazenadas no mapa. 
		 */
		for(Entry<Estado,List<Municipio>> entry : mapa.entrySet()) {

			/**
			 * entry.getValue() retorna o valor que � List<Municipio>.
			 * Ent�o devemos procurar se o municipio que foi passado est� dentro dessa lista usando o m�todo contains() de List.  
			 * 
			 * S� funciona procurar na lista com o m�todo contains() porque foi implementado o m�todo equals corretamente na classe Municipio.
			 */
			if(entry.getValue().contains(municipio)) {
				/**
				 * entry.getKey() retorna a chave que � um Estado.
				 * E no estado � que tem a regi�o.
				 */
				return entry.getKey().getRegiao();
			}

		}

		return null;
	}

	/**
	 * Dado um estado, retornar a soma dos sal�rios de todos os munic�pios daquele estado.
	 * 
	 * Aqui devemos pegar os sal�rios dos funcion�rios, mas os funcion�rios est�o armazenados em Municipio.
	 * O Estado est� relacionado com os Municipios atrav�s do atributo Map<Estado,List<Municipio>> mapa.
	 * 
	 * 
	 * @param estado
	 * @return
	 */
	public double letraC(Estado estado) {

		/**
		 * Inicializa o valor com zero
		 */
		double somaSalario = 0.0;

		/**
		 * Como precisamos percorrer todos os Munic�pios de um dado Estado devemos usar o m�todo get() do mapa para pegar a lista de Munic�pios daquele estado.
		 * 
		 * mapa.get(estado) retorna o valor do mapa que � um List<Municipio> que est� relacionado com a chave que � estado.
		 */
		for(Municipio municipio : mapa.get(estado)) {

			/**
			 * Percorre todos os funcion�rios do munic�pio para somar os sal�rios.
			 */
			for(Funcionario funcionario : municipio.getFuncionarios()) {

				/**
				 * Soma o sal�rio do funcionario
				 */
				somaSalario += funcionario.getSalario();
			}

		}

		/**
		 * retorna a soma dos sal�rios
		 */
		return somaSalario;

	}

	/**
	 * Dado um municipio e um estado, verificar se o munic��o informado � um munic�pio daquel estado.
	 * 
	 * Esta � a implementa��o mais simples desse m�todo, porque est� sendo admitido que o mapa est� preenchido corretamente.
	 * E tamb�m que sempre ser� usado um Estado que est� sendo usado como chave no mapa e que esse Estado tem uma lista de munic�pios n�o nula.
	 * A solu��o mais segura seria checar se a lista veio vazia (null) antes de chamar o m�todo contains().
	 *  
	 * 
	 * @param municipio
	 * @param estado
	 * @return
	 */
	public boolean letraD(Municipio municipio, Estado estado) {

		/**
		 * Pega a lista de municipios daquele estado atrav�s do mapa.
		 * 
		 * O m�todo mapa.get(estado) retorna um List<Municipio> que est�o relacionados com a chave estado.
		 * O m�todo contains() da List verifica se aquele municipio est� contido na lista e s� funciona corretamente porque o m�todo equals() est� implementado corretamente na classe Municipio.
		 */
		return mapa.get(estado).contains(municipio);

	}

	/**
	 * Dada uma regi�o retornar a quantidade de municipios que aquela regi�o possui.
	 * 
	 * Neste m�todo tem que ter a rela��o entre a regi�o (que est� armazenada dentro de Estado) com o municipio e isso � feito atrav�s do mapa pegando-se a tupla (Estado, List<Municipio>)
	 * 
	 * @return
	 */
	public int letraE(Regiao regiao){

		int contadorMunicipios = 0;

		/**
		 * Percorre todas as tuplas (Estado, List<Municipio>)
		 */
		for(Entry<Estado, List<Municipio>> entry : mapa.entrySet()) {

			/**
			 * Se � um estado daquela regi�o ent�o conta quantos munic�pios tem naquele estado.
			 * 
			 * entry.getKey() retorna a chave que � um Estado.
			 * Regi�o � um atributo do estado.
			 * 
			 * Compara��o deve ser feita usando equals()
			 */
			if(entry.getKey().getRegiao().equals(regiao)) {

				/**
				 * entry.getValue() retorna o valor do mapa que � um List<Municipio>
				 * o m�todo size() retorna a quantidade de elementos armazenados na lista
				 */
				contadorMunicipios += entry.getValue().size();

			}

		}

		return contadorMunicipios;
	}

	/**
	 * Dada uma regi�o, retornar um array com todos os municipios ordenados de maneira decrescente pela soma dos sal�rios dos funcion�rios daqueles municipios.
	 * 
	 * @param regiao
	 * @return
	 */
	public Municipio[] letraF(Regiao regiao) {

		/**
		 * Cria uma lista para armazenar todos os municipios da regi�o informada.
		 */
		List<Municipio> listaMunicipios = new ArrayList<>();

		/**
		 * Percorre todas as tuplas (Estado, List<Municipio>)
		 */
		for(Entry<Estado, List<Municipio>> entry : mapa.entrySet()) {

			/**
			 * Se � um estado daquela regi�o ent�o conta quantos munic�pios tem naquele estado.
			 * 
			 * entry.getKey() retorna a chave que � um Estado.
			 * Regi�o � um atributo do estado.
			 * 
			 * Compara��o deve ser feita usando equals()
			 */
			if(entry.getKey().getRegiao().equals(regiao)) {

				/**
				 * Adiciona os municipios na lista.
				 * 
				 * entry.getValue() retorna o valor que � um List<Municipio>.
				 * listaMunicipios.addAll() adiciona de uma vez uma lista de Municipios dentro de listaMunicipios.
				 */
				listaMunicipios.addAll(entry.getValue());
			}

		}

		/**
		 * A partir daqui j� temos todos os munic�pios daquela regi�o, agora iremos ordenar.
		 * 
		 * Criando o Comparador j� aqui para facilitar
		 */
		Collections.sort(listaMunicipios, new Comparator<Municipio>() {

			/**
			 * Implementando o m�todo compare() para comparar os Munic�pios pela soma dos sal�rios de maneira decrescente.
			 */
			@Override
			public int compare(Municipio m1, Municipio m2) {

				double salariosFuncionariosMunicipio1 = 0.0;
				double salariosFuncionariosMunicipio2 = 0.0;

				/**
				 * Soma os sal�rios dos funcion�rios do munic�pio m1
				 */
				for(Funcionario funcionario : m1.getFuncionarios()) {
					salariosFuncionariosMunicipio1 += funcionario.getSalario();
				}

				/**
				 * Soma os sal�rios dos funcion�rios do munic�pio m2
				 */
				for(Funcionario funcionario : m2.getFuncionarios()) {
					salariosFuncionariosMunicipio2 += funcionario.getSalario();
				}

				/**
				 * Compara as somas dos sal�rios e retorna o valor com sinal invertido (-Double.compare(...)) para ordenar de maneira decrescente.
				 * Se usar Double.compare() vai ordenar de maneira crescente. Tem que mudar o sinal para ordenar de maneira decrescente.
				 */
				return -Double.compare(salariosFuncionariosMunicipio1, salariosFuncionariosMunicipio2);
			}

		});

		/**
		 * Agora os munic�pios est�o ordenados de maneira decrescente pela soma dos sal�rios dos funcion�rios.
		 * Vamos converter para array e retornar.
		 * 
		 * O m�todo toArray() converte uma lista em array.
		 * Usando toArray(new Municipio[0]) para retornar um array de Municipio ao inv�s de array de Object.
		 */
		return listaMunicipios.toArray(new Municipio[0]);
	}

	/**
	 * Dados um valor m�nimo e m�ximo de sal�rio, retornar todos os munic�pios que possuem funcion�rios cujo sal�rio est� entre os valores m�nimo e m�ximo informados (inclusive), 
	 * ordenados de maneira crescente pela quantidade de funcion�rios.  
	 * 
	 * @param valorMinimo
	 * @param valorMaximo
	 * @return
	 */
	public List<Municipio> letraG(double valorMinimo, double valorMaximo) {

		/**
		 * Cria uma lista para armazenar os munic�pios que tem funcion�rios com os valores de sal�rio que estamos procurando.
		 */
		List<Municipio> listaMunicipios = new ArrayList<>();

		/**
		 * Itera entre todos os munic�pios de todos os estados para pegar os munic�pios que t�m os funcion�rios com os sal�rio que estamos procurando. 
		 * 
		 * mapa.values() retorna uma cole��o (Collection (como se fosse uma lista)) de List<Municipio>.
		 * Ficaria assim Collection<List<Municipio>>. Mas pra ficar mais f�cil de entender voc� poderia usar como se fosse List<List<Municipio>>  
		 */
		for(List<Municipio> municipios : mapa.values()) {

			/**
			 * Itera por todos os municipios
			 */
			for(Municipio municipio : municipios) {

				/**
				 * Itera por todos os funcion�rios do municipio
				 */
				for(Funcionario funcionario : municipio.getFuncionarios()) {

					/**
					 * Adiciona o municipio na listaMunicipios se o sal�rio estiver dentro do valor que estamos procurando.
					 */
					if(funcionario.getSalario() >= valorMinimo && funcionario.getSalario() <= valorMaximo) {
						listaMunicipios.add(municipio);

						break; //Usando break para n�o adicionar o mesmo municipio duas vezes na lista.
					}
				}
			}
		}

		/**
		 * Agora j� temos todos os munic�pios que tem os funcion�rios com os salarios que estamos procurando.
		 * Ent�o vamos ordenar de maneira crescente pela quantidade de funcionarios.
		 */
		Collections.sort(listaMunicipios, new Comparator<Municipio>() {

			/**
			 * Compara os municipios de maneira crescente pela quantidade de funcionarios
			 */
			@Override
			public int compare(Municipio m1, Municipio m2) {
				int quantidadeFuncionariosMunicipio1 = m1.getFuncionarios().size();
				int quantidadeFuncionariosMunicipio2 = m2.getFuncionarios().size();
				return (quantidadeFuncionariosMunicipio1 - quantidadeFuncionariosMunicipio2);
			}
		});

		/**
		 * Retorna a lista que agora est� ordenada.
		 */
		return listaMunicipios;
	}

	/**
	 * Dado um estado, imprimir o nome do municipio e a m�dia salarial dos funcion�rios daquele munic�pio no seguinte formato "nome: S�o Paulo, m�dia sal�rio: 19050.89" 
	 * 
	 * @param estado
	 */
	public void letraH(Estado estado) {

		/**
		 * Percorre todos os munic�pios daquele estado.
		 * 
		 * mapa.get(estado) retorna um List<Municipio> que � a lista de munic�pios do estado informado
		 */
		for(Municipio municipio : mapa.get(estado)) {

			double mediaSalario = 0.0;

			/**
			 * Calcula a m�dia dos sal�rios dos funcion�rios daquele municipio
			 */
			for(Funcionario funcionario : municipio.getFuncionarios()) {
				mediaSalario += funcionario.getSalario();
			}

			mediaSalario /= (double) municipio.getFuncionarios().size();

			System.out.println("nome: " + municipio.getNome() + ", m�dia sal�rio: " + mediaSalario);
		}

	}

	/**
	 * Dado um estado, retornar o municipio daquele estado cujos funcion�rios do munic�pio tem a maior m�dia de idade.
	 * 
	 * @param estado
	 * @return
	 */
	public Municipio letraJ(Estado estado) {

		/**
		 * Pega a lista de municipios daquele estado.
		 * 
		 * mapa.get(estado) retorna um List<Municipio>
		 */
		List<Municipio> municipios = mapa.get(estado);

		/**
		 * Ordena os munic�pios pela m�dia de idade de maneira crescente e pega o primeiro elemento da lista (que vai ser o que tem a maior m�dia de idade)
		 */
		Collections.sort(municipios, new Comparator<Municipio>() {

			@Override
			public int compare(Municipio m1, Municipio m2) {

				double mediaIdadeM1 = 0.0;
				double mediaIdadeM2 = 0.0;

				/**
				 * Soma a idade de todos os funcion�rios do municipio m1
				 */
				for(Funcionario funcionario : m1.getFuncionarios()) {
					mediaIdadeM1 += (double)funcionario.getIdade();
				}

				/**
				 * Soma a idade de todos os funcion�rios do municipio m2
				 */
				for(Funcionario funcionario : m2.getFuncionarios()) {
					mediaIdadeM2 += (double)funcionario.getIdade();
				}
				
				/**
				 * Divide a soma pela quantidade para pegar a m�dia.
				 */
				mediaIdadeM1 /= (double) m1.getFuncionarios().size();
				mediaIdadeM2 /= (double) m1.getFuncionarios().size();

				/**
				 * Retorna a compara��o dos dois valores com sinal invertido (-Double.compare()) para ordenar de maneira decrescente.
				 */
				return -Double.compare(mediaIdadeM1, mediaIdadeM2);
			}

		});
		
		/**
		 * Aqui j� temos a lista ordenada pela m�dia de idade de maneira decrescente.
		 * Agora � s� pegar e retornar o primeiro elemento da lista que � o municipio que tem a maior m�dia de idade dos funcion�rios. 
		 */
		return municipios.get(0);
	}

}

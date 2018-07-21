package questoesProvas.gerenciamentoGovernamental;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GerenciamentoGovernamental {

	/**
	 * Sempre a classe que é a chave no mapa tem que ter implementado corretamente o método hashCode.
	 * Então na classe Estado tem que ter o método hashCode() (e já tem).
	 */
	private Map<Estado,List<Municipio>> mapa;
	
	
	public GerenciamentoGovernamental(Map<Estado,List<Municipio>> mapa) {
		this.mapa = mapa;
	}
	

	/**
	 * Dado um nome de funcionário, imprimir todos os estados que possuem pelo menos um funcionario com aquele nome.
	 * 
	 * Para resolver essa questão devemos iterar por todos os funcionários para descobrir quais deles tem o nome que estamos procurando.
	 * Mas os funcionário estão armazenados em uma lista dentro de Municipio, então precisamos percorrer os Municipios.
	 * 
	 * Mas a lista de Municipio está relacionada com o Estado através do mapa. E precisamos manter a relação entre Estado e List<Municipio> para poder imprimir o estado.
	 * Para fazer isso temos que usar o método entrySet() do mapa.
	 * 
	 * Esta é uma das maneiras mais simples de resolver essa questão e
	 * pode acontecer de imprimir o mesmo nome do estado várias vezes se tiver vários funcionários com o mesmo nome trabalhando no mesmo estado.
	 * Como eu não específiquei nada sobre isso, então pode ficar assim. 
	 * 
	 * @param nomeFuncionario
	 */
	public void letraA(String nomeFuncionario) {

		/**
		 * Percorre por todo o mapa iterando entre as tuplas (Estado , List<Municipio>) que foram armazenadas no mapa.
		 */
		for(Entry<Estado, List<Municipio>> entry : mapa.entrySet()) {

			/**
			 * entry.getValue() retorna o valor do mapa que é List<Municipio>
			 * Então iremos iterar por cada Município para pegar os funcionarios 
			 */
			for(Municipio municipio : entry.getValue()) {

				/**
				 * Percorre por todos os funcionarios de todos os municipios para saber quais funcionários tem o nome que estamos procurando.
				 */
				for(Funcionario funcionario : municipio.getFuncionarios()) {

					/**
					 * Se tem o nome que estamos procurando, imprime o nome do estado onde aquele funcionário trabalha.
					 */
					if(funcionario.getNome().equals(nomeFuncionario)) {
						/**
						 * entry.getKey() retorna a chave do mapa, que nesse caso é Estado.
						 * 
						 * Só funciona imprimir desta maneira porque foi implementado o método toString() na classe Estado.
						 */
						System.out.println(entry.getKey());
						break;
					}

				}

			}

		}

	}

	/**
	 * Dado um municipio, retornar a região de qual é o estado que ele pertence.
	 * 
	 *  Neste problema tem que prestar atenção que o Município não armazena a Região. A região está dentro de Estado.
	 *  Então temos que percorrer o mapa tendo sempre a relação do Estado com a List<Municipio> para poder pegar a Região que está no estado e também pegar o Municipio.
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
			 * entry.getValue() retorna o valor que é List<Municipio>.
			 * Então devemos procurar se o municipio que foi passado está dentro dessa lista usando o método contains() de List.  
			 * 
			 * Só funciona procurar na lista com o método contains() porque foi implementado o método equals corretamente na classe Municipio.
			 */
			if(entry.getValue().contains(municipio)) {
				/**
				 * entry.getKey() retorna a chave que é um Estado.
				 * E no estado é que tem a região.
				 */
				return entry.getKey().getRegiao();
			}

		}

		return null;
	}

	/**
	 * Dado um estado, retornar a soma dos salários de todos os municípios daquele estado.
	 * 
	 * Aqui devemos pegar os salários dos funcionários, mas os funcionários estão armazenados em Municipio.
	 * O Estado está relacionado com os Municipios através do atributo Map<Estado,List<Municipio>> mapa.
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
		 * Como precisamos percorrer todos os Municípios de um dado Estado devemos usar o método get() do mapa para pegar a lista de Municípios daquele estado.
		 * 
		 * mapa.get(estado) retorna o valor do mapa que é um List<Municipio> que está relacionado com a chave que é estado.
		 */
		for(Municipio municipio : mapa.get(estado)) {

			/**
			 * Percorre todos os funcionários do município para somar os salários.
			 */
			for(Funcionario funcionario : municipio.getFuncionarios()) {

				/**
				 * Soma o salário do funcionario
				 */
				somaSalario += funcionario.getSalario();
			}

		}

		/**
		 * retorna a soma dos salários
		 */
		return somaSalario;

	}

	/**
	 * Dado um municipio e um estado, verificar se o municíío informado é um município daquel estado.
	 * 
	 * Esta é a implementação mais simples desse método, porque está sendo admitido que o mapa está preenchido corretamente.
	 * E também que sempre será usado um Estado que está sendo usado como chave no mapa e que esse Estado tem uma lista de municípios não nula.
	 * A solução mais segura seria checar se a lista veio vazia (null) antes de chamar o método contains().
	 *  
	 * 
	 * @param municipio
	 * @param estado
	 * @return
	 */
	public boolean letraD(Municipio municipio, Estado estado) {

		/**
		 * Pega a lista de municipios daquele estado através do mapa.
		 * 
		 * O método mapa.get(estado) retorna um List<Municipio> que estão relacionados com a chave estado.
		 * O método contains() da List verifica se aquele municipio está contido na lista e só funciona corretamente porque o método equals() está implementado corretamente na classe Municipio.
		 */
		return mapa.get(estado).contains(municipio);

	}

	/**
	 * Dada uma região retornar a quantidade de municipios que aquela região possui.
	 * 
	 * Neste método tem que ter a relação entre a região (que está armazenada dentro de Estado) com o municipio e isso é feito através do mapa pegando-se a tupla (Estado, List<Municipio>)
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
			 * Se é um estado daquela região então conta quantos municípios tem naquele estado.
			 * 
			 * entry.getKey() retorna a chave que é um Estado.
			 * Região é um atributo do estado.
			 * 
			 * Comparação deve ser feita usando equals()
			 */
			if(entry.getKey().getRegiao().equals(regiao)) {

				/**
				 * entry.getValue() retorna o valor do mapa que é um List<Municipio>
				 * o método size() retorna a quantidade de elementos armazenados na lista
				 */
				contadorMunicipios += entry.getValue().size();

			}

		}

		return contadorMunicipios;
	}

	/**
	 * Dada uma região, retornar um array com todos os municipios ordenados de maneira decrescente pela soma dos salários dos funcionários daqueles municipios.
	 * 
	 * @param regiao
	 * @return
	 */
	public Municipio[] letraF(Regiao regiao) {

		/**
		 * Cria uma lista para armazenar todos os municipios da região informada.
		 */
		List<Municipio> listaMunicipios = new ArrayList<>();

		/**
		 * Percorre todas as tuplas (Estado, List<Municipio>)
		 */
		for(Entry<Estado, List<Municipio>> entry : mapa.entrySet()) {

			/**
			 * Se é um estado daquela região então conta quantos municípios tem naquele estado.
			 * 
			 * entry.getKey() retorna a chave que é um Estado.
			 * Região é um atributo do estado.
			 * 
			 * Comparação deve ser feita usando equals()
			 */
			if(entry.getKey().getRegiao().equals(regiao)) {

				/**
				 * Adiciona os municipios na lista.
				 * 
				 * entry.getValue() retorna o valor que é um List<Municipio>.
				 * listaMunicipios.addAll() adiciona de uma vez uma lista de Municipios dentro de listaMunicipios.
				 */
				listaMunicipios.addAll(entry.getValue());
			}

		}

		/**
		 * A partir daqui já temos todos os municípios daquela região, agora iremos ordenar.
		 * 
		 * Criando o Comparador já aqui para facilitar
		 */
		Collections.sort(listaMunicipios, new Comparator<Municipio>() {

			/**
			 * Implementando o método compare() para comparar os Municípios pela soma dos salários de maneira decrescente.
			 */
			@Override
			public int compare(Municipio m1, Municipio m2) {

				double salariosFuncionariosMunicipio1 = 0.0;
				double salariosFuncionariosMunicipio2 = 0.0;

				/**
				 * Soma os salários dos funcionários do município m1
				 */
				for(Funcionario funcionario : m1.getFuncionarios()) {
					salariosFuncionariosMunicipio1 += funcionario.getSalario();
				}

				/**
				 * Soma os salários dos funcionários do município m2
				 */
				for(Funcionario funcionario : m2.getFuncionarios()) {
					salariosFuncionariosMunicipio2 += funcionario.getSalario();
				}

				/**
				 * Compara as somas dos salários e retorna o valor com sinal invertido (-Double.compare(...)) para ordenar de maneira decrescente.
				 * Se usar Double.compare() vai ordenar de maneira crescente. Tem que mudar o sinal para ordenar de maneira decrescente.
				 */
				return -Double.compare(salariosFuncionariosMunicipio1, salariosFuncionariosMunicipio2);
			}

		});

		/**
		 * Agora os municípios estão ordenados de maneira decrescente pela soma dos salários dos funcionários.
		 * Vamos converter para array e retornar.
		 * 
		 * O método toArray() converte uma lista em array.
		 * Usando toArray(new Municipio[0]) para retornar um array de Municipio ao invés de array de Object.
		 */
		return listaMunicipios.toArray(new Municipio[0]);
	}

	/**
	 * Dados um valor mínimo e máximo de salário, retornar todos os municípios que possuem funcionários cujo salário está entre os valores mínimo e máximo informados (inclusive), 
	 * ordenados de maneira crescente pela quantidade de funcionários.  
	 * 
	 * @param valorMinimo
	 * @param valorMaximo
	 * @return
	 */
	public List<Municipio> letraG(double valorMinimo, double valorMaximo) {

		/**
		 * Cria uma lista para armazenar os municípios que tem funcionários com os valores de salário que estamos procurando.
		 */
		List<Municipio> listaMunicipios = new ArrayList<>();

		/**
		 * Itera entre todos os municípios de todos os estados para pegar os municípios que têm os funcionários com os salário que estamos procurando. 
		 * 
		 * mapa.values() retorna uma coleção (Collection (como se fosse uma lista)) de List<Municipio>.
		 * Ficaria assim Collection<List<Municipio>>. Mas pra ficar mais fácil de entender você poderia usar como se fosse List<List<Municipio>>  
		 */
		for(List<Municipio> municipios : mapa.values()) {

			/**
			 * Itera por todos os municipios
			 */
			for(Municipio municipio : municipios) {

				/**
				 * Itera por todos os funcionários do municipio
				 */
				for(Funcionario funcionario : municipio.getFuncionarios()) {

					/**
					 * Adiciona o municipio na listaMunicipios se o salário estiver dentro do valor que estamos procurando.
					 */
					if(funcionario.getSalario() >= valorMinimo && funcionario.getSalario() <= valorMaximo) {
						listaMunicipios.add(municipio);

						break; //Usando break para não adicionar o mesmo municipio duas vezes na lista.
					}
				}
			}
		}

		/**
		 * Agora já temos todos os municípios que tem os funcionários com os salarios que estamos procurando.
		 * Então vamos ordenar de maneira crescente pela quantidade de funcionarios.
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
		 * Retorna a lista que agora está ordenada.
		 */
		return listaMunicipios;
	}

	/**
	 * Dado um estado, imprimir o nome do municipio e a média salarial dos funcionários daquele município no seguinte formato "nome: São Paulo, média salário: 19050.89" 
	 * 
	 * @param estado
	 */
	public void letraH(Estado estado) {

		/**
		 * Percorre todos os municípios daquele estado.
		 * 
		 * mapa.get(estado) retorna um List<Municipio> que é a lista de municípios do estado informado
		 */
		for(Municipio municipio : mapa.get(estado)) {

			double mediaSalario = 0.0;

			/**
			 * Calcula a média dos salários dos funcionários daquele municipio
			 */
			for(Funcionario funcionario : municipio.getFuncionarios()) {
				mediaSalario += funcionario.getSalario();
			}

			mediaSalario /= (double) municipio.getFuncionarios().size();

			System.out.println("nome: " + municipio.getNome() + ", média salário: " + mediaSalario);
		}

	}

	/**
	 * Dado um estado, retornar o municipio daquele estado cujos funcionários do município tem a maior média de idade.
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
		 * Ordena os municípios pela média de idade de maneira crescente e pega o primeiro elemento da lista (que vai ser o que tem a maior média de idade)
		 */
		Collections.sort(municipios, new Comparator<Municipio>() {

			@Override
			public int compare(Municipio m1, Municipio m2) {

				double mediaIdadeM1 = 0.0;
				double mediaIdadeM2 = 0.0;

				/**
				 * Soma a idade de todos os funcionários do municipio m1
				 */
				for(Funcionario funcionario : m1.getFuncionarios()) {
					mediaIdadeM1 += (double)funcionario.getIdade();
				}

				/**
				 * Soma a idade de todos os funcionários do municipio m2
				 */
				for(Funcionario funcionario : m2.getFuncionarios()) {
					mediaIdadeM2 += (double)funcionario.getIdade();
				}
				
				/**
				 * Divide a soma pela quantidade para pegar a média.
				 */
				mediaIdadeM1 /= (double) m1.getFuncionarios().size();
				mediaIdadeM2 /= (double) m1.getFuncionarios().size();

				/**
				 * Retorna a comparação dos dois valores com sinal invertido (-Double.compare()) para ordenar de maneira decrescente.
				 */
				return -Double.compare(mediaIdadeM1, mediaIdadeM2);
			}

		});
		
		/**
		 * Aqui já temos a lista ordenada pela média de idade de maneira decrescente.
		 * Agora é só pegar e retornar o primeiro elemento da lista que é o municipio que tem a maior média de idade dos funcionários. 
		 */
		return municipios.get(0);
	}

}

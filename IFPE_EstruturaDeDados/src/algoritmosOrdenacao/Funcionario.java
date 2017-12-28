package algoritmosOrdenacao;

import java.util.Arrays;
import java.util.Comparator;

public class Funcionario implements Comparable<Funcionario> {

	private String nome;
	private double salario;

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString(){
		return "(" + this.nome + ": " + this.salario + ")"; //Formato: (David: 100.0)
	}

	//	/*Ordena pelo salário de maneira crescente */
	//	@Override
	//	public int compareTo(Funcionario func) {
	//		if(this.salario > func.salario) return 1;
	//		if(this.salario < func.salario) return -1;
	//		return 0;
	//	}

	/* Ordena pelo nome de maneira crescente */
	//	@Override
	//	public int compareTo(Funcionario func) {
	//		return this.nome.compareTo(func.nome);
	//	}

	/* Ordena pelo nome e salário de maneira crescente */
	@Override
	public int compareTo(Funcionario func) {
		int resultado = this.nome.compareTo(func.nome);

		if(resultado != 0)
			return resultado;

		if(this.salario > func.salario) return 1;
		if(this.salario < func.salario) return -1;
		return 0;
	}

	public static void main(String[] args) {

		//		Funcionario f0 = new Funcionario("Jackson", 10000.00);
		//		Funcionario f1 = new Funcionario("David", 1.00);
		//		int v = f1.compareTo(f0);
		//		
		//		int j = 'J';
		//		int d = 'D';
		//		System.out.println("J:" + j);
		//		System.out.println("D:" + d);
		//		System.out.println("Diferença:" + (d-j));
		//		System.out.println("Resultado:" + v);

		//		Carro[] carros = {
		//				new Carro("Gol", 2, 120),
		//				new Carro("Veloster", 3, 120),
		//				new Carro("Kombi", 3, 90),
		//				new Carro("Doblo", 3, 150),
		//				new Carro("Gol", 4, 120)
		//		};
		//
		//		/* ====================================================================== */
		//		System.out.println("\r\n=============");
		//		Carro[] carros1 = carros.clone();
		//		System.out.println("Antes de ordenar:");
		//		System.out.println(Arrays.toString(carros1));
		//
		//		Arrays.sort(carros1);
		//
		//		System.out.println("Depois de ordenar:");
		//		System.out.println(Arrays.toString(carros1));
		//		/* =======================================================


		final Funcionario[] funcionariosImutavel = {
				new Funcionario("David0", 5000.00),
				new Funcionario("David1", 200.00),
				new Funcionario("David0", 40.00),
				new Funcionario("David0", 3000.00),
				new Funcionario("David2", 50000.00)
		};
		//
		//		/* ====================================================================== */
		//		System.out.println("\r\n=============");
		//		Funcionario[] funcionarios1 = funcionariosImutavel.clone();
		//		System.out.println("Antes de ordenar:");
		//		System.out.println(Arrays.toString(funcionarios1));
		//
		//		Arrays.sort(funcionarios1);
		//
		//		System.out.println("Depois de ordenar:");
		//		System.out.println(Arrays.toString(funcionarios1));
		//		/* ====================================================================== */

		/* ====================================================================== */
		System.out.println("\r\n=============");
		Funcionario[] funcionarios2 = funcionariosImutavel.clone();
		System.out.println("Antes de ordenar:");
		System.out.println(Arrays.toString(funcionarios2));

		//Descomente e comente as linhas abaixo para ver o funcionamento de cada um
		//Comparator<Funcionario> comparador = new ComparadorFuncionarioSalarioCrescente();
		Comparator<Funcionario> comparador = new ComparadorFuncionarioSalarioDecrescente();
		//Comparator<Funcionario> comparador = new ComparadorFuncionarioNome();
		//Comparator<Funcionario> comparador = new ComparadorFuncionarioNomeSalario();

		Arrays.sort(funcionarios2, comparador);

		System.out.println("Depois de ordenar:");
		System.out.println(Arrays.toString(funcionarios2));
		/* ====================================================================== */
		//
		//		/* ====================================================================== */
		//		System.out.println("\r\n=============");
		//		Funcionario[] funcionarios3 = funcionariosImutavel.clone();
		//		Arrays.sort(funcionarios3); //Ordena primeiro e procura com busca binária depois
		//		Funcionario f = new Funcionario(null, 40.00);
		//
		//		int indice = Arrays.binarySearch(funcionarios3, f);
		//		System.out.println("Encontrou o funcionario: " + funcionarios3[indice]);
		//		/* ====================================================================== */

	}

}

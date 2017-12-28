package algoritmosOrdenacao;

import java.util.Comparator;

public class ComparadorFuncionarioNomeSalario implements Comparator<Funcionario>{

	@Override
	public int compare(Funcionario f1, Funcionario f2) {
		int resultado = f1.getNome().compareTo(f2.getNome());
		
		if(resultado != 0)
			return resultado;
		
		if(f1.getSalario() > f2.getSalario()) return 1;
		if(f1.getSalario() < f2.getSalario()) return -1;
		return 0;
	}



}

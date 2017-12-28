package generics;

import java.util.ArrayList;
import java.util.List;

public class DAOPessoa implements DAO<Pessoa>{

	ArrayList<Pessoa> pessoas = new ArrayList<>();

	@Override
	public Pessoa inserir(Pessoa e) {
		if(pegar(e) == null) {
			this.pessoas.add(e);
			return e;
		}
		return null;
	}

	@Override
	public Pessoa remover(Pessoa e) {
		for(int i = 0 ; i < this.pessoas.size() ; i++) {
			if(this.pessoas.get(i).equals(e)) {
				return this.pessoas.remove(i);
			}
		}
		return null;
	}

	@Override
	public Pessoa pegar(Pessoa e) {
		for(Pessoa p : this.pessoas) { 
			if(p.equals(e)) {
				return p;
			}
		}
		return null;
	}

	@Override
	public Pessoa atualizar(Pessoa e) {
		for(int i = 0 ; i < this.pessoas.size() ; i++) {
			if(this.pessoas.get(i).equals(e)) {
				return this.pessoas.set(i, e);
			}
		}
		return null;
	}

	@Override
	public List<Pessoa> listarTodos() {
		return this.pessoas;
	}



}

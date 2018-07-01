package generics;

import java.util.ArrayList;
import java.util.List;

public class DAOPessoa implements DAO<Pessoa>{

	private List<Pessoa> lista;
	
	public DAOPessoa() {
		this.lista = new ArrayList<>();
	}
	
	@Override
	public void inserir(Pessoa elemento) {
		lista.add(elemento);
	}

	@Override
	public Pessoa pegar(Pessoa e) {
		
		/** usando for **/
//		for(int i = 0 ; i < lista.size() ; i++) {
//			Pessoa p = lista.get(i);
//			
//			if(p.equals(e)) {
//				return p;
//			}
//		}
		
		/** usando for-each **/
		for(Pessoa p : lista) {
			if(p.equals(e))
				return p;
		}
		
		return null;
	}

	@Override
	public void atualizar(Pessoa e) {
		
		for(int i = 0 ; i < lista.size() ; i++) {
			if(lista.get(i).equals(e)) {
				lista.set(i, e);
				break;
			}
		}
		
	}

	@Override
	public Pessoa deletar(Pessoa e) {
		
		for(int i = 0 ; i < lista.size() ; i++) {
			if(lista.get(i).equals(e)) {
				return lista.remove(i);
			}
		}
		
		return null;
	}

	@Override
	public List<Pessoa> listarTodos() {
		return lista;
	}

	
	
}

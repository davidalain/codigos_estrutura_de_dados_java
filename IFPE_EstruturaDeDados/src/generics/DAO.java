package generics;

import java.util.List;

public interface DAO<E> {
	
	public E inserir(E e);
	public E remover(E e);
	public E pegar(E e);
	public E atualizar(E e);
	public List<E> listarTodos();

}

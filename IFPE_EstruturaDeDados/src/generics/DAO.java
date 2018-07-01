package generics;

public interface DAO<E> {
	
	public void inserir(E e);
	public E pegar(E e);
	public void atualizar(E e);
	public E deletar(E e);

}

package generics;

public class Main {
	
	public static void main(String[] args) {
		
		DAOPessoa dao = new DAOPessoa();
		
		Pessoa p1 = new Pessoa("Zé", "000.000.000-00", "ze", "1234");
		Pessoa p2 = new Pessoa("João", "001.001.001-01", "joao", "0101");
		Pessoa p3 = new Pessoa("Maria", "002.002.002-02", "maria", "2345");
		
		dao.inserir(p1);
		dao.inserir(p2);
		dao.inserir(p3);
		System.out.println(dao.listarTodos());
		
		System.out.println(dao.pegar(new Pessoa(null, "002.002.002-02", null, null)));
//		System.out.println(dao.listarTodos());
	}

}

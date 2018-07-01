package generics;

public class MainDAO {
	
	public static void main(String[] args) {
		
		DAOPessoa dao = new DAOPessoa();
		
		Pessoa p1 = new Pessoa("David", "00", "david", "123");
		
		dao.inserir(p1);
		
		System.out.println(dao.pegar(p1));
		
	}

}

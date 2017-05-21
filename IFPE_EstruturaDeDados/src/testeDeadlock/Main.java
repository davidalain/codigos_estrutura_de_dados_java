package testeDeadlock;

public class Main {

	public static int teste(int n) throws Exception{
		System.out.println("Inicio");
		try{
			if(n == 0)
				throw new Exception("Erro");
			return n;
		}finally{
			System.out.println("Fim");
		}
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(teste(1));
		System.out.println(teste(0));
	}
	
}

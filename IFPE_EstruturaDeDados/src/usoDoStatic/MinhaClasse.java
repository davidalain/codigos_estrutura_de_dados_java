package usoDoStatic;

public class MinhaClasse {
	
	public static String casa;
	
	public static void mostrarNome(){
		System.out.println("NOME asasa");
	}
	
	public static void main(String[] args) {
		
//		MinhaClasse.casa
		
		MinhaClasse m = new MinhaClasse();
		m.mostrarNome();
		
		MinhaClasse.mostrarNome();
		
	}

}

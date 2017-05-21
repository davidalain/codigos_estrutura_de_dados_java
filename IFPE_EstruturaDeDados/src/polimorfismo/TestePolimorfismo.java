package polimorfismo;

public class TestePolimorfismo {

	static int soma(int a, int b){
		System.out.println("soma int");
		return a + b;
	}
	
	static int soma(double a, double b){
		System.out.println("soma double");
		return (int)(a + b);
	}
	
	public static void f(Boolean b){
		//faz nada
	}
	
	public static void f2(boolean b){
		//faz nada
	}
	
	public static void main(String[] args) {
//		System.out.println(soma(2.999,2));
		
		Boolean b = new Boolean(true);
		
		f(true);
		f2(b);
		
		f(b);
		f2(true);
		
	}
	
}

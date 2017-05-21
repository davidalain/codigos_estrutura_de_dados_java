package lista;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;


public class MainListaEncadeadaImplementacao {

	public static void main(String[] args) throws IOException, AWTException {

		//		execicio1();
		//		execicio2();
		//		execicio3();
		//		execicio4();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teste David Alain");
		sc.next();
		wipeConsole();
		System.out.println("Teste David Alain1");
		sc.next();
		wipeConsole();
		System.out.println("Teste David Alain2");
		sc.next();
		wipeConsole();
		System.out.println("Teste David Alain3");
		sc.next();
		
		sc.close();
	}

	/**
	 * !!! Gambiarra master !!!
	 * 
	 * Executa atalhos do teclado do eclipse para apagar o conteúdo do console.
	 * 
	 * Vide: http://stackoverflow.com/questions/7522022/how-to-delete-stuff-printed-to-console-by-system-out-println
	 * 
	 * @throws AWTException
	 */
	public static void wipeConsole() throws AWTException{
        Robot robbie = new Robot();
        //shows the Console View
        robbie.keyPress(KeyEvent.VK_ALT);
        robbie.keyPress(KeyEvent.VK_SHIFT);
        robbie.keyPress(KeyEvent.VK_Q);
        robbie.keyRelease(KeyEvent.VK_ALT);
        robbie.keyPress(KeyEvent.VK_SHIFT);
        robbie.keyPress(KeyEvent.VK_Q);
        robbie.keyPress(KeyEvent.VK_C);
        robbie.keyRelease(KeyEvent.VK_C);

        //clears the console
        robbie.keyPress(KeyEvent.VK_SHIFT);
        robbie.keyPress(KeyEvent.VK_F10);
        robbie.keyRelease(KeyEvent.VK_SHIFT);
        robbie.keyRelease(KeyEvent.VK_F10);
        robbie.keyPress(KeyEvent.VK_R);
        robbie.keyRelease(KeyEvent.VK_R);
    }

	public static void execicio1(){

		int[] array1 = {1, 2, 4, 16};
		int[] array2 = {10, 20, -4, 11};
		//		int[] array1 = {1, 2, 3};
		//		int[] array2 = {4, 5};
		int[] resultado;

		resultado = Problema2.concatenar(array1, array2);
		for(int i = 0 ; i < resultado.length ; i++){
			System.out.print("" + resultado[i] + "\t");
		}
		System.out.println();

	}


	public static void execicio2(){

		int[][] tabela = { 
				{1, 2, 3, 10}, 
				{3, 4, 5, 50}, 
				{5, 10, 11, 32}, 
				{-50, 23, 0, 8} 
		};

		Problema1.mostrarTabela(tabela);

	}

	public static void execicio3(){

		int[] dados1 = {1,2,3};
		int[] dados2 = {1,2,3};
		Numeros n1 = new Numeros(dados1);
		Numeros n2 = new Numeros(dados2);

		if(n1.equals(n2))
			System.out.println("Os números são iguais");
		else
			System.out.println("Os números são diferentes");

	}


	public static void execicio4(){

		ListaEncadeadaImplementacao lista = new ListaEncadeadaImplementacao();

		System.out.println("Mostrando todos os elementos depois de criar a lista vazia...");
		lista.mostrarTodos();

		lista.insert(1);
		lista.insert(2);
		lista.insert(5);
		lista.insert(10);
		lista.insert(11);

		System.out.println("Mostrando todos os elementos depois de inserir os elementos...");
		lista.mostrarTodos();


		lista.remove(2);
		lista.remove(2);
		lista.remove(2);
		lista.remove(2);

		System.out.println("Mostrando todos os elementos depois de remover alguns...");
		lista.mostrarTodos();

	}



}

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class ClienteTCPBasico {
	
	public static void main(String[] args) {
		
		try {
			Socket cliente = new Socket("127.0.0.1",12345);
			
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			Object obj = entrada.readObject();
			
			if(obj instanceof Date){
				Date data_atual = (Date) obj;
				JOptionPane.showMessageDialog(null,"Data recebida do servidor:" + data_atual.toString());
				
			} else if(obj instanceof String){
				String str = (String) obj;
				System.out.println(str);
				
			} else if(obj instanceof LinkedList){
				LinkedList list = (LinkedList) obj;
				JOptionPane.showMessageDialog(null,"Lista recebida do servidor:" + list.toString());
				
			} else if(obj instanceof int[]){
				int[] array = (int[]) obj;
				JOptionPane.showMessageDialog(null,"Array recebido do servidor:" + Arrays.toString(array));
				
			}
			
			entrada.close();
			System.out.println("C#: Conexão encerrada");
			
		} catch(Exception e) {
			System.out.println("C#: Erro: " + e.getMessage());
		}
	}
}


//Leia mais em: Java Sockets: Criando comunicações em Java http://www.devmedia.com.br/java-sockets-criando-comunicacoes-em-java/9465#ixzz43FgH7Gj2
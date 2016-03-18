import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCPBasico {

	public static void main(String[] args) {
		try {

			//Instancia o ServerSocket ouvindo a porta
			int porta = 12345;
			ServerSocket servidor = new ServerSocket(porta);
			System.out.println("S#: Servidor ouvindo a porta " + porta);

			while(true) {
				// o método accept() bloqueia a execução até que o
				//servidor receba um pedido de conexão

				Socket cliente = servidor.accept();
				System.out.println("S#: Cliente conectado: " + cliente.getInetAddress().getHostAddress());

				ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
				ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
				saida.flush();

				//Servidor enviando um Date
				//saida.writeObject(new Date());

				//Servidor enviando String
				saida.writeObject("Tretas infinitas");
				System.out.println(entrada.readObject().toString());

				//Servidor enviando LinkedList
				//LinkedList<String> lista = new LinkedList<String>();
				//lista.add("A");
				//lista.add("B");
				//lista.add("C");
				//saida.writeObject(lista);

				//Servidor enviando array
				//int[] array = {1,2,3,4,5};
				//saida.writeObject(array);

				saida.close();

				cliente.close();
			} 
		} catch(Exception e) {
			System.out.println("S#: Erro: " + e.getMessage());
		} finally {

		} 
	} 
}

//Leia mais em: Java Sockets: Criando comunicações em Java http://www.devmedia.com.br/java-sockets-criando-comunicacoes-em-java/9465#ixzz43FfIbrSZ
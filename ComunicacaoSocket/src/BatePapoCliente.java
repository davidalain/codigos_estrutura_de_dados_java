import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class BatePapoCliente {

	public static void main(String[] args) {

		try {
			Socket cliente = new Socket("127.0.0.1",12345);

			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
			Scanner teclado = new Scanner(System.in);
			String texto = "";
			
			while(true){
				Object obj = entrada.readObject();

				String str = (String) obj;
				System.out.println(str);
				
				texto = teclado.next();
				if(texto.equals("s"))
					break;
				
				saida.writeObject(texto);
			}
			
			entrada.close();
			System.out.println("C#: Conexão encerrada");

		} catch(Exception e) {
			System.out.println("C#: Erro: " + e.getMessage());
		}
	}

}

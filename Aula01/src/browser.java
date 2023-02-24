import java.awt.Desktop;
import java.net.URI;
import java.net.URL;

public class browser {

	public static void main(String[] args) {
		//Fazendo uso de classes que acessam recursos do SO para abrir uma janela do navegador em uma página específica:
		try {
			URI uri = new URL("https://www.ifpb.edu.br/joaopessoa").toURI();
			Desktop.getDesktop().browse(uri);
		}
		catch (Exception e){
			System.out.println("Problema na URL.");
		}
	}

}

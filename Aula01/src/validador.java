import java.util.Scanner;

public class validador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a palavra-chave: ");
		String palavra = teclado.nextLine();
		
		//Bloco de repetição:
		while(!palavra.equals("ifpb")) {
			System.out.println("Palavra não validada. Tente novamente.");
			palavra = teclado.nextLine();
		}
		
		teclado.close();
		System.out.println("Palavra validada!");
	}
	//Existe também o do-while, que funciona executando o código dentro do bloco do enquanto a condição de CONTINUAÇÃO for verdadeira.
}

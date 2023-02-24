import java.util.Scanner;

import javax.swing.JOptionPane;

public class amigos {

	public static void main(String[] args) {
		//Instanciando um objeto da classe Scanner (responsável por receber inputs no programa):
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		//Lendo o input do teclado e armazenando em nome1:
		String nome1 = teclado.nextLine();
		
		System.out.println(nome1 + "De quem você é amigo?");
		//Lendo o input do teclado e armazenando em nome2:
		String nome2 = teclado.nextLine();
		System.out.println(nome1 + " e " + nome2 + " são amigos.");
		
		//Encerrando a leitura do teclado:
		teclado.close();
	}

}

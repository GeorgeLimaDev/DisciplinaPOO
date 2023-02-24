import java.util.Scanner;

public class Corretor {

	public static void main(String[] args) {
		
		String gabarito = "aaeecbdbcd";
		//Passando o gabarito para um array de strings para fazer a comparação:
		String [] gabaritoComparar = gabarito.split("");
		System.out.println("Gabarito: " + gabarito);
		//Ao tentar mostrar o objeto array é retornada a posicação de memória:
		System.out.println("Gabarito: " + gabaritoComparar);
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite as respostas: ");
		String respostas = teclado.nextLine();
		
		//Passando as respostas para um array de strings para fazer a comparação:
		String [] respostasComparar = respostas.split("");
		
		//Contador de acertos deve ficar aqui devido ao escopo do laço.
		int acertos = 0;
		for(int i = 0; i <= gabarito.length()-1; i++) {
			//Incrementa o contador em 1 sempre que a resposta conferir com o gabarito:
			if (gabaritoComparar[i].equals(respostasComparar[i])){
				acertos++;
			}
		}
		System.out.println("Número de acertos: " + acertos);
		teclado.close(); }
}
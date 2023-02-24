import java.util.Random;

public class sorteio {

	public static void main(String[] args) {
		Random sorteio = new Random();
		int numero;
		System.out.println("Números sorteados: ");
		
		//Estrutura de repetição:
		for (int i = 1; i <= 6; i++) {
			//Foi incrementado 1 para garantir que o zero não seja impresso:
			numero = sorteio.nextInt(60) + 1;
			System.out.println(numero);
		}

	}

}

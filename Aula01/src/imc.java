
public class imc {

	public static void main(String[] args) {
		//Atribuição de variáveis (devem ser tipadas):
		double peso = 60;
		double altura = 1.75;
		//Utilizando o módulo Math para calcular potência:
		double imc = peso / Math.pow(altura, 2);
		
		System.out.println("IMC: " + imc);
		
		//Estrutura de decisão:
		if (imc < 18.5) {
			System.out.println("Abaixo do normal.");
		}
		else if (imc < 25) {
			System.out.println("Normal.");
		}
		else if (imc < 30) {
			System.out.println("Acima do normal.");
		}
		else if (imc < 35) {
			System.out.println("Obesidade 1.");
		}
		else if (imc < 40) {
			System.out.println("Obesidade 2");
		}
		else {
			System.out.println("Morbidade.");
		}

	}

}

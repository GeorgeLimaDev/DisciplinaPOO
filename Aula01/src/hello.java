import java.util.Random;

public class hello {

	public static void main(String[] args) {
		//OBS: No java strings são tratadas como classes de caracteres unicode:
		System.out.println("Hello world!");
		
		//Usando new para instanciar um objeto da classe Random:
		System.out.println(new Random().nextInt(100));
		
		
	}

}

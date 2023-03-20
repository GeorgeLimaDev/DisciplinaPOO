
public class Testes {

	public static void main(String[] args) {
		
		System.out.println("Testes da classe Aluno: ");
		
		Aluno a1 = new Aluno("George", 90, 70);
		System.out.println("Media: " + a1.getMedia() + " Situacao: " + a1.getSituacao());
		
		Aluno a2 = new Aluno("José", 60, 50);
		System.out.println("Media: " + a2.getMedia() + " Situacao: " + a2.getSituacao());
		
		Aluno a3 = new Aluno("João", 35, 40);
		System.out.println("Media: " + a3.getMedia() + " Situacao: " + a3.getSituacao());
		
		
		System.out.println("Testes da classe Conta: ");
		
		Conta c1 = new Conta(1, 123);
		System.out.println(c1.toString());
		c1.creditar(50.5);
		System.out.println(c1.getSaldo());
		c1.debitar(30.3);
		System.out.println(c1.getSaldo());
		
		//Testando a uniformidade do método transferir:
		Conta c2 = new Conta(2, 321);
		System.out.println(c2.toString());
		c1.transferir(c2, 15.1);
		System.out.println("Saldo de c1 apos a transferencia: " + c1.getSaldo());
		System.out.println("Saldo de c2 apos a transferencia: " + c2.getSaldo());
		
		Conta c3 = new Conta(3, 333); //Única conta vazia
		System.out.println(c1.estaVazia()); //False
		System.out.println(c2.estaVazia()); //False
		System.out.println(c3.estaVazia()); //True
	
		
		Conta c4 = c1.clonar();
		System.out.println(c4.toString()); //Deve conter os mesmos dados de c1.
		System.out.println(c1.toString());
	}

}

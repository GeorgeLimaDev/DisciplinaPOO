
public class testes {

	public static void main(String[] args) {
		//Instanciando um objeto da classe Retangulo:
		Retangulo r = new Retangulo();
		
		//Atribuindo propriedades a ele:
		r.id = 1;
		r.largura = 1;
		r.comprimento = 7;
		
		//Saída: 7*1 = 7
		System.out.println(r.calcularArea());
		
		//Alterando propriedades. Nova saída 3*4 = 12
		r.largura = 3;
		r.comprimento = 4;
		System.out.println(r.calcularArea());
		
		//Instanciando após a adição do construtor:
		
		 Retangulo r2 = new Retangulo(1, 3, 3); //Args: id, altura e comprimento.
		 System.out.println(r2.calcularArea());
		 
		 Retangulo r3 = new Retangulo(); //Sem args. Recebe 0 em todos.
		 System.out.println(r3.calcularArea());
		 
	}

}

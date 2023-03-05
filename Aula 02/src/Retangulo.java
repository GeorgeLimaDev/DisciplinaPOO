
public class Retangulo {
	//Variáveis internas da classe Retangulo:
	public int id;
	public double largura;
	public double comprimento;
	
	//Construtores (é possível ter vários que recebem diferentes números de argumentos):
	public Retangulo (int id, double largura, double comprimento) {
		//Atribui as variáveis internas como propriedades do objeto Retangulo:
		this.id = id;
		this.largura = largura;
		this.comprimento = comprimento;
	}
	public Retangulo () {} //Construtor vazio.
	
	public double calcularArea() {
		return largura * comprimento;
	}
}

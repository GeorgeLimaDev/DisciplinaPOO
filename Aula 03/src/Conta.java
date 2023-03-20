
public class Conta {
	//Encapsulamento através de atributos privados:
	private int numero;
	private int cpf;
	private double saldo;
	
	public Conta (int numero, int cpf) {
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = 0;
	}
	
	public void creditar(double valor) {
		saldo += valor;
	}
	
	public void debitar(double valor) {
		saldo -= valor;
	}
	
	//Método que recebe outro objeto como argumento:
	public void transferir(Conta destino, double valor) {
		this.debitar(valor);
		destino.creditar(valor);
	}
	
	public boolean estaVazia() {
		return getSaldo() == 0;
	}
	
	//Método capaz de gerar outro objeto (de forma similar a um construtor):
	public Conta clonar() {
		Conta novaConta = new Conta(this.numero, this.cpf);
		novaConta.creditar(this.saldo);
		return novaConta;
	}

	public int getNumero() {
		return numero;
	}

	public int getCpf() {
		return cpf;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//Método toString sobreescreve o retorno padrão que devolveria a posição de memória do objeto:
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", cpf=" + cpf + ", saldo=" + saldo + "]";
	}
	
}

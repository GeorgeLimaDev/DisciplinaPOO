
public class Aluno {
	public String aluno;
	public int nota1;
	public int nota2;
	
	//Sintaxe do construtor:
	public Aluno(String aluno, int nota1, int nota2) {
		this.aluno = aluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	//Sintaxe de método:
	public int getMedia() {
		return (nota1 + nota2) / 2;
	}
	
	public String getSituacao() {
		if (getMedia() >= 70) {
			return "Aprovado";
		}
		else if (getMedia() >= 40) {
			return "Prova final";
		}
		else return "Reprovado";
	}
	
}

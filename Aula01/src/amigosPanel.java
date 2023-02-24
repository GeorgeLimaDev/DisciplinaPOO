import javax.swing.JOptionPane;

public class amigosPanel {

	public static void main(String[] args) {
		//Utilizando caixas de diálogo ao invés de imprimir no console:
		String nome1 = JOptionPane.showInputDialog("Qual é o seu nome?");
		String nome2 = JOptionPane.showInputDialog(nome1 + " de quem você é amigo?");
		//Este método requer um argumento antes da string a ser exibida, podendo ser null:
		JOptionPane.showMessageDialog(null, nome1 + " e " + nome2 + " são amigos.");

	}

}

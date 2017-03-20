import javax.swing.JOptionPane;

public class Exercicio15 {

	public static void main(String[] args) {

		String[] clientes = new String[10];
		String[] email = new String[10];
		String[] telefone = new String[10];
		Integer op;
		op = Integer.parseInt(JOptionPane.showInputDialog("1- Novo cadastro\n" + "2- Mostar cadastrados"));
		if (op >= 3) {
			JOptionPane.showConfirmDialog(null, "Opição invalida");
		}
		switch (op) {
		case 1:
			cadastrar();
			break;
		case 2:
			mostrar();
			break;
		}
	}

	private static void mostrar() {

	}

	private static void cadastrar() {
		int i = 0;
		if (i > 9) {
			JOptionPane.showConfirmDialog(null, "Sem espaço de menoria");
		}else{
			cliente = JOptionPane.showInputDialog("Digite o nome;");
		}

	}

}
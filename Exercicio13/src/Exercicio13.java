import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("1- Pedir sua Pizza \n" + "2- Canselar sua Pizza \n"
				+ "3- Entrar em contato\n" + "4- fazer reclama��o \n" + "5- sair"));
		if (a == 1) {
			JOptionPane.showConfirmDialog(null, "Qual pizza voc� ir� querer?");
		} else if (a == 2) {
			JOptionPane.showConfirmDialog(null, "Quer canselar sua pizza?");
		} else if (a == 3) {
			JOptionPane.showConfirmDialog(null, "Para contato lige para: 3511-5465.");
		} else if (a == 4) {
			JOptionPane.showConfirmDialog(null, "Reclama��es entre no nosso saite.");
		} else if (a == 5) {
			JOptionPane.showConfirmDialog(null, "Voc� saiu do programa.");
		} else {
			JOptionPane.showConfirmDialog(null, "Comando n�o valido");
		}
	}
}
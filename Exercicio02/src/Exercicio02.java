import javax.swing.JOptionPane;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Integer n1;
		Integer n2;
		Integer mult;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("digite um outro numero"));
		mult = n1 * n2;
		JOptionPane.showMessageDialog(null, "O resultado da soma é de: " + mult);

	}
}

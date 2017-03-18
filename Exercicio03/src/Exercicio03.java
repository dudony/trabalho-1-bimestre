import javax.swing.JOptionPane;

public class Exercicio03 {
 
	public static void main(String[] args) {
		Integer n1;
		Integer total;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
		total = n1 * n1;
		JOptionPane.showMessageDialog(null, "o valor "+ n1 + " com o multiplo de 2 é de: " + total);

	}
}

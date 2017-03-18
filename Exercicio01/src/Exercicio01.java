import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		Integer n1;
		Integer n2;
		Integer soma;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("digite um outro numero"));
		soma = n1 + n2;
		JOptionPane.showMessageDialog(null, "O resultado da soma é de: " + soma);

	}
}
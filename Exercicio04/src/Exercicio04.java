import javax.swing.JOptionPane;

public class Exercicio04 {
	public static void main (String[] agrs){
		Double n1;
		n1 = Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));
		Integer r = (int)Math.pow(n1, n1);
		JOptionPane.showMessageDialog(null, "O seu resultado é de: " + r);
				
					
	}
}

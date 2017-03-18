import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main (String[]args){
		double a, b, c;
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de uns dos lados:"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de uns dos lados:"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de uns dos lados:"));
		if ((a<b+c) && (b<a+c) && (c<a+b)){
			JOptionPane.showConfirmDialog(null, "Sua figura é um triangulo");
		}else{
			JOptionPane.showConfirmDialog(null, "Sua figura não é um triangulo");
		}
	}
}

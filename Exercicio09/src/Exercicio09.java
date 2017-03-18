import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main (String[] args){
		
		double a, b, c;
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de um dos lados:"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do outo dos lados:"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de um dos lados:"));
		if (a==b && b==c){
			JOptionPane.showConfirmDialog(null, "Seu triangulo é equilatero");
		}else if(a==b || b==c){
			JOptionPane.showConfirmDialog(null, "Seu triangulo é isoseles");
		}else{
			JOptionPane.showConfirmDialog(null, "Seu triangulo é escaleno");
		}
	}
}

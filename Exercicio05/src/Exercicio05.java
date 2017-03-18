import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main (String[] args){
		double nota;
		nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua nota."));
		if(nota >= 7.0){
			JOptionPane.showConfirmDialog(null, "Você foi aprovado.");
		}else if(nota < 7.0 && nota > 4.0){
			JOptionPane.showConfirmDialog(null, "Você foco em exame.");
		}else{
			JOptionPane.showConfirmDialog(null, "Você foi reprovado.");
		}
	}
}

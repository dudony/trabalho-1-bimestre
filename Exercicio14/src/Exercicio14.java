import javax.swing.JOptionPane;

public class Exercicio14 {

	public static void main(String[]args){
		Integer a;
		a = Integer.parseInt(JOptionPane.showInputDialog("Ecolha uma operação\n"+
														 "1- Adição\n"+
														 "2- Subitração\n"+
														 "3- Divisão\n"+
														 "4- Multiplicação\n"+
														 "5- Fatorial\n"+
														 "6- Exponencial"));
		switch(a){
		case 1:
			double adicao, n1, n2;
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
			adicao = n1 + n2;
			JOptionPane.showConfirmDialog(null, "A valor da soma é de:  " + adicao);break;
		case 2:
			double subitracao, n3, n4;
			n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
			n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
			subitracao = n3 - n4;
			JOptionPane.showConfirmDialog(null, "A valor da soma é de:  " + subitracao);break;
		case 3:
			double divisao, n5, n6;
			n5 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
			n6 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
			divisao = n5 + n6;
			JOptionPane.showConfirmDialog(null, "A valor da soma é de:  " + divisao);break;
		case 4:
			double mult, n7, n8;
			n7 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
			n8 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
			mult = n7 + n8;
			JOptionPane.showConfirmDialog(null, "A valor da soma é de:  " + mult);break;
		case 5:
			Integer fat = 0, n9 ,n = 0, i;
			n9 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));       
			for (i = 1; i<= n; i++){
	              fat = fat * i;
			}
			JOptionPane.showConfirmDialog(null,"O valor do fatorial é de: "+ fat);break;
		case 6:
			Integer base, exp, valor;
			base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base:"));
			exp = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente:"));
			valor = base^exp;
			JOptionPane.showConfirmDialog(null, "O seu valor é de: " + valor);break;
		case 7:
			JOptionPane.showConfirmDialog(null, "Comando invalido");break;
		}
	}
}
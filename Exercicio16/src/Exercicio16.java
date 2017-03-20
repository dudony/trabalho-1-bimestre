import java.util.Arrays;

import javax.swing.JOptionPane;

public class Exercicio16 {

	public static void main(String[] args){
		
		String nome[] = new String[10];
		int i = 0;
		for (i = 0; i <10; i++){
			nome[i] = JOptionPane.showInputDialog("Insira um nome");
		}
		int op;
		op = Integer.parseInt(JOptionPane.showInputDialog("1- mostar nomes\n"+ "2- sair"));
		if(op == 1){
			JOptionPane.showConfirmDialog(null,"Nomes:\n" + Arrays.toString(nome));
		}else if(op ==2){
			JOptionPane.showConfirmDialog(null, "Você saiu do programa.");
		}else{
			JOptionPane.showConfirmDialog(null, "Conmando invalido");
		}
	}
}

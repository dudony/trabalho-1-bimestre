import java.util.Arrays;

import javax.swing.JOptionPane;

public class Exercio17 {

	public static void main(String[] args){
		
		int i;
		int quant;
		int[] valor = new int[quant];
		quant = Integer.parseInt(JOptionPane.showInputDialog("tamanha do arranjo")); 
		if(quant == 0){
			JOptionPane.showConfirmDialog(null, "tamanho não aceitavel");
		}else{
			for(i =1, i > quant , i++ ){
				valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
			}
		}
		JOptionPane.showConfirmDialog(null,  Arrays.toString(valor));
	}
}

import javax.swing.JOptionPane;

public class Exercicio24 {

	public static void main(String[]args){
	    String op;
	    op =  JOptionPane.showInputDialog("1- inserir mumeros\n" + "2- alterar numeros" + "3- sair");
	    
	switch (op) {
	case "1":
		inserir();
		break;
	case "2":
		auterar();
		break;
	case "3":
		JOptionPane.showConfirmDialog(null,"Voc� saiu do programa");
		break;
	default:
		JOptionPane.showConfirmDialog(null,"Opi��o invalida");
		break;
	}
	
	
	}    
	    private static void auterar() {
		
	}
		public static void inserir() {
			
	}
}
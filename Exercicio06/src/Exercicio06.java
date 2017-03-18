import javax.swing.JOptionPane;

public class Exercicio06 {
	public static void main(String[] args){
		String login;
		login = JOptionPane.showInputDialog("login:");
		
		JOptionPane.showConfirmDialog(null, senha(login));
		
	}
	
	public static boolean senha(String slogin){
		if(slogin.equals("adimin")){
			return true;
		}else{
			return false;
		}
	}
	
}

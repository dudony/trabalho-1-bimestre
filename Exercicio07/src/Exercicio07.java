import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args){
		String login;
		String senha;
		login = JOptionPane.showInputDialog("Login:");
		senha = JOptionPane.showInputDialog("Senha:");
				
		JOptionPane.showConfirmDialog(null, senha(login, senha));
		
	}
	
	public static String senha(String slogin, String ssenha){
		String sucesso = "Login efetuado com sucesso!";
		String erro = "Usuário e/ou senha incorretos.";
		
		if(slogin.equals("adimin") && ssenha.equals("adimin")){
			return sucesso;
		}else{
			return erro;
		}
	}
}

public class Exercicio20 {

	public static void main(String[]args){
		Integer[][] m = new Integer[10][10];
		int n;
		int i;
		int conta = 1;
		System.out.println("sorteando numeros");
		for(n = 0; n<10; n++){
			for(i = 0; i <10; i++){
				m[n][i] = conta;
				conta++;
				System.out.print(" " + m[n][i]);
			}System.out.println();
		}System.out.println();
	}
}
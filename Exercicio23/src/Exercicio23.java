public class Exercicio23 {

	public static void main(String[] argus) {

		int conta = 1;
		Integer[][] matriz = new Integer[3][3];
		System.out.println("matriz a \n");
		for (int i = 0; i < matriz.length; i++) {
			for (int x = 0; x < matriz.length; x++) {
				matriz[i][x] = conta;
				conta++;
				System.out.println( " " +matriz[i][x]);
			}System.out.println();
		}System.out.println();
		int[][] ig = new int[3][3];
		System.out.println("matriz b \n");
		for(int i = 0; i < ig.length; i++){
			for (int x = 0; x < ig.length; x++) {
			ig[i][x] = matriz[i][x];
			System.out.println(" " + ig[i][x]);	
			}System.out.println();
		}System.out.println();
	}
}

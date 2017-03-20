public class Exercicio21 {
	
	public static void main(String[] argus){
		
		int conta = 1;
		Integer[][][] matriz = new Integer[10][10][10];
		for(int i=0; i<matriz.length; i++){
			for(int x=0; x<matriz.length; x++){
				for(int n=0; n<matriz.length; n++){
					matriz[i][x][n] = conta ; 
					conta++;
					System.out.print(" " +matriz[i][x][n]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}

public class Exercicio18 {

	public static void main(String[] args){
		int conta = 1;
		Integer[][] matriz = new Integer[3][3];
		for(int i=0; i<matriz.length; i++){
			for(int x=0; x<matriz.length; x++){
					matriz[i][x] = conta ; 
					conta++;
					System.out.print(" " +matriz[i][x]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

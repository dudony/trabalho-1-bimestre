import java.util.Random;

public class Exercicio22 {

	public static void main(String[]args){
		int i = 0;
		int[] ig = new int[10];
		Random numeros = new Random();
		int[] t = new int[10];
		for(i = 0; i < t.length; i++){
			t[i] = numeros.nextInt();
			System.out.println("a["+i+"] = " + t[i] );			
		}
		for(i = 0; i < ig.length; i++){
			ig[i] = t[i];
			System.out.println("b["+i+"] = " + ig[i] );	
		}
	}	
}

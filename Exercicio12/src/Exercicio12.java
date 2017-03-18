import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] agrs) {
		Scanner valor = new Scanner(System.in);
		double[] v = new double[10];
		double s = 0;
		for (double i = 0; i < 10; i++) {
			System.out.println("digite um valor para sua soma:");
			v[(int) i] = valor.nextInt();
		}
		for (int a = 0; a < 10; a++) {
			s = s + v[a];
		}
		System.out.println("o resultado é de: " + s);
	}
}

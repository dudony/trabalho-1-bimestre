import java.util.Scanner;

import javax.swing.text.html.Option;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner conta = new Scanner(System.in);
		System.out.println("1 - Calcular área do Triângulo");
		System.out.println("2 - Calcular área do Quadrado");
		System.out.println("3 - Calcular área do Retângulo");
		System.out.println("4 - Calcular área do Circulo");
		System.out.println("5 - Calcular área do Trapézio);");

		int op = conta.nextInt();

		switch (op) {
		case 1:
			double triangulo, base, altura;
			System.out.println("valor da base:");
			base = conta.nextInt();
			System.out.println("valor da altura:");
			altura = conta.nextInt();
			triangulo = (base * altura) / 2;
			System.out.println("A área do triando é " + triangulo);
			break;
		case 2:
			double quadrado, baseq, alturaq;
			System.out.println("valor da base:");
			baseq = conta.nextInt();
			System.out.println("valor da altura:");
			alturaq = conta.nextInt();
			quadrado = baseq * alturaq;
			System.out.println("A área do duadrado é " + quadrado);
			break;
		case 3:
			double retangulo = 0, baser, alturar;
			System.out.println("valor da base:");
			baser = conta.nextInt();
			System.out.println("valor da altura:");
			alturar = conta.nextInt();
			quadrado = baser * alturar;
			System.out.println("A área do triando é " + retangulo);
			break;
		case 4:
			double circulo, raio;
			double pi = 3.1416;
			System.out.println("volor do raio");
			raio = conta.nextInt();
			circulo = pi * (raio * raio);
			System.out.println("A área do triando é " + circulo);
			break;
		case 5:
			double trapezio, basent, basemt, alturat;
			System.out.println("valor da base menor:");
			basent = conta.nextInt();
			System.out.println("valor ba base maior:");
			basemt = conta.nextInt();
			System.out.println("valor da altura:");
			alturat = conta.nextInt();
			trapezio = ((basent + basemt) / 2) * alturat;
			System.out.println("A área do triando é " + trapezio);
			break;
		default:
			System.out.println("opição não existe");
			break;
		}

	}
}

package List2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("-----CALCULADORA-----");
		System.out.println("ESCOLHA DOIS NUMEROS: ");
		System.out.print("N1: ");
		Double n1 = sc.nextDouble();
		System.out.print("N2: ");
		Double n2 = sc.nextDouble();
		System.out.println("QUAL OPERAÇÃO GOSTARIA DE REALIZAR ENTRE OS NÚMEROS? ");
		System.out.print("[+|-|*|/]: ");
		char opr = sc.next().charAt(0);
		switch (opr) {
		case '+':
			double soma =n1 +n2;
			System.out.println("SOMA: " + soma);
			break;
		case '-':
			double sub = n1 - n2;
			System.out.println("SUBTRAÇÃO: " + sub);
			break;
		case '*':
			double multi = n1*n2;
			System.out.println("MULITPLICAÇÃO: " + multi);
			break;
		case '/':
			double div = n1/n2;
			if (n1 == 0.0 || n2 == 0.0) {
				System.out.println("Impossivel dividir por zero!");
				break;
			}
			System.out.println("DIVISÃO: " + div);
			break;
		default:
			System.out.println("Sinal Inválido!");
		}

		sc.close();
	}
}

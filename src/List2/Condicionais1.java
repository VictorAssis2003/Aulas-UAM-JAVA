package List2;

import java.util.Scanner;

public class Condicionais1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int x = sc.nextInt();
		if(x >= 20 ) {
			System.out.println("A metade desse numero é: " + x/2);
		}
		else {
			System.out.println("A operação só sera realizada se o numero for maior que 20.");
		}

	}

}

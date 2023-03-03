package List2;

import java.util.Scanner;

public class Condicionais2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		
		int x = sc.nextInt();
		if (x >= 18) {
			System.out.println("Você é maior de idade");
		}
		else {
			int y = 18- x;
			System.out.println("Faltam " + y + " anos para voce alcançar a maioridade penal ");
		}
		
	}

}

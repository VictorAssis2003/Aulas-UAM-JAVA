package List2;

import java.util.Scanner;

public class KiloWatts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o salario minimo: ");
		double minWage = sc.nextDouble();
		double kWatt = minWage*0.002;
		System.out.println("Informe a quantidade de energia usada no mês: ");
		double quantity = sc.nextDouble();
		double price = quantity*kWatt;
		double priceDisc = price + price * 1.15;
		System.out.println("Preço do kwatt: " + kWatt);
		System.out.println("Preço normal: " + price);
		System.out.println("Preço com desconto: " + priceDisc);

		
		

	}

}

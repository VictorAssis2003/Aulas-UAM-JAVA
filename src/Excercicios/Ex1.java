package Excercicios;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		Integer x = sc.nextInt();

		System.out.println("O número inteiro digitado é: " + x);

		System.out.print("Digite um número real: ");
		Double y = sc.nextDouble();

		System.out.println("O número digitado é: " + y);

		System.out.println("Digite três numeros: 3");
		int[] list = new int[3];
		int sum = 0;

		for (Integer i : list) {
			list[i] = sc.nextInt();
			sum += list[i];
		}

		System.out.println("Total: " + sum);
		
		System.out.print("Digite uma string para convertela a unicode: ");
		String unicode = sc.next();
		byte arr[] = unicode.getBytes("UTF-8");
		for(byte letter : arr) {
			System.out.print(letter+"");
		}
	
		
		System.out.println("Conversor de celsius para farenheit");
		System.out.print("Insira a temp. em celsius: ");
		Double tempCelsius = sc.nextDouble();
		Double tempFaren = 0.0;
		tempFaren = (tempCelsius * (9/5))/3.6; 
		System.out.println("A temperatura em Farenheit é: " + tempFaren );
		
		System.out.println("Conversor de velocidade km/h para m/s.");
		System.out.print("Digite a velocidade: ");
		double velocidadeKm = sc.nextDouble();
		double velocidadeMm = 0.0;
		velocidadeMm = velocidadeKm/3.6;
		System.out.println("A velocidade em M/S é: " + velocidadeMm);
		
		
		System.out.print("Insira um numero inteiro e descubra o seu antecessor: ");
		int prodecessor = sc.nextInt();
		int antecessor = prodecessor - 1;
		System.out.println("O antecessor é: " + antecessor);
		
		System.out.print("Insira seu ano de nascimento: ");
		int ano = sc.nextInt();
		int idade = 2023 - ano;
		System.out.println("Sua idade é: " + idade);
		
		System.out.print("Para calular a area de uma circunferencia, insira o  seu raio: ");
		System.out.print("Raio: ");
		Double raio = sc.nextDouble();
		
		double circ = Math.PI*raio*raio;
		System.out.println("A circunferencia é: " + circ);
		
		
		
	}
	

}

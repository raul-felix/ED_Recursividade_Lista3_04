package view;

import java.util.Scanner;

import controller.BinarioController;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BinarioController binController = new BinarioController();
		int num;
		
		do {
			System.out.println("Digite um número inteiro de 0 a 2000:");
			num = sc.nextInt();
		}
		while (num < 0 || num > 2000);
		
		String resultado = binController.converteParaBinario(num, "");
		System.out.println(String.format("%d em binário é: %s", num, resultado));
	}
}

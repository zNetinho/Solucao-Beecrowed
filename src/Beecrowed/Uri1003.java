package Beecrowed;

import java.util.Scanner;

public class Uri1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2, soma;
		
		System.out.println("Digite um numero");
		numero1 = sc.nextInt();
		System.out.println("informe outro");
		numero2 = sc.nextInt();
		soma = numero1 + numero2;
		
		System.out.println("SOMA = " + soma + "\n");
	}
}

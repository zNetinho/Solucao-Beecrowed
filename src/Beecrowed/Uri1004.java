package Beecrowed;

import java.util.Scanner;

public class Uri1004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2, prod;
		
		System.out.println("Diga um numero");
		numero1 = sc.nextInt();
		System.out.println("informe outro");
		numero2 = sc.nextInt();
	
		prod = numero1*numero2;
		
		System.out.println("PROD = " + prod + "\n");
	}
}

package Beecrowed;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class calculeOCirculo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area,  n = 3.14159;
		float raio;
		NumberFormat formatar = new DecimalFormat("#.0000");     
		
		System.out.println("Informe o valor do raio: ");
		raio = sc.nextFloat();
		
//		area = Math.pow(raio, 2);
		area = (n * raio) * raio;
		

		System.out.println("A=" + formatar.format(area));
	}
}

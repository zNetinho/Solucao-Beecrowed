package Beecrowed;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Uri1005 {
	public static void main(String[] args) {
		NumberFormat formatar = new DecimalFormat("#.00000");
		float notaA, notaB, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a nota do aluno");
		notaA = sc.nextFloat();
		System.out.println("Informe a nota do aluno");
		notaB = sc.nextFloat();
		
		if (notaB >= 10 && notaA >= 10) {
			notaA = 10;
			notaB = 10;
			media = (notaA + notaB) / 2;
			System.out.println("MEDIA 1= " + formatar.format(media));
		}else if (notaA >= 10){
			notaA= 10;
			media = (notaA + notaB) /2;
			System.out.println("MEDIA 2= " + formatar.format(media));
		}else if (notaB >= 10){
			notaB= 10;
			media = (notaA + notaB) / 2;
			System.out.println("MEDIA 3= " + formatar.format(media));
		}else {
			media = (notaA + notaB) / 2;
			System.out.println("MEDIA 4= " + formatar.format(media));
		}
		
		
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {
	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++){
			System.out.print("Digite um numero: ");
			vetor [i] = sc.nextDouble();
		}
		System.out.println();
		System.out.println("VALORES: ");
		
		for(int i=0; i<n;i++) {
			System.out.printf(vetor[i]+"  ");
		}
		System.out.println();
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vetor[i];
		}
		System.out.printf("SOMA: %.2f%n",soma);
		double media = soma/n;
		
		System.out.printf("MÉDIA: %.2f%n",media);
	}	

}

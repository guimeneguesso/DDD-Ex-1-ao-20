package entrada_processamento_saida;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, area;
		
		System.out.printf("Digite a base do triangulo: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite a altura do triangulo: ");
		b = ler.nextDouble();
				
		area = a * b ; 
	
	if (area <= 100) {
		System.out.printf("A area do triangulo e: %.2f", area); }
	
	else {
		System.out.printf("Terreno grande"); }
	
	}
	}
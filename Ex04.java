package entrada_processamento_saida;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double a, b, c, d, media ;
		
		System.out.printf("Digite o valor do primeiro numero: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo numero: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro numero: ");
		c = ler.nextDouble();
		
		System.out.printf("Digite o valor do quarto numero: ");
		d = ler.nextDouble();
		
		media = (a + b + c + d)/ 4 ; 
		
		System.out.printf("A media aritimetica desses numeros e %.2f.", media);

	}

}
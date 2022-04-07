package entrada_processamento_saida;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double num1, num2, num3;
		System.out.printf("Digite o valor do primeiro lado: ");
		num1 = ler.nextDouble();
		
		System.out.printf("Digte o valor do segundo lado: ");
		num2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro lado: ");
		num3 = ler.nextDouble();
		
		if  (num1 != num2 && num1 != num3 && num2 !=num3) {
				System.out.println("Esse triangulo é escaleno.");} 
		else if( (num1 == num2) &&
					  (num2 != num3) ||
					  (num1 == num3) &&
					  (num3 != num2) || 
					  (num2 == num3) &&
					  (num3 != num1) ){
				System.out.println("Esse triangulo é isósceles.");
			} else{
				System.out.println("Esse triangulo é equilátero.");
			}
	
	}

}
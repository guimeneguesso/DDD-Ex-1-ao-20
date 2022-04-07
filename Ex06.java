package entrada_processamento_saida;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double cotacao, dol, reais ;
		
		System.out.printf("Digite o valor da cotacao do dolar atual: ");
		cotacao = ler.nextDouble();
		
		System.out.printf("Digite a quantidade de dolar que deseja converter para reais: ");
		dol = ler.nextDouble();
		
		reais = dol * cotacao ;
		
		System.out.printf("%.2f dolares equivale a %.2f reais.", dol, reais);

	}

}
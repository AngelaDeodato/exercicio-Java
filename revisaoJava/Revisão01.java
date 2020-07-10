import java.util.Scanner;
/*Elabore um programa que calcule o que deve ser pago por um produto, considerando
 o preço normal de etiqueta e a escolha da condição de pagamento.
 Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar
 o cálculo adequado. 
Código Condição de pagamento 
1 À vista em dinheiro ou cheque, recebe 20% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em três vezes, preço normal de etiqueta mais juros de 10%
*/
public class Revisão01 {

	public static void main(String[] args) {
		Scanner desconto = new Scanner(System.in); 
		double V1,V2=0;
		int I;
		System.out.println("Qual o valor da Compra? ");
		V1 = desconto.nextInt();
		
		System.out.println("Escolha uma opção:");
		System.out.println("\n1)À vista em dinheiro ou cheque: ");
		System.out.println("\n2)À vista no cartão de crédito: ");
		System.out.println("\n3) Em duas vezes:");
		System.out.println("\n4) Em três vezes:");
		I = desconto.nextInt();
		
		if(I == 1 ) {
			V2 = V1*0.80;
			System.out.printf("Parabens você ganhou um desconto na sua compra\n\nTotal a pagar: R$ %.2f", V2);
		}
		else if(I == 2) {
			V2 = V1*0.85;
			System.out.printf("Parabens você ganhou um desconto na sua compra\n\nTotal a pagar: R$ %.2f ", V2);
		}
		else if(I == 3) {
			System.out.printf("\nTotal a pagar: R$ %.2f ", V1);
		}
		else if(I == 4) {
			V2 = V1*1.10;
			System.out.printf("Compra com Juros\n\nTotal a pagar: R$ %.2f ", V2);
		}
		else {
			System.out.printf("Opção invalida!!");
		}
	}

}

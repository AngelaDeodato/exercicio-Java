import java.util.Scanner;
/*Elabore um programa que calcule o que deve ser pago por um produto, considerando
 o pre�o normal de etiqueta e a escolha da condi��o de pagamento.
 Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento escolhida e efetuar
 o c�lculo adequado. 
C�digo Condi��o de pagamento 
1 � vista em dinheiro ou cheque, recebe 20% de desconto 
2 � vista no cart�o de cr�dito, recebe 15% de desconto 
3 Em duas vezes, pre�o normal de etiqueta sem juros 
4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%
*/
public class Revis�o01 {

	public static void main(String[] args) {
		Scanner desconto = new Scanner(System.in); 
		double V1,V2=0;
		int I;
		System.out.println("Qual o valor da Compra? ");
		V1 = desconto.nextInt();
		
		System.out.println("Escolha uma op��o:");
		System.out.println("\n1)� vista em dinheiro ou cheque: ");
		System.out.println("\n2)� vista no cart�o de cr�dito: ");
		System.out.println("\n3) Em duas vezes:");
		System.out.println("\n4) Em tr�s vezes:");
		I = desconto.nextInt();
		
		if(I == 1 ) {
			V2 = V1*0.80;
			System.out.printf("Parabens voc� ganhou um desconto na sua compra\n\nTotal a pagar: R$ %.2f", V2);
		}
		else if(I == 2) {
			V2 = V1*0.85;
			System.out.printf("Parabens voc� ganhou um desconto na sua compra\n\nTotal a pagar: R$ %.2f ", V2);
		}
		else if(I == 3) {
			System.out.printf("\nTotal a pagar: R$ %.2f ", V1);
		}
		else if(I == 4) {
			V2 = V1*1.10;
			System.out.printf("Compra com Juros\n\nTotal a pagar: R$ %.2f ", V2);
		}
		else {
			System.out.printf("Op��o invalida!!");
		}
	}

}

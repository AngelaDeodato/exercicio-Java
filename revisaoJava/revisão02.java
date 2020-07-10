import java.util.Scanner;
/*O IMC – Índice de Massa Corporal é um critério da Organização Mundial 
de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta.
A fórmula é IMC = peso / ( altura )2 
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
IMC em adultos Condição 
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso
*/
public class revisão02 {

	public static void main(String[] args) {
		Scanner Imc = new Scanner(System.in); 
		float M,A,IMC;
		System.out.println("Massa (Kg): ");
		M = Imc.nextInt();
		System.out.println("Altura (A): ");
		A = Imc.nextFloat();
		IMC = M/(A*	A);
		if(IMC < 18.5) {
			System.out.println("Abaixo do Peso");
		}
		else if((IMC >= 18.5) && (IMC < 25)) {
			System.out.println("Peso Ideal");
		}
		else if((IMC >=25) && (IMC < 30)) {
			System.out.println("Sobrepeso");
		}
		else {
			System.out.println("Obeso");
		}
	}

}

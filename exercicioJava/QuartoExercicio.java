package ExerciciosJava;

import java.util.Scanner;

public class QuartoExercicio {
	public static void main(String args[]) {
		
		Scanner quatro = new Scanner(System.in);
		int a,b,c;
		double r, s, d;
		
		System.out.println("Digite o valor de A:");
		a = quatro.nextInt();
		System.out.println("Digite o valor de B:");
		b = quatro.nextInt();
		System.out.println("Digite o valor de C:");
		c = quatro.nextInt();
		r = Math.pow(a+b,2);
		s = Math.pow(b+c,2);
		d =(r+s)/2;
		
		System.out.printf("O valor de D foi: "+d);
	}
}

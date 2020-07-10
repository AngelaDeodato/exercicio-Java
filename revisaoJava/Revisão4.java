import java.util.Scanner;
/*Faça um programa em JAVA que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50*/
public class Revisão4 {

	public static void main(String[] args) {
		Scanner Rs4 = new Scanner(System.in);
		 float soma=0;
		 float D=0, Num=0, Res;
		 int I;
		 for(I=1;I<=50; I++) {
			 Num = I*2 -1;
			 D = I;
			 Res = Num/D;
			 soma = soma+Res;
		 }
		 System.out.println("Asoma dos valores é: "+soma);
	}
}

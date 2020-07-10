import java.util.Scanner;
/*Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código inteiro.
 *  Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2
 *  mostre o vetor na ordem inversa.
 *  Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.*/
public class revisão05 {

	public static void main(String[] args) {
		Scanner Rs5 = new Scanner(System.in);
		int Num[]=new int [5];
		int codigo, i;
		
		for(i=0; i<Num.length;i++) {
			System.out.println("Informe o "+i+"º numero: ");
			Num[i] = Rs5.nextInt();
		}
        
        System.out.println("1--> Ordem indireta.");
        System.out.println("2-–> Ordem direta.");
        System.out.println("0–-> Finalizar programa.");
        codigo = Rs5.nextInt();	
        if(codigo == 0) {
        	System.out.println("Você Finalizou o programa.");
        }
        else if(codigo == 1) {
        	for (i= Num.length - 1; i > -1; i--) {
        		System.out.println("Números : "+Num[i]);
        	}
        }
        else if(codigo == 2) {
        	for (i=0; i<Num.length; i++) {
    		System.out.println("Números :"+Num[i]);
        	}
        }
        else {
        	System.out.println("Código invalido !!");
        		}
          }
	}




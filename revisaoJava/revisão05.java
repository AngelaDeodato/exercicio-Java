import java.util.Scanner;
/*Fa�a um programa que leia um vetor de 5 posi��es para n�meros reais e, depois, um c�digo inteiro.
 *  Se o c�digo for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2
 *  mostre o vetor na ordem inversa.
 *  Caso, o c�digo for diferente de 1 e 2, escreva uma mensagem informando que o c�digo inv�lido.*/
public class revis�o05 {

	public static void main(String[] args) {
		Scanner Rs5 = new Scanner(System.in);
		int Num[]=new int [5];
		int codigo, i;
		
		for(i=0; i<Num.length;i++) {
			System.out.println("Informe o "+i+"� numero: ");
			Num[i] = Rs5.nextInt();
		}
        
        System.out.println("1--> Ordem indireta.");
        System.out.println("2-�> Ordem direta.");
        System.out.println("0�-> Finalizar programa.");
        codigo = Rs5.nextInt();	
        if(codigo == 0) {
        	System.out.println("Voc� Finalizou o programa.");
        }
        else if(codigo == 1) {
        	for (i= Num.length - 1; i > -1; i--) {
        		System.out.println("N�meros : "+Num[i]);
        	}
        }
        else if(codigo == 2) {
        	for (i=0; i<Num.length; i++) {
    		System.out.println("N�meros :"+Num[i]);
        	}
        }
        else {
        	System.out.println("C�digo invalido !!");
        		}
          }
	}




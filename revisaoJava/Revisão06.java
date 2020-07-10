import java.util.Scanner;

public class Revisão06 {

	public static void main(String[] args) {
		Scanner Rs7= new Scanner(System.in); 
		int i,j=0;
		int[] R6 = new int [3];int [][] Mr6 = new int [3][3];
		
		System.out.printf("Informe os elementos do vetor:");
		for(i=0;i<3;i++) {
			System.out.printf("\nElemento[%d]",i);
			R6[i]= Rs7.nextInt();
		}
		System.out.printf("Informe os elementos da matrix: ");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++){
				System.out.printf("\nElemento[%d][%d]",i,j);
				Mr6[i][j]=Rs7.nextInt();
			}
		}
		System.out.printf("Valores do Vetor: ");
		for(i=0;i<3;i++) {
			System.out.printf("\nElemento[%d] ",i);
		}
		System.out.printf("\nValores  da Matriz: ");	
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.printf("\n%d",Mr6[i][j]);
			}
		}
		//multiplica vetor pelas colunas da matriz
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				Mr6[i][j] = R6[i] * Mr6[i][j];
			}
		}
		System.out.printf("\nValores Multiplicados: \n");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.printf("\n%d ",Mr6[i][j]);
			}
		}
	}
}




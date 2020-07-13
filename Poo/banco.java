/*Crie uma classe conta bancaria e apresente os atributos e
  métodos referentes esta classe, em seguida crie um objeto conta bancaria,
 defina as instancias deste objeto e 
 apresente as informações deste objeto no console.*/

public class banco {
	
	String nome;
	int nasc;
	String Tc;
	int cpf;
	double saldo;
	 
	void bancoo () {
		System.out.println("Cliente: "+nome+", nascida no ano de "+nasc);
		System.out.println("Portadora do CPF  final xxx.xxx.xxx -"+cpf);
		System.out.println("Possui uma "+Tc+" em nossa agência bancária.");
		System.out.println("Saldo de "+saldo);
		
	}
	public static void main(String[] args) {
		banco Pf = new banco();
		Pf.nome = "Maria Aparecida";
		Pf.Tc = "Conta Corrente ";
		Pf.cpf = 23;
		Pf.saldo = 1200.00;
		Pf.nasc = 1889;
		
		Pf.bancoo();
	}
}

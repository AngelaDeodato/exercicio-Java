/* Crie uma classe funcion�rio e apresente os atributos e
 *  m�todos referentes esta classe, em seguida crie um objeto
 *   funcion�rio, defina as instancias deste objeto 
 * e apresente as informa��es deste objeto no console.*/
public class funcionario {
	String nome;
	String cargo;
	String setor;
	double salario;
	int codigo;
	void func() 
	{
		System.out.println("\n"+nome);
		System.out.println("Atua no cargo de "+cargo);
		System.out.println("No setor de "+setor);
		System.out.println("Codigo do funcionario: "+codigo);
		System.out.println("Salario: "+salario);
	}
	
   public static void main(String[] args) {
	   
	funcionario pessoa1 = new funcionario();
	 pessoa1.nome = "Maria da concei��o ";
	 pessoa1.cargo = "Aux ADM";
	 pessoa1.setor = "RH";
	 pessoa1.codigo = 1445;
	 pessoa1.salario = 1344.00;
	 pessoa1.func();
	 
	 
		
	
}
}
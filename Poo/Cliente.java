/*1) Crie uma classe cliente e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto cliente,
 *  defina as instancias deste objeto e apresente as informações 
 *  deste objeto no console.
*/

public class Cliente {
	String nome;
	String endereco;
	String sexo;
	int idade;
	String Produto;
	void OclienteFaz() {
	System.out.println("O cliente "+nome+" comprou um "+Produto);
	}

	
public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Roberto Menezes";
		cliente1.endereco = "Rua dos bobos";
		cliente1.sexo = "Masculino";
		cliente1.idade = 45;
		cliente1.Produto = "perfume";
		
		System.out.println(cliente1.nome);
		System.out.println("Mora no endereco "+cliente1.endereco);
		System.out.println(cliente1.idade+" anos");
		cliente1.OclienteFaz();

	}
	
	
}

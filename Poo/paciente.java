/*Crie uma classe paciente e apresente os atributos e métodos referentes esta classe,
 em seguida crie um objeto paciente, defina as instancias deste objeto e
 apresente as informações deste objeto no console.
*/
public class paciente {

		String nome;
		String doutor;
		String ordem;
		int prot;
		int idade;
		void pac() {
			System.out.println("Paciente: "+nome);
			System.out.println("Acompanhada pelo(a)  doutor(a): "+doutor);
			System.out.println("Atendimento: "+ordem);
			System.out.println("Protocolo de Atendimento: "+prot);
			System.out.println("\n");
		}
		
		public static void main(String[] args) {
			
			paciente paciente1 = new paciente();
			
			paciente1.nome =  "Beatriz Souza";
			paciente1.idade = 12;
			paciente1.ordem = "Pediatria";
			paciente1.doutor = "Ana Bruna";
			paciente1.prot = 202723833;
			paciente1.pac();
			
			paciente paciente2 = new paciente();
			paciente2.nome =  "Murilo Gomes";
			paciente2.idade = 33;
			paciente2.ordem = "Ortopedia";
			paciente2.doutor = "Luiz Carvalho";
			paciente2.prot = 2012323833;
			paciente2.pac();
		}

		
}

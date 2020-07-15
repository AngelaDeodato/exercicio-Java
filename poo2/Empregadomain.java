package Exer001;

public class Empregadomain {
	public static void main(String args[]) {
		
		Empregado pessoa1 = new Empregado ();
		 pessoa1.setNome("pessoa1");
		 pessoa1.setEndereco("Rua 234");
		 pessoa1.setTelefone("233341342");
		 pessoa1.setCodigoSetor(5554);
		 pessoa1.setSalarioBase(666676);
		 pessoa1.setImposto(15);
		 
		 System.out.println(pessoa1.getNome());
		 System.out.println(pessoa1.getTelefone());
		 System.out.println(pessoa1.getCodigoSetor());
		}
}


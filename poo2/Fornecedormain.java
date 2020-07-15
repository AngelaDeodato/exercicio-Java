package Exer001;

public class Fornecedormain {

	public static void main(String[] args) {
		
		fornecedor Leticia = new fornecedor();
		Leticia.setNome("Nome: Letica");
		Leticia.setEndereco("Rua dos bobos");
		Leticia.setTelefone("656666645");
		Leticia.setValorCredito (500);
		Leticia.setValorDivida (100);

		
		 System.out.println(Leticia.getNome());
		 System.out.println(Leticia.getEndereco());
		 System.out.println(Leticia.getTelefone());
		 System.out.println(Leticia.obterSaldo());
		

	}

}

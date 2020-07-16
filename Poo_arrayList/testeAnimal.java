package Expoo2;

public class testeAnimal  {

	public static void main(String[] args) {
		Cachorro cocada = new Cachorro();
		Cavalo petunia = new Cavalo();
		Preguiça mila = new Preguiça();
		
		cocada.setNome("Cocada");
		System.out.println(cocada.getNome());
		cocada.setIdade(2);
		System.out.println(cocada.getIdade());
		cocada.emitirSom();
		cocada.Correr();
		System.out.println("========================");
		
		petunia.setNome("petunia");
		System.out.println(petunia.getNome());
		petunia.setIdade(25);
		System.out.println(petunia.getIdade());
		petunia.emitirSom();
		petunia.Correr();
		System.out.println("=========================");
		
		
		mila.setNome("Mila");
		System.out.println(mila.getNome());
		mila.setIdade(55);
		System.out.println(mila.getIdade());
		mila.emitirSom();
		mila.Correr();
		System.out.println("==========================");
	}

}

/*Crie uma classe produto eletr�nico e apresente os atributos e 
 * m�todos referentes esta classe, em seguida crie um objeto produto eletr�nico, 
 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/
public class eletronico {
	
	String celular;
	String marca;
	String modelo;
	String cor;
	String bateria;
	int memoria;
	int Gb;
	int ano;
	void Ocelulartem() {
		System.out.println(celular+" de "+Gb+" de memoria.\n"+cor+" de alta resolu��o.");
		System.out.println(modelo+" "+ano+".\n\n");
	}
	
	public static void main(String[] args) {
		
		eletronico celular1 = new eletronico();
		
		
		celular1.celular = "Iphone";
		celular1.Gb = 128;
		celular1.ano = 2020;
		celular1.cor = "Ros�";
		celular1.modelo = "X11";
		celular1.Ocelulartem();
	}
	
}


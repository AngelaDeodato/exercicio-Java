/*Crie uma classe produto eletrônico e apresente os atributos e 
 * métodos referentes esta classe, em seguida crie um objeto produto eletrônico, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.*/
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
		System.out.println(celular+" de "+Gb+" de memoria.\n"+cor+" de alta resolução.");
		System.out.println(modelo+" "+ano+".\n\n");
	}
	
	public static void main(String[] args) {
		
		eletronico celular1 = new eletronico();
		
		
		celular1.celular = "Iphone";
		celular1.Gb = 128;
		celular1.ano = 2020;
		celular1.cor = "Rosê";
		celular1.modelo = "X11";
		celular1.Ocelulartem();
	}
	
}


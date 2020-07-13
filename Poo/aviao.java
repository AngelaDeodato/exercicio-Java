/* Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações 
 * deste objeto no console.
*/
public class aviao {
	
	String marca;
	String modelo;
	String aeroport;
	int QtdPass;
	String voo;
	void oAviaovai() 
	{
	System.out.println("O aviao da "+marca+" vai decolar as 13:00.");
	System.out.println("Aeronave com destino a "+voo+".");
	System.out.println("O aviao da "+marca+" tem capacidade para "+QtdPass+" de passageiros.");
	System.out.println("Aeronave do modelo "+modelo+".");
	}
	
	public static void main(String[] args) 
	{
		aviao aviao1 =  new aviao();
		aviao1.marca = "Latam";
		aviao1.modelo =  "Airbus A380";
		aviao1.QtdPass = 336;
		aviao1.aeroport = "Guarulhos";
		aviao1.voo = "Penambuco";
		aviao1.oAviaovai();
	}

}

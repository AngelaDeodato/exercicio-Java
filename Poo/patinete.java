
public class patinete {
	String marca;
	String tipo;
	String cor;
	void pat() {
		System.out.println("Patinete "+marca);
		System.out.println("Modelo "+tipo);
		System.out.println("Cor "+cor);
	}
	
	public static void main(String[] args) {
		patinete pat1 = new patinete();
		
		pat1.marca = "Xiaomi";
		pat1.tipo = "Eletrico";
		pat1.cor = "Branco";
		pat1.pat();
		
	}
}

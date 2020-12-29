package clases;

public class Auto extends Vehiculo {
	// Atributos
	private int puertas;

	// Constructor
	public Auto(String marca, String modelo, double precio, int puertas) {
		super(marca, modelo, precio);
		setPuertas(puertas);
	}

	// Métodos
	@Override
	public void mostrar() {
		System.out.println("Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Puertas: "
				+ this.puertas + " // Precio: $" + this.getPrecio());

	}

	private void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getPuertas() {
		return this.puertas;
	}
}

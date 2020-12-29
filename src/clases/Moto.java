package clases;

public class Moto extends Vehiculo {
	// Atributos
	private String cilindrada;

	// Constructor
	public Moto(String marca, String modelo, double precio, String cilindrada) {
		super(marca, modelo, precio);
		setCilindrada(cilindrada);
	}

	// Métodos
	@Override
	public void mostrar() {
		System.out.println("Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Cilindrada: "
				+ this.cilindrada + "cc // Precio: $" + this.getPrecio());

	}

	private void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return this.cilindrada;
	}

}

package clases;

public abstract class Vehiculo implements Mostrable, Comparable<Vehiculo> {
	// Atributos
	private String marca;
	private String modelo;
	private double precio;

	// Constructor
	public Vehiculo(String marca, String modelo, double precio) {
		setMarca(marca);
		setModelo(modelo);
		setPrecio(precio);
	}

	// Métodos
	public int compareTo(Vehiculo veh) {
		return (int) (veh.precio - this.precio);
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	protected String getMarca() {
		return marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return marca + " " + modelo;
	}

}

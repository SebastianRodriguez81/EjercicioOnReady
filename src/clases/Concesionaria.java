package clases;

import java.util.ArrayList;
import java.util.Collections;

public class Concesionaria {
	// Atributos
	private String nombre;
	private ArrayList<Vehiculo> vehiculos;

	// Constructor
	public Concesionaria(String nombre) {
		setNombre(nombre);
		this.vehiculos = new ArrayList<>();
	}

	// Métodos
	public void agregarVehiculos() {
		Vehiculo veh1 = new Auto("Peugeot", "206", 200000, 4);
		Vehiculo veh2 = new Moto("Honda", "Titan", 60000, "125");
		Vehiculo veh3 = new Auto("Peugeot", "208", 250000, 5);
		Vehiculo veh4 = new Moto("Yamaha", "YBR", 80500.50, "160");
		vehiculos.add(veh1);
		vehiculos.add(veh2);
		vehiculos.add(veh3);
		vehiculos.add(veh4);
	}

	public void mostrarVehiculosPorLetra(String expresion) {
		for (Vehiculo veh : this.vehiculos) {
			if (veh.getModelo().contains(expresion)) {
				System.out.println("Vehículo que contiene en el modelo la letra '" + expresion + "': " + veh.toString()
						+ " $" + veh.getPrecio());
			}
		}
	}

	public void ordenarVehiculosPorPrecio() {
		Collections.sort(this.vehiculos);
	}

	public void mostrarVehiculosPorPrecio() {
		System.out.println("Vehiculos ordenados por precio de mayor a menor:");
		// ordenamos la colección
		this.ordenarVehiculosPorPrecio();
		// la mostramos
		for (Vehiculo veh : this.vehiculos) {
			System.out.println(veh.toString());
		}
	}

	public void mostrarMaxPrecio() {
		System.out.println("Vehículo más caro: " + this.vehiculos.get(0).toString());
	}

	public void mostrarMinPrecio() {
		int ultimo = this.vehiculos.size() - 1;
		System.out.println("Vehículo más barato: " + this.vehiculos.get(ultimo).toString());
	}

	public void mostrarVehiculos() {
		for (Vehiculo veh : this.vehiculos) {
			veh.mostrar();
		}
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

}

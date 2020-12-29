package test;

import clases.*;

public class Test {

	public static void main(String[] args) {
		// instanciamos la Concesionaria
		Concesionaria concesionaria = new Concesionaria("OnReady Motors");

		// agregamos los vehículos
		concesionaria.agregarVehiculos();

		// mostramos los vehículos agregados
		concesionaria.mostrarVehiculos();
		System.out.println("=====================");

		// ordenamos la lista por precio
		concesionaria.ordenarVehiculosPorPrecio();

		// mostramos Vehículo más caro
		concesionaria.mostrarMaxPrecio();

		// mostramos Vehículo más barato
		concesionaria.mostrarMinPrecio();

		// mostramos resultado búsqueda por letra o expresión
		concesionaria.mostrarVehiculosPorLetra("Y");
		System.out.println("=====================");

		// mostramos vehiculos ordenados por precio
		concesionaria.mostrarVehiculosPorPrecio();

	}

}

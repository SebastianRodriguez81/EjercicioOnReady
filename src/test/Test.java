package test;

import clases.*;

public class Test {

	public static void main(String[] args) {
		// instanciamos la Concesionaria
		Concesionaria concesionaria = new Concesionaria("OnReady Motors");

		// agregamos los veh�culos
		concesionaria.agregarVehiculos();

		// mostramos los veh�culos agregados
		concesionaria.mostrarVehiculos();
		System.out.println("=====================");

		// ordenamos la lista por precio
		concesionaria.ordenarVehiculosPorPrecio();

		// mostramos Veh�culo m�s caro
		concesionaria.mostrarMaxPrecio();

		// mostramos Veh�culo m�s barato
		concesionaria.mostrarMinPrecio();

		// mostramos resultado b�squeda por letra o expresi�n
		concesionaria.mostrarVehiculosPorLetra("Y");
		System.out.println("=====================");

		// mostramos vehiculos ordenados por precio
		concesionaria.mostrarVehiculosPorPrecio();

	}

}

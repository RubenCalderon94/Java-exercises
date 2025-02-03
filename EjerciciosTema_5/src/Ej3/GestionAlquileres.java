package Ej3;

import java.time.LocalDate;

public class GestionAlquileres {
	private VehiculoAlquilado [] alquilados = new VehiculoAlquilado[7];

	public GestionAlquileres() {
		alquilados[0] = new VehiculoAlquilado(new Cliente(1, "Ana" ,"Robles Paz"), 
				new Vehiculo("1200-BMC", "Seat", "Ibiza",20, true),
				LocalDate.now(), 5);
		alquilados[1] = new VehiculoAlquilado(new Cliente(2, "Luis" ,"Santo Paz"), 
				new Vehiculo("1111-BMC", "Renault", "Clio",25, true),
				LocalDate.now(), 1);
		alquilados[2] = new VehiculoAlquilado(new Cliente(3, "Gema" ,"D�az Paz"), 
				new Vehiculo("1233-BMC", "Seat", "Ibiza",20, true),
				LocalDate.now(), 9);
		alquilados[3] = new VehiculoAlquilado(new Cliente(4, "Tom�s" ,"Sanz Eno"), 
				new Vehiculo("1290-BMC", "Volvo", "XC90", 120, true),
				LocalDate.now(), 11);
		alquilados[4] = new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"), 
				new Vehiculo("9090-BMC", "Volkswagen", "Golf", 34, true),
				LocalDate.now(), 10);
		alquilados[5] = new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"), 
				new Vehiculo("9091-BMC", "Volkswagen", "Passat", 54, true),
				LocalDate.of(2021, 1, 14), 10);
		alquilados[6] = new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"), 
				new Vehiculo("1200-BMC", "Seat", "Ibiza",20, true),
				LocalDate.of(2021, 01, 1), 10);
	}
	
	public Cliente getClienteAlquiler(String matricula) {
		// Recorremos la lista de vehículos alquilados (suponiendo que la tienes)
		for (VehiculoAlquilado a : alquilados) {
			// Si la matrícula del vehículo coincide con la pasada como parámetro
			if (a.getVehiculo().getMatricula().equals(matricula)) {
				// Retornamos el cliente asociado con ese vehículo alquilado
				return a.getCliente();
			}
		}
		// Si no se encuentra el vehículo con esa matrícula, retornamos null
		return null;
	}
	
	public int contarAlquileresCliente(int idCliente) {
		int count = 0;
		for (VehiculoAlquilado a : alquilados) {
			// Verificar si el cliente tiene el ID proporcionado
			if (a.getCliente().getId() == idCliente) {
				count++;
			}
		}
		return count;
		
	}
	
	public double sumaImporteTodosAlquileres() {
		double total = 0.0;
		for (VehiculoAlquilado a : alquilados) {
			total += a.getImporteTotal(); // Asumiendo que hay un método getImporteTotal en VehiculoAlquilado
		}
		return total;
	}
	
	
	public void mostrarAlquileresMatricula(String matricula) {
		boolean encontrado = false;
		for (VehiculoAlquilado a : alquilados) {
			if (a.getVehiculo().getMatricula().equals(matricula)) {
				System.out.println(a); // Mostramos el alquiler (esto invoca el toString() de VehiculoAlquilado)
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No se encontraron alquileres para la matrícula: " + matricula);
		}
	}
	
}

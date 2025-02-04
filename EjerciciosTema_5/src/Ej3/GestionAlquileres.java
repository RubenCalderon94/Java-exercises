package Ej3;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionAlquileres {
	private ArrayList<VehiculoAlquilado> listaAlquilados = new ArrayList<>();

	public GestionAlquileres() {
		listaAlquilados.add( new VehiculoAlquilado(new Cliente(1, "Ana" ,"Robles Paz"),
				new Vehiculo("1200-BMC", "Seat", "Ibiza",20, true),
				LocalDate.now(), 5));
		listaAlquilados.add(new VehiculoAlquilado(new Cliente(2, "Luis" ,"Santo Paz"),
				new Vehiculo("1111-BMC", "Renault", "Clio",25, true),
				LocalDate.now(), 1));
		listaAlquilados.add(new VehiculoAlquilado(new Cliente(3, "Gema" ,"D�az Paz"),
				new Vehiculo("1233-BMC", "Seat", "Ibiza",20, true),
				LocalDate.now(), 9));
		listaAlquilados.add(new VehiculoAlquilado(new Cliente(4, "Tom�s" ,"Sanz Eno"),
				new Vehiculo("1290-BMC", "Volvo", "XC90", 120, true),
				LocalDate.now(), 11));
		listaAlquilados.add(new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"),
				new Vehiculo("9090-BMC", "Volkswagen", "Golf", 34, true),
				LocalDate.now(), 10));
		listaAlquilados.add(new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"),
				new Vehiculo("9091-BMC", "Volkswagen", "Passat", 54, true),
				LocalDate.of(2021, 1, 14), 10));
		listaAlquilados.add(new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"),
				new Vehiculo("1200-BMC", "Seat", "Ibiza",20, true),
				LocalDate.of(2021, 01, 1), 10));
	}

	public Cliente getClienteAlquiler(String matricula) {
		for(VehiculoAlquilado v : listaAlquilados) {
			if(v.getVehiculo().getMatricula().equals(matricula)) {
				return v.getCliente();
			}
		}
		return null;
	}

	public int contarAlquileresCliente(int idCliente) {
		int contador = 0;
		for(VehiculoAlquilado v : listaAlquilados) {
			if(v.getCliente().getId() == idCliente) {
				contador++;
			}
		}
		return contador;
	}

	public double sumaImporteTodosAlquileres() {
		double total = 0;
		for(VehiculoAlquilado v : listaAlquilados) {
			total += v.getImporteAlquiler();
		}
		return total;
	}

	public void mostrarAlquileresMatricula(String matricula) {
		for(VehiculoAlquilado v : listaAlquilados) {
			if(v.getVehiculo().getMatricula().equals(matricula)) {
				System.out.println(v);
			}
		}
	}

}

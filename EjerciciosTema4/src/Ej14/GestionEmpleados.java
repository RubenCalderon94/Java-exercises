package Ej14;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GestionEmpleados {
    private ArrayList<Empleado> listaEmpleados;

    public GestionEmpleados() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/tema4/ejercicio14/empleados.csv"),
                    StandardCharsets.UTF_8);
            for (String string : lines) {
                listaEmpleados.add(new Empleado(string));
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Empleado buscarEmpleadoPorId(String id) {

        for (Empleado e : listaEmpleados) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    public void empleadosCorreos(String c) {
        for (Empleado e : listaEmpleados) {
            if (e.getCorreo().contains(c)) { //CON contains VA A COMPARAR SI GETCORREO ES IGUAL A C
                System.out.println(e);
            }
        }
    }

    public void filtrarPorSalario(int min, int max) {
        for (Empleado e : listaEmpleados) {
            //if(e.getSalario().compareTo(min) == 1 && e.getSalario().compareTo(max) == -1){
            if (e.getSalario().intValue() >= min && e.getSalario().intValue() <= max) {
                //.intValue(): Convierte el valor de Salario (que parece ser un objeto Integer) a un tipo int
                // para hacer comparaciones numéricas.
                //La condición se asegura de que el salario del empleado esté dentro del rango [min, max] (inclusive):
                //El salario del empleado debe ser mayor o igual al salario mínimo (e.getSalario().intValue() >= min).
                //El salario del empleado debe ser menor o igual al salario máximo (e.getSalario().intValue() <= max).
                System.out.println(e.getId() + ", " + e.getNombre() + ", " + e.getApellido() + ", " + e.getSalario());
            }
        }
    }

    public boolean actualizaSalario(String id, BigDecimal salario) {
        Empleado e = buscarEmpleadoPorId(id);
        if (e != null) {
            e.setSalario(salario);
            return true;
        }
        return false;
    }

    public void nacidosEn(int anio) {
        for (Empleado e : listaEmpleados) {
            if (e.getFechaNac().getYear() == anio) {
                System.out.println(e);
            }
        }
    }

    public void nacidosEn(int anio, int mes) {
        for (Empleado e : listaEmpleados) {
            if (e.getFechaNac().getYear() == anio && e.getFechaNac().getMonthValue() == mes) {
                System.out.println(e);
            }
        }
    }

}
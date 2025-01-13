package Ej2;

/*. Diseña una clase llamada Empleado con las características que se citan a
continuación. Prueba sus métodos.
a. Atributos. id, nombre, apellidos, salario mensual.
b. Métodos: constructor, getters y setters.
c. Añade los métodos:
i. getNombreCompleto. Devuelve el nombre del empleado con la
forma: Apellidos, Nombre.
ii. getSalarioAnual. Este se obtiene multiplicando por doce el
salario mensual.
iii. incrementaSalario (int porcentaje). Incrementa el salario en el
porcentaje indicado.
iv. toString.
d. Crea dos empleados y prueba los métodos programados, incrementa
su salario y obtén el salario anual.*/

public class Empleado {

    //ATRIBUTOS
    private int id;
    private String nombre;
    private String apellidos;
    private float salarioMensual;

    //CONTRUCTORES

    public Empleado(int id, String nombre, String apellidos, float SalarioMensual) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioMensual = SalarioMensual;

    }


    //GETTER Y SETTER
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public float getSalarioMensual() {
        return salarioMensual;
    }
    public void setSalarioMensual(float salarioMensual) {
        salarioMensual = salarioMensual;
    }

    //METODOS
    public String getNombreCompleto() {
        return this.apellidos + " " + this.nombre;
    }

    public float getSalarioAnual() {
        return this.salarioMensual *12;
    }

    public void incrementaSalario(int porcentaje) {
        this.salarioMensual = this.salarioMensual * (1 + ((float) porcentaje / 100));
    }

        @Override
    public String toString() {
        return "Id: " + this.id +
                " Nombre: "+ this.nombre +
                " Apellidos: " + this.apellidos +
                " SalarioMes: " + this.salarioMensual;


    }




}

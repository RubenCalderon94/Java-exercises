package Ej3;

/*
Diseña un programa Java que guarde información sobre los taxis de una compañía.
De cada taxi debe guardarse la matrícula, distrito en el que opera (sur, norte, oeste…),
tipo motor (diesel o gasolina) y coordenadas (latitud y longitud por separado) en las
que se ubica. Crea la clase necesaria y añade métodos get/set, dos constructores
(uno con todos los atributos y otro sin coordenadas, poner a 0). Diseña otro método
que servirá para comprobar si dos taxis operan en el mismo distrito devolviendo true
o false. Este método recibirá un taxi como parámetro. Añade un nuevo método que
devuelva un String con las coordenadas en conjunto. Crea dos objetos Taxi y prueba
sus métodos.
*/

public class Taxi {

    //ATRIBUTOS

    private String matricula;
    private Distritos distritos; //Tenemos un ENUM
    private TipoMotor tipoMotor; //Tenemos un ENUM
    private double latitud;
    private double longitud;
    //private double[]coordenadas= new double[2];//ejemplo de como guardar mas de una variable



    //CONTRUCTORES

    public Taxi(String matricula, Distritos distritos, TipoMotor tipoMotor) {
        this.matricula = matricula;
        this.distritos = distritos;
        this.tipoMotor = tipoMotor;
        this.latitud = 0;// Para inicializarlo en 0 , arriba en public taxi, no ponemos double lalitud
        this.longitud = 0;// Para inicializarlo en 0 , arriba en public taxi, no ponemos double longuitud

    }

    public Taxi(String matricula, Distritos distritos, TipoMotor tipoMotor, double latitud, double longitud) {
        this.matricula = matricula;
        this.distritos = distritos;
        this.tipoMotor = tipoMotor;
        this.latitud = latitud;
        this.longitud = longitud;


    }


    public Taxi(String matricula, double latitud, double longitud) {
        this.matricula = matricula;
        this.distritos = Distritos.SUR;//Para rellenar ya con la clase ENUM, no ponemos arriba en la clase taxi, Distrito distrito
        this.tipoMotor = TipoMotor.DIESEL;//Para rellenar ya con la clase ENUM, no ponemos arriba en la clase taxi, Distrito distrito
        this.latitud = latitud;
        this.longitud = longitud;
    }

    //GETTER Y SETTER

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Distritos getDistritos() {
        return distritos;
    }
    public void setDistritos(Distritos distritos) {
        this.distritos = distritos;
    }
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    public double getLatitud() {
        return latitud;
    }
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    //METODOS

    public boolean getTaxiIgualDistrito(Taxi tx) {

        if(this.distritos.equals(tx.distritos))
            return true;

        return false;
    }

    public String getCoordenadas() {
        return this.longitud + ", " + this.latitud;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "matricula='" + matricula + '\'' +
                ", distritos=" + distritos +
                ", tipoMotor=" + tipoMotor +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }
}

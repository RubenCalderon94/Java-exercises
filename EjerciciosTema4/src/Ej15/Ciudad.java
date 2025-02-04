package Ej15;


public class Ciudad {
	
	private String id;
	private String nombre;
	private int poblacion;
	private String pais;
	private String codigoPais;
	
	public Ciudad (String datos) {
		String [] city = datos.split(",");
		
		this.id = city[0];
		this.nombre = city[1];
		this.poblacion = Integer.parseInt(city[2]);
		this.pais = city[3];
		this.codigoPais = city[4];
	}

	public Ciudad(String id, String nombre, int poblacion, String pais, String codigoPais) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.pais = pais;
		this.codigoPais = codigoPais;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", nombre=" + nombre + ", poblacion=" + poblacion + ", pais=" + pais
				+ ", codigoPais=" + codigoPais + "]";
	}
	
	
	
	
}


public class Tienda 
{
	private String nombre;
	private String direccion;
	private boolean esCasaMatriz;
	
	public Tienda(String nombre, String direccion, boolean esCasaMatriz) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.esCasaMatriz = esCasaMatriz;
	}
	
	public Tienda() {
		
		this.nombre = "";
		this.direccion = "";
		this.esCasaMatriz = true;
	}

	//Get y Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isEsCasaMatriz() {
		return esCasaMatriz;
	}

	public void setEsCasaMatriz(boolean esCasaMatriz) {
		this.esCasaMatriz = esCasaMatriz;
	}
	
	//Metodos custom
	
}


public class Cliente 
{
	private int rut;
	private char dv;
	private String nombre;
	private String apellido;
	private int numeroTelefono;
	
	
	public Cliente(int rut, char dv, String nombre, String apellido, int numeroTelefono) {
		
		this.rut = rut;
		this.dv = dv;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroTelefono = numeroTelefono;
	}
	
	public Cliente() {
		
		this.rut = 0;
		this.dv = ' ';
		this.nombre = "";
		this.apellido = "";
		this.numeroTelefono = 0;
	}

	
	//Get y Set
	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public char getDv() {
		return dv;
	}

	public void setDv(char dv) {
		this.dv = dv;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	
	//Metodos custom
	public String mostrarDatos() {
		return " ==== Datos del Cliente ==== "
				+ "\n Rut Cliente: "          + this.rut
				+ "\n dv: " 			      + this.dv
				+ "\n Nombre: "               + this.nombre
				+ "\n Apellido: "	          + this.apellido				
				+ "\n Número de Télefono: "   + "+569-"+ this.numeroTelefono;
	}
	
}

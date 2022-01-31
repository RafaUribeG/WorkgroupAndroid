

public class Producto 
{
	private int codigoProducto;
	private String nombreProducto;
	private String tipoProducto;
	private String descripcionProducto;
	private int ubicacionBodega;
	private int precio;
	private int stock;
	
	
	//Constructores
	public Producto(int codigoProducto, String nombreProducto, String tipoProducto, String descripcionProducto,
			int ubicacionBodega, int precio, int stock) {
		
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.tipoProducto = tipoProducto;
		this.descripcionProducto = descripcionProducto;
		this.ubicacionBodega = ubicacionBodega;
		this.precio = precio;
		this.stock = stock;
	}
	
	public Producto() {
		
		this.codigoProducto = 0;
		this.nombreProducto = "";
		this.tipoProducto = "";
		this.descripcionProducto = "";
		this.ubicacionBodega = 0;
		this.precio = 0;
		this.stock = 0;
	}
	
	
	//Getter y  Setter
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}		

	public int getUbicacionBodega() {
		return ubicacionBodega;
	}

	public void setUbicacionBodega(int ubicacionBodega) {
		this.ubicacionBodega = ubicacionBodega;
	}

	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}


	//Metodos 
	public String mostrarDatos() {
		return " ==== Listado de Productos ==== "
				+ "\n Código Producto: "          + this.codigoProducto 
				+ "\n Nombre del Producto: "      + this.nombreProducto 
				+ "\n Tipo de Producto: "	      + this.tipoProducto 
				+ "\n Descripción del Producto: " + this.descripcionProducto
				+ "\n Ubicación del Producto: "   + "Bodega "+ this.ubicacionBodega
				+ "\n Precio: "                   + "$" + this.precio 
				+ "\n Stock: "                    + this.stock;
	}
	
	
}

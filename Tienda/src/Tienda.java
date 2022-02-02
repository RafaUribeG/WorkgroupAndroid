public class Tienda {
	
	private boolean esCasaMatriz;
	private String direccion;;
	private int telefono;
	private Producto producto;
	private int numBoleta;
	private int cantidadProducto;	

	public Tienda() {
		super();
		this.esCasaMatriz = true;
		this.direccion = "";
		this.telefono = 0;
		this.producto = null;
		this.numBoleta = 0;
		this.cantidadProducto = 0;
	}
	
	public Tienda(boolean esCasaMatriz, String direccion, int telefono, Producto producto, int numBoleta, int cantidadProducto) {
		super();
		this.esCasaMatriz = esCasaMatriz;
		this.direccion = direccion;
		this.telefono = telefono;
		this.producto = producto;
		this.numBoleta = numBoleta;
		this.cantidadProducto = cantidadProducto;
	}
	
	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	
	public boolean isEsCasaMatriz() {
		return esCasaMatriz;
	}

	public void setEsCasaMatriz(boolean esCasaMatriz) {
		this.esCasaMatriz = esCasaMatriz;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion1(String direccion) {
		this.direccion = direccion;
	}


	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public int getNumBoleta() {
		return numBoleta;
	}

	public void setNumBoleta(int numBoleta) {
		this.numBoleta = numBoleta;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	
	public String generarVenta(Producto producto){
		
		return "\" ==== Comprobante de Venta ==== "
				+ "\n Código Producto: "          + producto.getCodProducto()
				+ "\n Nombre del Producto: "      + producto.getNomProducto()
				+ "\n Tipo de Producto: "	      + producto.getTipoProducto()
				+ "\n Casa Matriz: "              + (this.isEsCasaMatriz()? "Si" : "No")
				+ "\n Cantidad: "                 + this.cantidadProducto
				+ "\n Valor Unidad: "             + "$" + producto.getValorNeto()
				+ "\n Valor Iva: "                + "$" + producto.valorIva()
				+ "\n Total a Pagar: "            + "$" + producto.totalApagar()
				+ "\n Numero Boleta: "            + this.numBoleta;
				
	
	}
	
}
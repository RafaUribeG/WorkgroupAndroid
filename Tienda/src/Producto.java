public class Producto implements Iva{
	
	private int codProducto;
	private String nomProducto;
	private String tipoProducto;
	private String descripcionProducto;
	private int ubicacionBodega;
	private int valorNeto;
	private int stock;
	
	
	public Producto() {
		
		this.codProducto 		 = 	0;
		this.nomProducto 		 = 	"";
		this.tipoProducto 		 = 	"";
		this.descripcionProducto = 	"";
		this.ubicacionBodega 	 = 	0;
		this.valorNeto	 		 = 	0;
		this.stock 				 = 	0;

	}
	
	public Producto(int codProducto, String nomProducto, String tipoProducto, String descripcionProducto,
			int ubicacionBodega, int valorNeto, int stock) {
		
		this.codProducto 		 = 	codProducto;
		this.nomProducto 		 = 	nomProducto;
		this.tipoProducto 		 = 	tipoProducto;
		this.descripcionProducto = 	descripcionProducto;
		this.ubicacionBodega 	 = 	ubicacionBodega;
		this.valorNeto 			 = 	valorNeto;
		this.stock 				 = 	stock; 
	
		
		
	}

	public int getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	public String getNomProducto() {
		return nomProducto;
	}

	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
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

	public int getValorNeto() {
		return valorNeto;
	}

	public void setValorNeto(int valorNeto) {
		this.valorNeto = valorNeto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
	public String mostrarDatos() {
		return " ==== Listado de Productos ==== "
				+ "\n Código Producto: "          + this.codProducto 
				+ "\n Nombre del Producto: "      + this.nomProducto 
				+ "\n Tipo de Producto: "	      + this.tipoProducto 
				+ "\n Descripción del Producto: " + this.descripcionProducto
				+ "\n Ubicación del Producto: "   + "Bodega "+ this.ubicacionBodega
				+ "\n Precio: "                   + "$ " + this.valorNeto 
				+ "\n Stock: "                    + this.stock;
	}

	public int valorIva() {
		 int iva = (int)(getValorNeto() * Iva.IVA);		
		return iva;
	}
	public int totalApagar(){
		int iva = (int)(getValorNeto() * Iva.IVA);
		int total = (int)(getValorNeto() + iva);
		
		return total;
	}
	
}
import java.util.ArrayList;

public class Bodega {

	private String nombre;
	private int tipoBodega;
	ArrayList<Producto> productos; 	
	
	
	
	public Bodega() 
	{		
		productos = new ArrayList<Producto>();
		this.nombre = "";
		this.tipoBodega = 0;
	}	

	
	public Bodega(String nombre, int tipoBodega, ArrayList<Producto> productos) {
		
		this.nombre = nombre;
		this.tipoBodega = tipoBodega;
		this.productos = productos;
	}
	
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTipoBodega() {
		return tipoBodega;
	}


	public void setTipoBodega(int tipoBodega) {
		this.tipoBodega = tipoBodega;
	}


	public ArrayList<Producto> getProductos() {
		return productos;
	}


	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}


	//Agregar Producto
	public boolean agregar(Producto producto)
	{
		for(Producto aux: productos)
		{
			if(aux.getCodProducto() == producto.getCodProducto())
				return false; 		
		}
		productos.add(producto);
		return true; 
	}
	
	//Listar Producto
	public String listar() 
	{
		String datos = ""; 
		for (Producto aux : productos)
		{
			datos += "\n" + aux.mostrarDatos();
		}
		return datos;
	}
	
	//Eliminar 
	public boolean eliminar(Producto producto) 
	{
		for(Producto aux: productos)
		{
			if(aux.getCodProducto() == producto.getCodProducto()) 
			{
				productos.remove(aux);
				return true; 		
			}						
		}
		return false;
	}
	
	//Buscar
	public Producto buscarPorCodigo(int codigo)
	{
		for(Producto aux: productos)
		{
			if(aux.getCodProducto() == codigo)
				return aux;
		}
		return null;
	}
	
	//Conteo de productos
	public String contabilizar()
	{
		int producto = 0;		
		for(Producto aux : productos)
		{
			producto++;
		}
		return "Existe/n: \n " + producto + " Productos";
	}
	

	
	public boolean descontarStock(Producto producto, int cantidad) 
	{	
		int cod = 0;
		int resultado = 0;
		for(Producto aux: productos) 
		{		
			if(aux.getCodProducto() == producto.getCodProducto())
			{	
				cod = aux.getStock();
				resultado = cod - cantidad;
				aux.setStock(resultado);
			}
		}
		return  false;
	}		
}
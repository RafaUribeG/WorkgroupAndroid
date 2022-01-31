import java.util.ArrayList;

public class RegistroProducto 
{
	ArrayList<Producto> productos;
	
	public RegistroProducto() 
	{
		productos = new ArrayList<Producto>();
	}
	
	//Agregar Producto
	public boolean agregar(Producto producto)
	{
		for(Producto aux: productos)
		{
			if(aux.getCodigoProducto() == producto.getCodigoProducto())
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
			if(aux.getCodigoProducto() == producto.getCodigoProducto()) 
			{
				productos.remove(aux);
				return true; 		
			}						
		}
		return false;
	}
	
	//Conteo de productos
	public String contabilizar()
	{
		int producto = 0;		
		for(Producto aux: productos)
		{
			producto++;
		}
		return "Existe/n: \n " + producto + " Productos";
	}
	
	
	
	
	
	
}


public class Principal {

	public static void main(String[] args) 
	{
		Bodega bodega1 = new Bodega();
		Bodega bodega2 = new Bodega();
		Tienda tienda = new Tienda();
		//Cliente cliente = new Cliente(19802569,'9', "Ragnar", "Lothbrock",95684513);
				
		Producto producto = new Producto(1,"COCACOLA", "Bebida", "ZERO", 1, 1200 , 100);
		Producto producto2 = new Producto(2, "Lays", "Papas fritas", "Corte Liso", 2, 1200, 100);
		Producto producto3 = new Producto(3, "MarcoPolo", "Papas fritas", "Artesanas", 2, 1500, 100);
		Tienda tienda1 = new Tienda(true, "sadgshsh",891523962, producto2, 10, 4);
		Tienda tienda2 = new Tienda(false, "kjsadgnkjas", 837202730, producto3, 1, 5);
		
		bodega1.agregar(producto);
		bodega2.agregar(producto2);
		bodega2.agregar(producto3);
		bodega1.agregar(producto2);
		
		for (Producto aux : bodega1.productos) 
		{
			System.out.println(aux.mostrarDatos());
		}
		
		for (Producto aux : bodega2.productos) 
		{
			System.out.println(aux.mostrarDatos());
		}
		
		Producto prod = bodega1.buscarPorCodigo(2);
		System.out.println("\n El producto solicitado es: \n" + prod.mostrarDatos());
	    System.out.println(tienda1.generarVenta(producto2));
		System.out.println(tienda2.generarVenta(producto3));
		bodega1.descontarStock(producto2, 4 );
		bodega2.descontarStock(producto3, 5 );
		
		System.out.println(bodega1.listar());
		System.out.println(bodega2.listar());
		
		//System.out.println(cliente.mostrarDatos());
	}

}

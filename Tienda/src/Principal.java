
public class Principal {

	public static void main(String[] args) 
	{
		RegistroProducto rp = new RegistroProducto();
		Cliente cliente = new Cliente(19802569,'9', "Ragnar", "Lothbrock",95684513);
				
		Producto producto = new Producto(1,"COCACOLA", "Bebida", "ZERO", 1, 1200 , 100);
		Producto producto2 = new Producto(2, "Lays", "Papas fritas", "Corte Liso", 2, 1200, 100);
		
		rp.agregar(producto);
		rp.agregar(producto2);
		
		for (Producto aux : rp.productos) 
		{
			System.out.println(aux.mostrarDatos());
		}
		
		System.out.println(rp.contabilizar());
		rp.eliminar(producto);
		System.out.println(rp.contabilizar());
		
		System.out.println(cliente.mostrarDatos());
	}

}

import java.util.ArrayList;

public class Taller 
{
	//Vehiculo vehiculo = new Automovil(5, 50, "GPHB20", "hyundai", "rojo", 50000);
	//Vehiculo vehiculo2 = new Motocicleta("af3010", "honda", "verde",20000, 5,"naked");
	
	
	//Automovil auto = (Automovil) vehiculo;
	//Motocicleta moto = (Motocicleta)vehiculo2;		
	
		ArrayList<Vehiculo> vehiculos;
	
		public Taller()
		{
			vehiculos = new ArrayList<Vehiculo>();
		}
		
		//Agregar Vehiculo
		
		public boolean agregar(Vehiculo vehiculo)
		{
			for(Vehiculo aux: vehiculos)
			{
				if(aux.getPatente().equalsIgnoreCase(vehiculo.getPatente()))
					return false; 		
			}
			vehiculos.add(vehiculo);
			return true; 
		}
		
		//Listado de vehiculos
		public String listar()
		{
			String datos = "";
			for(Vehiculo aux: vehiculos)
			{
				datos += "\n" + aux.mostrarDatos(); 
			}
			return datos;
		}
		
		//Conteo
		public String contabilizar()
		{
			int auto = 0;
			int moto = 0;
			for(Vehiculo aux: vehiculos)
			{
				if(aux instanceof Automovil)
					auto++;
				else 
					moto++; 
			}
			return "Existen:\n" + auto + " automóviles y " + moto + " motocicletas";
		}
		
		public boolean eliminar(String patente) 
		{
			for(Vehiculo aux: vehiculos)
			{
				if(aux.getPatente().equalsIgnoreCase(patente)) 
				{
					vehiculos.remove(aux);
					return true; 		
				}						
			}
			return false;
		}
/*	
		 boolean existe = false;
		 for (Vehiculo aux : vehiculos)
	       {  
	       		if (aux.getPatente().equals(auto.getPatente()))
	       		{
		        	existe = true;
		        	break; // cierra el ciclo for (termina de ejecutarse)
	       		}
	       }
		   if(!existe)		 
			   vehiculos.add(auto);		 
		   else	     
			   System.out.println("Automovil existente");
	     
		 
		 
		 existe = false;
		 for (Vehiculo aux : vehiculos)
	       {  
	       		if (aux.getPatente().equals(moto.getPatente()))
	       		{
		        	existe = true;
		        	break; // cierra el ciclo for (termina de ejecutarse)
	       		}
	       }
		   if(!existe) 		 
			   vehiculos.add(moto);		 
		   else 		     
			   System.out.println("Motocicleta existente");
	     
		 
		 //Listar vehiculos
		 
		 for (Vehiculo aux : vehiculos) 
			{
			 	if(aux instanceof Automovil) 
			 	{
			 		System.out.println("\n=== Listado de Vehiculos - Automoviles === ");
			 		System.out.println("Patente: " +((Automovil)aux).getPatente());
					System.out.println("Marca: " + ((Automovil)aux).getMarca());
					System.out.println("Color: " + ((Automovil)aux).getColor());
					System.out.println("Costo del Servicio: " + ((Automovil)aux).getCostoServicio());
					System.out.println("Cantidad de Puertas: " + ((Automovil)aux).getCantidadPuertas());
					System.out.println("Capacidad del Maletero: " + ((Automovil)aux).getCapacidadMaletero());
			 	}
			 	else if(aux instanceof Motocicleta) 
			 	{
			 		System.out.println("\n=== Listado de Vehiculos - Motocicletas === ");
			 		System.out.println("Patente: " + ((Motocicleta)aux).getPatente());
					System.out.println("Marca: " + ((Motocicleta)aux).getMarca());
					System.out.println("Color: " + ((Motocicleta)aux).getColor());
					System.out.println("Costo del Servicio: " + ((Motocicleta)aux).getCostoServicio());
					System.out.println("Medida Manillar: " + ((Motocicleta)aux).getMedidaManillar());
					System.out.println("Estilo: " + ((Motocicleta)aux).getEstilo());
			 	}
								
			}

		 //Cantidad de elementos 
		 System.out.println("*** Cantidad de elementos en la colección son: " + vehiculos.size());
		 */
}

	


package poo;

public class PruebaPelicula {

		public static void main(String[] args) {
		
		Pelicula  peli1 = new Pelicula();
		Pelicula  peli2= new Pelicula();
		Pelicula   peli3 = new Pelicula();
		
		//dar valores al objeto peli1
		peli1.nombre="Tiburon";
		peli1.director="Steven Spieldberg";
		peli1.duracion=175.65;
		peli1.year=1975;

		//dar valores al objeto peli2
		peli2.nombre="El show de Truman";
		peli2.director="Peter Weir";
		peli2.duracion=136.25;
		peli2.year=1998;
		
		//dar valores al objeto peli3
		peli2.nombre="Celda211";
		peli2.director="Daniel Monzon";
		peli2.duracion=110.19;
		peli2.year=2009;
// mostrar valores de los objetos
System.out.println(peli1.nombre+" " +	peli1.director + "  " + peli1.duracion + "" + peli1. year);
System.out.println(peli2.nombre+" " +	peli2.director + "  " + peli2.duracion + "" + peli2. year);

System.out.println(peli3.nombre+" " +	peli3.director + "  " + peli3.duracion + "" + peli3. year);

			
		}
}



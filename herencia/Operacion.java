package herencia;
//protected en la misma clase en el mismo paquete en una subclase es fuera del paquete
import java.util.*;
				
	public class Operacion {
		
					protected Scanner Z;
					protected int valor1;
					protected int valor2;
					protected double resultado;
					//protected double resultado1;
					public Operacion() {
						Z =new Scanner(System.in);
					}
					
					public void cargar1() {
						System.out.print("ingrese el primer valor: ");
						valor1=Z.nextInt();
					}
					public void cargar2() {
						System.out.print("ingrese el segundo valor: ");
						valor2=Z.nextInt();
					}
					public void mostrarResultado() {
						System.out.println(resultado);
					}
				}

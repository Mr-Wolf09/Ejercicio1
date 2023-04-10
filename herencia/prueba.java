package herencia;

public class prueba {
          
	public static void main(String [] ar) {
		
		//ejercicio de la suma
		Suma suma1=new Suma();
		suma1.cargar1();
		suma1.cargar2();
		suma1.operar();
		
		System.out.print("El resultado de la suma: ");
		suma1.mostrarResultado();
		
		//ejercicio de la resta
		resta resta1= new resta();
		resta1.cargar1();
		resta1.cargar2();
		resta1.operar();
		
		System.out.print("El resultado  de la resta es: ");
		resta1.mostrarResultado();
		
		//ejercicio de multiplicar
		
		Multiplicar multiplo1= new Multiplicar();
		multiplo1.cargar1();
		multiplo1.cargar2();
		multiplo1.operar();
		
		System.out.print("El resultado  de la multiplicacion es: ");
		multiplo1.mostrarResultado();
		

		//ejercicio de Potencia
		
		Potencia  potencia1= new Potencia();
		potencia1.cargar1();
		potencia1.cargar2();
		potencia1.operar();
		
		System.out.print("El resultado  de la potencia es: ");
		potencia1.mostrarResultado();
		

		//ejercicio de Division
		
		Division  division1= new Division();
		division1.cargar1();
		division1.cargar2();
		division1.operar();
		
		System.out.print("El resultado  de la division es: ");
		division1.mostrarResultado();
		
	//ejercicio de Raiz cuadrada
		
		Raiz  raiz1= new Raiz();
		raiz1.cargar1();
	//	raiz1.cargar2();
		raiz1.operar();
		
		System.out.print("El resultado  de la raiz cuadrada  es: ");
		raiz1.mostrarResultado();
	}
}
	
	
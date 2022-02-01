package operadores;

public class Operadores {
	
	public static void main (String [] args) {
		
		//Operadores Aritmeticos
		
		int a = 10; 
		int b = 20; 
		double c = 10.5; 
		int suma = a + b; 
		String str1 = "El resultado es: "; 
		
		System.out.println(str1 +suma); 
		
		System.out.println("El resultado de la resta: " + (b - a)); 
		
		int division = a / b; 
		System.out.println("El resultado de la division es:" + division); 
		
		//double division2 = (double)  a /b; 
		
		double division2 = c / b; 
		
		System.out.println("El resultado de la division es: " + division2); 
		
		double multiplicacion = c * a; 
		
		System.out.println("El resultado de la Multiplicacion" + multiplicacion); 
		
		int modulo = a % b; 
		
		System.out.println("El modulo de laoperacion es" + modulo); 
		
		int d = 2,e; 
		
		d = 1; 
		e = 2; 
		
		System.out.println(d+ " - " +e); 
		
		int f = 0, g = 5; 
		
		f += 5; 
		
		
		System.out.println(f);
		
		int h = 15, i = 25; 
		
		String j = "Hola"; 
		
		System.out.println(h > i ); 
		
		System.out.println(i != h); 
		
		int k = 0, l = 0; 
		k++; 
		
		System.out.println(k); 
		System.out.println(--l);
		
		
		int operacion = (4 + 5) * 6 / 3; 
		System.out.println(operacion);
		
		int x = 0, y = 0; 
		
		
		
		int operacion2 = ++x + --y;
		
		
		int edad = 18, valor1 = 0, valor2 = 1; 
		
		 //String resultado = (edad  <= 18) ? valor1 : valor2;
		
		

		
		//System.out.println(resultado);
		
		
		System.out.println(operacion2);
		
		
		
		
		
		
		
		
		
		System.out.println(true && true); 
		System.out.println(true && false); 
		System.out.println(true || false);
		System.out.println(true && !false);
		
		
		
		
		
		
	}

}

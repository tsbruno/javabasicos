import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n1 = 0, n2 = 0; 
		
		System.out.println("introduce el numero: "); 
		n1 = teclado.nextInt(); 
	 
		System.out.println("Introduce el número:");      
		n2 = teclado.nextInt();
		 
		System.out.println("Introduce la opcion: ");
		String operacion = teclado.next(); 
		

		 switch(operacion.toLowerCase()) {
			
			case "suma": System.out.println(n1 + n2); ;break; 
			case "resta": System.out.println(n1 - n2);break; 
			case "multiplicacion": System.out.println(n1 * n2);break; 
			case "division": System.out.println(n1 / n2);break;  
			
			default: System.out.println("Invalido"); 
			
			}
		 
		 
	}
}

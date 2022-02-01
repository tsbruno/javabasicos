import java.util.Scanner;

public class ScannerYBuffer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println ("introduce un nombre: ");
		String nombre = sc.nextLine(); 
		
		System.out.println ("introduce tu edad: "); 
		int numero1 = sc.nextInt(); 
		sc.nextLine(); 
		
		sc.close();
	 
 
		System.out.println ("Tú nombre es "+ nombre + " y tu edad es " + numero1 + "años"); 
		
		
	}
}

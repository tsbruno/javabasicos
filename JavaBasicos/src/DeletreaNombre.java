import java.util.Scanner;

public class DeletreaNombre {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("introduce el nombre: "); 
		String nombre = sc.nextLine(); 
		 
		
		for (int i =0; i < nombre.length(); i++) {
			
			System.out.println(nombre.charAt(i)); 
			
		}
	}
}



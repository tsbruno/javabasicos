package operadores;

import java.util.Scanner;

public class ControlDeFlujo {
	
	public static void main(String[] args) {
		
		
	
		
		System.out.println("Introdiuce un numero: "); 
		Scanner sc = new Scanner (System.in); 
		
		
		int edad = sc.nextInt(); 
		
		
		if(edad >=  18) {
			
			
			System.out.println("ERES MAYOR DE EDAD"); 
		}else {
			System.out.println("ERES MENOR DE EDAD");
		}
		
		
	}
	
	
}

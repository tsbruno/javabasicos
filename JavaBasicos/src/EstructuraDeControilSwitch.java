import java.util.Scanner;

public class EstructuraDeControilSwitch {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("introduce un día: "); 
		String dia = sc.nextLine(); 
		
		
		
		switch(dia.toLowerCase()) {
		
		case "lunes": System.out.println("Inicio de Semana");break; 
		case "martes": System.out.println("new chalenge");break; 
		case "miercoles": System.out.println("un nuevo día de aprender");break; 
		case "jueves": System.out.println("jueves");break; 
		case "viernes": System.out.println("ya es viernes");break; 
		case "sabado": System.out.println("seguir estudiando");break; 
		case "domingo": System.out.println("seguir estudiando");break; 
		
		default: System.out.println("Invalido"); 
		
		}

		
		
		
		
		
		
		
	}
}


public class Arreglos {
	
	public static void main(String[] args) {
		
		int numeros[]; 
		numeros = new int [4]; 
	
		String[] nombres = new String[4]; 
		
String []nombreFrutas = new String[]{
		
		"manzana","uvas", "uvas", "uvas"
		
		}; 
		
		
		numeros[0] = 10; 
		numeros[1] = 8;
		numeros[2] = 100;
		numeros[3] = 104;
		/* numeros[4] = 104; */
		
		nombres[0] = "juan";
		nombres[1] = "jhon"; 
		nombres[2] = "johanan";
		nombres[3] = "johanan";
		
		
		for(int i =0; i < numeros.length; i++) {
			
			System.out.println(numeros[i]);
			System.out.println(nombres[i]);
			System.out.println(nombreFrutas[i]);
			System.out.println("-----------");
			
			

		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
}

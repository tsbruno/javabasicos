import java.util.Scanner;

public class Tablas {

	public static void main(String[] args){
		
        Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Ingresa cualquier número positivo: ");
        num = console.nextInt();
                
        
        if(num > 0) {
        
        
        for(int i=1; i <=10; i++) {
        	
        	System.out.print(num + "por" + i + "es igual" + num * 1);
        }
        }
        	
        else{
        	System.out.print("invalido");
        }
        
     
    }
}

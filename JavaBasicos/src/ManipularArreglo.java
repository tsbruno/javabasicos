
public class ManipularArreglo {

	
	public static void main(String[] args) {
				
				
	int[] arr =new int[] {1,2,3,4,5,6,7,8,9,10}; 
    int[] sumas = new int[]{0,0,0,}; 
				
	for(int i =0; i < arr.length; i++) {
					
		sumas[0] += arr[i]; 
		sumas[1] += (arr[i]%2 == 0) ? arr[i] : 0;
		sumas[2] += (arr[i]%2 != 0) ? arr[i] : 0;
					
		}
				
			System.out.println("Suma totoal: " + sumas[0]);
			System.out.println("Suma pares: " + sumas[1]);
			System.out.println("Suma impares: " + sumas[2]);
			
				
	}
				
}

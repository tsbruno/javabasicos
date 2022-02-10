import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ColeccionesJava {

		
		public static void main(String[] args) {
			
			
			/*
			 * Set<String> frutas = new LinkedHashSet<String>();
			 * 
			 * frutas.add("mango"); frutas.add("granada"); frutas.add("piña");
			 * frutas.add("mamey"); frutas.add("fresa"); frutas.add("fresa");
			 * 
			 * for(String fruta : frutas ) {
			 * 
			 * System.out.println(fruta);
			 * 
			 * }
			 */
			/*
			 * List<String> instrumentos = new ArrayList<String>();
			 * 
			 * instrumentos.add("chello"); instrumentos.add("violin");
			 * instrumentos.add("guitarra"); instrumentos.add("arpa");
			 * 
			 * instrumentos.add(2, "bateria");
			 * 
			 * instrumentos.remove(3);
			 * 
			 * instrumentos.set(0, "saxofon");
			 * 
			 * for(String instrumento : instrumentos) {
			 * 
			 * System.out.println(instrumento); }
			 * 
			 * System.out.println("**************");
			 * System.out.println(instrumentos.get(0));
			 * 
			 * System.out.println(instrumentos.indexOf("piano"));
			 */
			
			
			
			/*
			 * System.out.println("********************");
			 * 
			 * 
			 * List<String> zapatos = new LinkedList<String>();
			 * 
			 * zapatos.add("boston"); zapatos.add("casual"); zapatos.add("formal");
			 */
			
			
			Map<Integer, String> usuarios= new HashMap<Integer, String>(); 
			usuarios.put(1456, "bruno"); 
			usuarios.put(1456, "jhon");
			usuarios.put(348, "smith");
			
			
			System.out.println(usuarios.get(1456));
			
			
			
			
			System.out.println(usuarios.keySet());
			
			System.out.println(usuarios.values());
			
			
			
			Map<String, String> alimentos = new TreeMap<String, String>();
			
			alimentos.put("atun", "pan"); 
			alimentos.put("torta", "pay");
			alimentos.put("aves","carnes");
			
			
			System.out.println("**********");
			
			System.out.println(alimentos.keySet());
			System.out.println(alimentos.values());
			
			
			alimentos.entrySet().forEach(elemento-> {
				System.out.println(elemento.getKey());
				System.out.println(elemento.getValue());
			}); 
			
			
			Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
			
			carros.put(1, "volvo");
			carros.put(2, "ford");
			carros.put(3, "fiat");
			
			
			System.out.println("**************");
			System.out.println(carros.keySet());
			System.out.println(carros.values());
			
			
			
			
			
			
			
			
			
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*
			 * String miCadena = "hola todos"; System.out.println(miCadena.charAt(0))
			 */;
		}
	
}

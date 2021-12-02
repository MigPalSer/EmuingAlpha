package basicTest;

import java.util.Set;

import interfaces.ConjuntoItems;
import interfaces.Item;

public class ManualTest {

	public ManualTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ConjuntoItems conjunto=FabricaTest.conjunto1();
		
		Set<Item> a=conjunto.itemsQuery(i-> {
			return i.getLista()==1002;});
		
		for(Item i: a) {
			System.out.println(i.getDescripcion_corta());
		}
	}
	
		

}

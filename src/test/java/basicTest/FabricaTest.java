package basicTest;

import basicEmuing.BasicItem;
import basicEmuing.ItemsSet;
import interfaces.ConjuntoItems;

public class FabricaTest {

	/*Crea un conjunto de 7 items básicos
	 *Lista 0 tiene item 7
	 *Lista 1001 tiene items 1, 2, 3
	 *Lista 1002 tiene items 3, 4
	 *Lista 1003 tiene items 5, 6 
	 * */
	public static ConjuntoItems conjunto1() {
		ItemsSet conjunto1=new ItemsSet();
		BasicItem item1=new BasicItem("item1");
		BasicItem item2=new BasicItem("item2");
		BasicItem item3=new BasicItem("item3");
		BasicItem item4=new BasicItem("item4");
		BasicItem item5=new BasicItem("item5");
		BasicItem item6=new BasicItem("item6");
		BasicItem item7=new BasicItem("item7");
		item1.setId(1); item1.setLista(1001);
		item2.setId(2); item2.setLista(1001);
		item3.setId(3); item3.setLista(1001);
		item4.setId(4); item4.setLista(1002);
		item1.setId(5); item5.setLista(1002);
		item6.setId(6); item6.setLista(1003);
		item7.setId(7); item7.setLista(0);

		conjunto1.add(item1);
		conjunto1.add(item2);
		conjunto1.add(item3);
		conjunto1.add(item4);
		conjunto1.add(item5);
		conjunto1.add(item6);
		conjunto1.add(item7);

		
		return conjunto1;
	}
}

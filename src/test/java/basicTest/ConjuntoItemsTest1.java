package basicTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import interfaces.ConjuntoItems;
import interfaces.Item;

class ConjuntoItemsTest1 {

	ConjuntoItems conjunto_test;
	
	@BeforeEach
	void setup() {
		conjunto_test=FabricaTest.conjunto1();
	}
	
	@Test
	void testLista1() {
		Set<Item> a=conjunto_test.itemsQuery(i-> {
		return i.getLista()==1001;});
		assertEquals(3, a.size());
	}

	@Test
	void testLista2() {
		Set<Item> a=conjunto_test.itemsQuery(i-> {
			return i.getLista()==1002;});
			assertEquals(2, a.size());
	}

	@Test
	void testLista4() {
		Set<Item> a=conjunto_test.itemsQuery(i-> {
			return i.getLista()==1004;});
			assertEquals(0, a.size());
	}
}

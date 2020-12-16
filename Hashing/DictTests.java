package Hashing;
import java.util.*; 

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DictTests {

	@Test
	void test() {
		IDictionary<String, String> d = new Dict<String, String>(); 
		assertEquals(d.isEmpty(), true); 
		
		d.insert("Hello", "Kamusta");
		d.insert("Thank you", "Salamat");
		d.insert("I love you", "Mahal kita");
		
		assertEquals(d.isEmpty(), false); 
		assertEquals(d.size(), 3); 
		assertEquals(d.findElement("Thank you"), "Salamat"); 
		assertEquals(d.findElement("Hello"), "Kamusta"); 
		assertEquals(d.findElement("I love you"), "Mahal kita"); 
		
		d.delete("Hello");
		
		assertEquals(d.size(), 2); 
		assertEquals(d.findElement("Hello"), null); 
		
		d.insert("Beautiful", "Maganda");
		
		Iterator<String> klooper = d.keys(); 
		Iterator<String> elooper = d.elements(); 
		String res = ""; 
		while (klooper.hasNext()) { 
			res = res + " " + klooper.next() + " " + elooper.next(); 
		}
		assertEquals(res, " Thank you Salamat I love you Mahal kita Beautiful Maganda"); 
	}

}

package Hashing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class DbHashTests {
	
	HashComparator<String> scomp = new StringComparator(); 
	DbHash<String, String> ht = new DbHash<String, String>(101, scomp); 

	@Test
	void testHT() {
			
			assertEquals(ht.size(), 0); 
			assertEquals(ht.isEmpty(), true); 
			assertEquals(ht.findElement("Isabella"), null); 
			
			ht.insert("Isabella", "Felix");
			ht.insert("Nicholas", "Gannon");
			ht.insert("Eden", "O'Leary");
			ht.insert("Jasiel", "Garcia");
			
			assertEquals(ht.size(), 4); 
			assertEquals(ht.isEmpty(), false);
			assertEquals(ht.findElement("Eden"), "O'Leary"); 
			assertEquals(ht.findElement("Craig"), null); 
			
			ht.delete("Isabella");
			assertEquals(ht.findElement("Isabella"), null);
			
			Iterator<String> klooper = ht.keys(); 
			Iterator<String> elooper = ht.elements();
			String res = ""; 
			while (klooper.hasNext()) { 
				res = res + " " + klooper.next() + " " + elooper.next();
			}
			assertEquals(res, " Eden O'Leary Jasiel Garcia Nicholas Gannon"); 
			
		}

}

package Hashing;
import java.util.*;

public class CompareHash {
	
		public static String genRandomString() { 
		String s = "";
		int i = 0;
		Random r = new Random();
		while (i < 1 + r.nextInt(20)) {
			s += (char) r.nextInt(256);
			i++;
		}
		return s;
	}
	
	public static ArrayList<String> makeList(int len){ 
		ArrayList<String> arr = new ArrayList<String>(); 
		String str; int i = 0; 
		while(i < len) { 
			str = genRandomString(); 
			if(!arr.contains(str)) { 
				arr.add(str); 
				i++; 
			}
		}
		return arr; 
	}

	public static void main(String[] args) {
		int size = 1000;
		while(size <= 10000) {
			HashComparator<String> hc = new StringComparator();
			LPHash<String, String> LPhasher = new LPHash<String, String>(10007, hc);
			DbHash<String, String> Dbhasher = new DbHash<String, String>(10007, hc);
			ArrayList<String> keys = makeList(size);
			ArrayList<String> elems = makeList(size);
			for(int i = 0; i<keys.size(); i++)
			{
				Dbhasher.insert(keys.get(i), elems.get(i));
				//LPhasher.insert(keys.get(i), elems.get(i));
			}
			int dbc = Dbhasher.Collisions;
			//int lpc = LPhasher.Collisions;
			System.out.println("Collisions for array size " + size);
			System.out.println(dbc);
			//System.out.println(lpc);
			size +=1000;
		}
	}
}

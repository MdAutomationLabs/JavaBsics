package InteviewQA;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s[] = {"Ahmed", "Ahmed", "Ahmid", "Ahmad"};
      
    //complexity 0(n*n) --worst solution 
      for(int i=0; i<s.length;i++) {
    	  for(int j=i+1; j<s.length; j++) {
    		  
    		  if(s[i].equals(s[j])) {
    			  System.out.println("Duplicate "+s[i]);
    		  }
    	  }
      }
      // using HashSet java collection it store unique value
      // HashSet implementing set interface 
      //complexity 0(n)
	Set<String>store = new HashSet<String>();
	for(String name:s) {
		if(store.add(name)==false) {
			System.out.println("Duplicate "+name);
		}
	}
	
	//using HashMap  0(2n)
	Map<String, Integer>storeMap = new HashMap<String, Integer>();
	
	for(String name:s) {
		Integer count = storeMap.get(name);
		if(count== null) {
			storeMap.put(name, 1);
		}else {
			storeMap.put(name, ++count);
		}
   	}
	//get the value from this HashMap 0(2n)
	//Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
//	for(Entry<String, Integer> entry: entrySet) {
//		if(entry.getValue()>1) {
//			System.out.println(entry.getKey());
//		}
		
	}
	}



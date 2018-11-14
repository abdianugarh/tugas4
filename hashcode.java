import java.util.Hashtable;
	import java.util.Enumeration;

	public class hst {
	 
	 public static void main(String[] args) {
	 
	   Enumeration names;
	   String key;
	 
	   
	   Hashtable<String, String> hashtable = 
	              new Hashtable<String, String>();
	 
	
	   hashtable.put("Key1","ayam");
	   hashtable.put("Key2","kambing");
	   hashtable.put("Key3","sapi");
	   hashtable.put("Key4","tikus");
	   hashtable.put("Key5","monyet");
	 
	   names = hashtable.keys();
	   while(names.hasMoreElements()) {
	      key = (String) names.nextElement();
	      System.out.println("Key: " +key+ " & Value: " +
	      hashtable.get(key));
	   }
	 }
	}


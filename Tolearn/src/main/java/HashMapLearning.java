import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {
	Map<String, List <Integer>> myMap = new HashMap<String, List <Integer>>();

	public void addMarks(String name ,Integer marks) {
		List<Integer> valueList = new ArrayList<Integer>();
		if(myMap.containsKey(name)) {
			valueList = myMap.get(name);
		}
		valueList.add(marks);
		myMap.put(name,valueList);
	}
	
	public List<Integer> getValueList(String key){
		
		return myMap.get(key);
	}
	
	public List<String> keySet(Integer marks){
		Set<String> keys = myMap.keySet();
		List<String> marksFound = new ArrayList<String>();
		for(String key: keys) {
			if(myMap.get(key).contains(marks)) {
				marksFound.add(key);
			}
		}
		return marksFound;
	}

	public static void main(String[]args) {
		HashMapLearning values = new HashMapLearning();
		values.addMarks("sai", 10);
		values.addMarks("pavani", 20);
		values.addMarks("pendela", 40);
		values.addMarks("sure", 40);
		System.out.println(values.getValueList("sai"));
	
		
	}
}
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HashMapLearningTest {
	@Test
	public void getValues() {
		HashMapLearning map = new HashMapLearning();
		List<Integer> valueLists = new ArrayList<Integer>();
		valueLists.add(10);
		valueLists.add(10);
		valueLists.add(20);
		map.addMarks("sai", 10);
		map.addMarks("sai", 10);
		map.addMarks("sai", 20);
		map.addMarks("pavani", 10);
		map.addMarks("pavani", 30);
		map.addMarks("sravani", 10);
		map.getValueList("pavani");
		Assert.assertTrue(map.keySet(30).contains("pavani"));
		Assert.assertFalse(map.keySet(30).contains("sai"));
		Assert.assertFalse(map.keySet(30).contains("sravani"));
		Assert.assertTrue(map.getValueList("sai").contains(20));


		
	}

}

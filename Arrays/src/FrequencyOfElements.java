import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
	public static void bruteForce(int [] arr) {
		boolean [] visited = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			if(visited[i])
				continue;
			
			int count = 1;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i] == arr[j]) 
				{
					count++;
					visited[j] = true;
				}
			}
			System.out.print(arr[i]+" => "+count);
			System.out.println();
		}
	}
	
	public static void usingHashMap(int [] arr) {
		Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(freqMap.containsKey(arr[i])) {
				freqMap.put(arr[i], freqMap.get(arr[i])+1);
			} else {
				freqMap.put(arr[i], 1);
			}
		}
		freqMap.forEach((k,v)->{System.out.println(k+" "+v);});
	}
}

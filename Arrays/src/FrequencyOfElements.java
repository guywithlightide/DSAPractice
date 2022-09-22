import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

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
	
	public static List<?> nthFreqElement(int [] arr, int n) {
		Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(freqMap.containsKey(arr[i])) {
				freqMap.put(arr[i], freqMap.get(arr[i])+1);
			} else {
				freqMap.put(arr[i], 1);
			}
		}				
		Map<Object, List<Entry<Integer, Integer>>> m = freqMap.entrySet().stream().collect(Collectors.groupingBy(e->e.getValue()));
		Map<Object, List<Entry<Integer, Integer>>> sm = new TreeMap<Object, List<Entry<Integer,Integer>>>(m);
		List<List<Entry<Integer, Integer>>> z = sm.values().stream().collect(Collectors.toList());
		int count = 0;
		for(int k=z.size()-1;k>0;k++) {
			if(z.get(k).size()<=count+n) {
				return z.get(k);
			}
			++count;
		}
		return null;
	}
}

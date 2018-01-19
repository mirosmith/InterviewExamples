package resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


/**
 * 
 * Write a program to read words from a file. Count the 
   repeated or duplicated words. Sort it by maximum repeated or
   duplicated word count.
 *
 */
public class FindDuplicatesInFile {

    public static void main(String[] args) {	
	
	Map<String, Integer> duplicateMap = readAndCountFromFile("test1.txt");
	
	Map<String, Integer> sortedMap = sortMap(duplicateMap);
	
	for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
	    
	    System.out.format("%-10s %d %n", entry.getKey(),entry.getValue());
	    
	}
	
    }
    
    public static <K, V extends Comparable<? super V>> Map<K, V> sortMap(Map<K, V> unsortedMap) {
	
	List<Map.Entry<K, V>> list = new LinkedList<>(unsortedMap.entrySet());
	
	Comparator<Map.Entry<K, V>> comparator = new Comparator<Map.Entry<K, V>>() {

	    @Override
	    public int compare(Entry<K, V> o1, Entry<K, V> o2) {
		
		return (o2.getValue()).compareTo(o1.getValue());
	    }
	    
	};
	
	Collections.sort(list, comparator);	
	
	Map<K, V> sortedMap = new LinkedHashMap<>();
	
	for (Map.Entry<K, V> entry : list) {
	    
	    sortedMap.put(entry.getKey(), entry.getValue());
	}
	
	return sortedMap;
	
    }
    
    public static Map<String, Integer> readAndCountFromFile(String file) {
	
	Map<String, Integer> map = new HashMap<>();	
	
	if (file == null || file.isEmpty()) {
	    return map;
	}
	
	Path path = Paths.get(file);
	
	if (Files.notExists(path)) {
	    System.out.println("File does not exist");
	}
	
	try {
	    BufferedReader bfr = Files.newBufferedReader(path);
	    
	    String line;
	    
	    while ((line = bfr.readLine()) != null) {
		
		if (line.isEmpty()) {
		    continue;
		}
		
		String[] array = line.split(" ");
		
		for (String word: array) {
		    
		    if (word.isEmpty()) {
			continue;
		    }
		    
		    if (map.containsKey(word)) {
			
			int count = map.get(word);
			map.put(word, ++count);			
			
		    }
		    else {
			map.put(word, 1);
		    }
		    
		}
		
	    }
	}
	catch (IOException e) {
	    System.err.println();
	}	
	
	return map;
    }

}

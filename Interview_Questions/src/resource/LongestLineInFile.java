package resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * Write a program to read a multiple line text file and write the "N" longest lines to the output console,
 * where the file to be read is specified as command line arguments.
 *
 */
public class LongestLineInFile {

    public static void main(String[] args) throws IOException {
	
	if (args != null && args.length == 1 && !args[0].isEmpty()) {
	    
	    String file = args[0];
	    
	    Map<String, Integer> myMap = longestLines(file);
	    
	    Map<String, Integer> mySortedMap = sortItDesc(myMap);
	    
	    int howManyResults = 5;
	    
	    for (Map.Entry<String, Integer> m : mySortedMap.entrySet()) {
		
		System.out.println(m.getKey() + " " + m.getValue());
		
		howManyResults--;
		
		if (howManyResults == 0) break;
		
	    }	    
	    
	}
	else {
	    throw new IOException("wrong command");
	}
	

    }  
    
    public static Map<String, Integer> longestLines(String fileName) throws IOException {
	
	if (fileName == null || fileName.isEmpty()) {
	    throw new IOException("file not specified");
	}
	
	Path path = Paths.get(fileName);
	
	if (Files.notExists(path)) {
	    throw new IOException("file not found");
	}
	
	BufferedReader bfr = Files.newBufferedReader(path);
	String line;
	
	Map<String, Integer> map = new LinkedHashMap<>();
	
	while ((line = bfr.readLine()) != null) {
	    
	    int characters = line.trim().length();	    
	    
	    map.put(line, characters);
	}
	
	
	return map;
    }
    
    public static Map<String, Integer> sortItDesc(Map<String, Integer> myMap) {
	
	if (myMap == null || myMap.isEmpty()) {
	    return null;
	}
	
	Map<String, Integer> sortedMap = new LinkedHashMap<>();
	
	List<Map.Entry<String, Integer>> list = new LinkedList<>(myMap.entrySet());
	
	Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

	    @Override
	    public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
		
		return arg1.getValue().compareTo(arg0.getValue());
	    }	   
	    
	});
	
	for (Map.Entry<String, Integer> item : list) {	    
	    sortedMap.put(item.getKey(), item.getValue());	    
	}	
	
	return sortedMap;
    }
    
   
    
    
     

}

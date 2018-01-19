package resource;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class LongestLineInFileTest {

    String[] command;
    String file;
    String file2 = "";
    String fileCorrect = "test1.txt";
    String[] correct = new String[] {"test1.txt"};
    Map<String, Integer> map;
    Map<String, Integer> mapEmpty = new HashMap<>();  
    Map<String, Integer> mapCorrect;    
    
    @Before
    public void setUp() throws Exception {
	
	mapCorrect = new HashMap<>();
	
	mapCorrect.put("Alfa", 17);
	mapCorrect.put("Gama", 20);
	mapCorrect.put("Beta", 15);
	
    }

    @Test(expected = IOException.class)
    public void mainTestMore() throws IOException {
	command = new String[] {"hey", "baby"};
	LongestLineInFile.main(command);	
    }
    
    @Test(expected = IOException.class)
    public void mainTestEmpty() throws IOException {
	command = new String[] {""};
	LongestLineInFile.main(command);	
    }
    
    @Test(expected = IOException.class)
    public void mainTestNull() throws IOException {	
	LongestLineInFile.main(command);	
    }
    
    @Test(expected = IOException.class)
    public void longestLinesTestNull() throws IOException {	
	
	LongestLineInFile.longestLines(file);
	
    }
    
    @Test(expected = IOException.class)
    public void longestLinesTestEmpty() throws IOException {	
	
	LongestLineInFile.longestLines(file2);
	
    }
    
    @Test(expected = IOException.class)
    public void longestLinesTestNotExists() throws IOException {	
	
	LongestLineInFile.longestLines(file2);	
	
    }
    
    @Test
    public void longestLinesTestCorrect() throws IOException {	
	
	assertTrue(!LongestLineInFile.longestLines(fileCorrect).isEmpty());	
	
    }
    
    @Test
    public void mainTestCorrect() throws IOException {	
	LongestLineInFile.main(correct);	
    }
    
    @Test
    public void sortItDescTestNull() throws IOException {	
	
	assertNull(LongestLineInFile.sortItDesc(map));	
    }
    
    @Test
    public void sortItDescTestEmpty() throws IOException {	
	
	assertNull(LongestLineInFile.sortItDesc(mapEmpty));	
    }
    
    @Test
    public void sortItDescTestCorrectOrder() throws IOException {
		
	Map<String, Integer> map = LongestLineInFile.sortItDesc(mapCorrect);
	
	List<String> list = new LinkedList<>(map.keySet());
	
	assertEquals("Gama", list.get(0));
	assertEquals(new Integer(20), map.get("Gama"));
	
	assertEquals("Alfa", list.get(1));
	assertEquals(new Integer(17), map.get("Alfa"));
	
	assertEquals("Beta", list.get(2));
	assertEquals(new Integer(15), map.get("Beta"));
    }
    
    

}

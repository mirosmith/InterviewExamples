package resource;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class FindDuplicatesInFileTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void readAndCountFromFileTestExists() {
	
	Map<String,Integer> map = FindDuplicatesInFile.readAndCountFromFile("test1.txt");
	
	assertFalse(map.isEmpty());
	
    }
    
    @Test
    public void readAndCountFromFileTestNotExists() {
	
	Map<String,Integer> map = FindDuplicatesInFile.readAndCountFromFile("test1.t");
	
	assertTrue(map.isEmpty());
	
    }

}

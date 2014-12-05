
import org.junit.*;

import static org.junit.Assert.*;

public class ConsoleTest {
	
	  @Test
	  public void set_then_get_prompt() {
	    	Console console = new Console();
	    	console.setPrompt("H");
	    	assertEquals("H",console.getPrompt());
	    }
	  
	  @Test
	  public void read_from_console() {
		  
		  ConsoleStub consoleStub = new ConsoleStub();
		  String line = consoleStub.readLineFromConsole();
		  assertNotNull(line);
		  assertTrue(line.length() > 0 );
		  
	  }
	

}

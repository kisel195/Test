import java.io.*;

public class Main {
		
	public static void main(String[] args) {
		
		/*try(FileReader reader = new FileReader("C:\\data.txt")) {
	    int temp;
	    	while((temp = reader.read()) != -1) {   
	    		System.out.print((char)temp);
	    	} 
	    }
	    
	    catch(IOException ex) {
	    	System.out.println(ex.getMessage());
	    }*/
		
		
		GetCommand getCommand = new GetCommand();
		getCommand.menu();
    }
	
	
}
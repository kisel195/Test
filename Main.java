import java.io.*;

public class Main {
		
	public static void main(String[] args) {
		
		/*FileReader fr = new FileReader("D:/text.txt");
		Scanner sc = new Scanner(fr);
		Scanner scr;
		sc.useDelimiter(", *");
		ArrayList<Item> Items = new ArrayList<Item>();
		for(int i = 0 ;sc.hasNext(); i++){
		    s = sc.nextLine();
		    scr = new Scanner(s);
		    scr.useDelimiter(", *");
		    for(int j = 0 ;scr.hasNext(); j++){
			    a1.add(scr.nextInt());
			    if (scr.hasNext()) a2.add(scr.nextInt());   }
		}*/
		
		
		GetCommand getCommand = new GetCommand();
		getCommand.menu();
    }
	
	
}

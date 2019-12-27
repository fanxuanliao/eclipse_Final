package finalproject;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Arrays;

public class MainUnsettled {
	static movieUnsettled datain[] = setData();
	//public void main(String[] args) 
	public static void main(String[] args){
		// TODO Auto-generated method stub
		//movie datain[] = setData();
		
	}
	public static Boolean[] searchForGenre(String path) throws FileNotFoundException{
		Boolean [] result = new Boolean[11];
	    try {
	    File file = new File(path);
	    final Scanner scanner = new Scanner(file);
	    Arrays.fill(result, Boolean.FALSE);
	    String ACTION = "Action";
	    String ANIMATION ="Animation"; 
	    String CRIME ="Crime";
	    String HORROR = "Horror";
	    String SUSPENSE ="Suspense";
	    String THRILLER ="Thriller";
	    String DRAMA ="Drama";
	    String ADVENTURE = "Adventure";
	    String ROMANCE = "Romance";
	    String SCIFI = "Sci-fi";
	    String COMEDY = "Comedy";
	    String HISTORY = "History";
	    String MUSICAL = "Musical";
	    while (scanner.hasNextLine()) {
	    	   final String lineFromFile = scanner.nextLine();
	    	   if(lineFromFile.contains(ACTION)) { 
	    	       result[0] = true;
	    	   }
	    	   else if(lineFromFile.contains(ANIMATION)) {
	    		   result[1] = true;
	    	   }
	    	   else if(lineFromFile.contains(CRIME)) {
	    		   result[2] = true;
	    	   }
	    	   
	    	   else if(lineFromFile.contains(HORROR)||
	    			   lineFromFile.contains(SUSPENSE)||
	    			   lineFromFile.contains(THRILLER)) {
	    		   result[3] = true;
	    	   }
	    	   else if(lineFromFile.contains(DRAMA)) {
	    		   result[4] = true;
	    	   }
	    	   else if(lineFromFile.contains(ADVENTURE)) {
	    		   result[5] = true;
	    	   }
	    	   else if(lineFromFile.contains(ROMANCE)) {
	    		   result[6] = true;
	    	   }
	    	   else if(lineFromFile.contains(SCIFI)) {
	    		   result[7] = true;
	    	   }
	    	   else if(lineFromFile.contains(COMEDY)) {
	    		   result[8] = true;
	    	   }
	    	   else if(lineFromFile.contains(HISTORY)) {
	    		   result[9] = true;
	    	   }
	    	   else if(lineFromFile.contains(MUSICAL)) {
	    		   result[10] = true;
	    	   }
	    	}
	    scanner.close();
	    }catch (FileNotFoundException fie){
	    	System.out.println("file not found exception.");
	    }
	    return result;
	}
	public static String searchForName(String path) throws FileNotFoundException{
	    try {
	    	File file = new File(path);
	    	final Scanner scanner = new Scanner(file);
	    	String result = scanner.nextLine();
	    	scanner.close();
	    	return result;
	    }catch (FileNotFoundException fie){
	    	System.out.println("file not found exception.");
	    	String result = "Error: Can't fetch name";
	    	return result;
	    }
	    
	}
	
	public static movieUnsettled[] setData(){
		
		movieUnsettled[] allData;
		allData = new movieUnsettled[55];
		for(int i=1;i<=55;i++)
		{
			try
			{
				String genreSrc = "src/genre/" + i + ".txt";
				Boolean [] genreTable = searchForGenre(genreSrc);
				String nameSrc = "src/name/" + i + ".txt";
				String NAME = searchForName(nameSrc);
				String order = Integer.toString(i);
				movieUnsettled datain = new movieUnsettled(NAME, order, genreTable);
				allData[i] = datain;
				System.out.println(datain.name);
//Why no output!!!				//System.out.println(allData[i].name);
			}
		
			catch(IOException IO)
			{
				System.out.println(IO);
			}
		}
		//for(int i=1; i<=55;i++) {
			//System.out.println(allData[i].name);
		//}
		return allData;
	}
}

package finalproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class movieUnsettled {
	movieUnsettled(){		
	this.name = "defalt";
	En = false;
	Eu = false;
	Ch = false;
	other = false;

	ty01 = false;
	ty02 = false;
	ty03 = false;
	ty04 = false;
	ty05 = false;
	ty06 = false;
	ty07 = false;
	ty08 = false;
	ty09 = false;
	ty10 = false;
	ty11 = false;

	};
	
	movieUnsettled(String name, String i,Boolean genre[]) throws IOException{
		this.name = name;
		this.prize = 300.0;
		ty01 = genre[0];
		ty02 = genre[1];
		ty03 = genre[2];
		ty04 = genre[3];
		ty05 = genre[4];
		ty06 = genre[5];
		ty07 = genre[6];
		ty08 = genre[7];
		ty09 = genre[8];
		ty10 = genre[9];
		ty11 = genre[10];
		//System.out.print(this.name +' ');
		//System.out.print(this.ty01 );
		//System.out.print(this.ty02 );
		//System.out.print(this.ty03 );
		//System.out.print(this.ty04 );
		//System.out.print(this.ty05 );
		//System.out.print(this.ty06 );
		//System.out.print(this.ty07 );
		//System.out.print(this.ty08 );
		//System.out.print(this.ty09 );
		//System.out.print(this.ty10 );
		//System.out.println(this.ty11 );
		FileReader fr = new FileReader("src/intro/" + i + ".txt");
		BufferedReader br = new BufferedReader(fr);
		while (br.ready())
		{
			//System.out.println(br.readLine());
		}
		
		fr.close();
	}
	//movie contribute
	String name;
	String photo;
	
	boolean En;
	boolean Eu;
	boolean Ch;
	boolean other;
	
	boolean ty01;
	boolean ty02;
	boolean ty03;
	boolean ty04;
	boolean ty05;
	boolean ty06;
	boolean ty07;
	boolean ty08;
	boolean ty09;
	boolean ty10;
	boolean ty11;


	double prize;
} 

import java.io.*;
import java.util.*;
class TextHandling{
	public static void main(String[] args) throws FileNotFoundException{
		try{
	        File f=new File("C:/Users/DK Sharma/Desktop/Java Programs/TextHandlingFile.txt");
		    FileWriter file=new FileWriter(f);
	        BufferedWriter bw = new BufferedWriter(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          	System.out.print("Enter Serial No.- ");
        	String sr=br.readLine();
         	System.out.print("Enter First Name- ");
        	String fn=br.readLine();
         	System.out.print("Enter CGPA- ");
         	String cgpa=br.readLine();
        	System.out.print("Enter Grade- ");
        	String g=br.readLine();
			
	    	bw.write(sr);
	    	bw.write(",");
	    	bw.write(fn);
	    	bw.write(",");
	    	bw.write(cgpa);
	    	bw.write(",");
	    	bw.write(g);
	    	bw.newLine();

			System.out.println();
			System.out.println("Written in txt file");
			System.out.println("Serial No.: "+sr);
			System.out.println("First Name: "+fn);
			System.out.println("CGPA: "+ cgpa);
			System.out.println("Grade: "+g);
	     	bw.close();
			br.close();
 		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
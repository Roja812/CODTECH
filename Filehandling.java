// File Handling.
//File Handling in Java
package filehandling;
// importing Packages
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
// Creating class named Main
public class Main {
	public static void main(String[] args) { // main class
		File file=new File("example.txt"); // using file package creating a text file named as example.txt
		try { // try and catch block to avoid basic errors of file handling
	    if(file.createNewFile()){ // calling method and using if clause to check file already exit or not
	    	System.out.println("File Sucessfully "+file.getName()); // getname() to get the file name
	    }
	    else { // if the file already exits then it print else clause
	    	System.out.println("File already Exits");
	    }	
		}
	    catch(Exception e) { // exception and e variable
	    	System.out.println("Error!");
	    }
		// Writing in the file
		try {
			FileWriter fr =new FileWriter("example.txt"); //using file writer as default to make efficient
			BufferedWriter br=new BufferedWriter(fr);// using bufferwriter to write dynamically 
			br.write("Hello");
			br.newLine(); // for new line call this method
			br.write("Hey Hi this is Rose");
			System.out.println("Written in file Sucessfully");// printing if wrote successfully
			br.close();// closing file
		}
		catch(Exception er) {
			System.out.print("Error! Writing in the File!"); // if any error occurs in Writing in file
		}
		
		try {
			FileReader fileread=new FileReader("example.txt"); // for reading the file calling reading package
			BufferedReader bufread=new BufferedReader(fileread); // for dynamic reading
			String line=bufread.readLine(); // calling read line method
		    while(line != null){ // using for loop to read all the content in the file
				System.out.println(line);
				line=bufread.readLine();
			}
		    System.out.println("File Read Sucessfully"); // if read successfully
		    bufread.close(); // closing file
		}
		catch(Exception e) {
			System.out.println("Error! at reading the file");
		}
		
		try { // to append and update in the file
			FileWriter fr =new FileWriter("example.txt",true); // using true to get all the old and new contents
			fr.write("\nThis Will append the New Hellloo");
			System.out.println("Updated in file Sucessfully");
			fr.close();
		}
		catch(Exception e) {
			System.out.print("Error! in updating the file");
		}
		
		// deleteing the file
		try {
			FileWriter file2=new FileWriter("output.txt"); // Creating another file to delete
			file2.write("This is the second file");
			file2.close(); 
			
			File filedelete = new File("output.txt");
			filedelete.delete(); // deleting method to delete the file
			System.out.println("File deleted succesfully");
	}
		catch(Exception e) {
			System.out.println("Error! in Deleting the file");
		}
	
	   
}

}

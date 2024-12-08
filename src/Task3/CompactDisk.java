
package Task3;
import java.util.Scanner;
 import java.io.*; 
/** 
This program creates a list of songs for a CD 
by reading from a file. 
*/ 
public class CompactDisk { 
public static void main(String[] args)throws IOException { 
Scanner input = new Scanner(new File("Classics.txt"));
String title; 
String artist; 

// ADD LINES FOR TASK #3 HERE 
// Declare an array of Song objects, called cd, // with a size of 6 
Song[] cd = new Song[6]; 
        
        // Fill the array with songs
        for (int i = 0; i < cd.length; i++) {
            title = input.nextLine(); 
            artist = input.nextLine(); 
            cd[i] = new Song(title, artist); 
        } 
        input.close();

// ADD LINES FOR TASK #3 HERE 
// Print the contents of the array to the console 
System.out.println("Contents of Classics:");
        for (Song song : cd) {
            System.out.println(song); 
        }
    }
} 

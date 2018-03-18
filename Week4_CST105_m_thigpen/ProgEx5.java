
/**Program: ProgEx5
 *File: ProgEx5.java
 *Summary: Prints vertical output form a 20 x 45 array to the console.
 *Author: Mercedes Thigpen
 *Date: March 18, 2018
 **/
package ProgEx5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgEx5 {  
    public static void main(String[] args) {  // start of the main method
		String wordFile = "";
		char[][] textArray;
		
		try {  try ( // reads the text from the file
                        BufferedReader mt = new BufferedReader(new FileReader("C:/Users/mthigpen/Desktop/ProgrammingExercise5.txt"))) {
                    String file;
                    
                    while((file = mt.readLine()) != null){  //tells System to print nothing if unable to read file
                        wordFile += file;
                        
                        System.out.println(wordFile);//Prints text from file to the console
                    }  
                        }
		    }  
                catch (IOException e) {
                    		}
		textArray = LoadArray(wordFile);
		
		arrayOutput(textArray);// The output of the array is the columns
    
	      
     }  // end of the main method

    public static char[][] LoadArray(String wordFile){
        // Elements from the file are loaded into the new array
		char[][] gettysburg = new char[20][45];// 20 row and 45 columns
		int count = 0;
		
		for (int i = 0; i < 20; i++){ 
                    
			for (int j = 0; j < 45; j++){ 
                            
				if (count < wordFile.length()){
                                    
					gettysburg[i][j] = wordFile.charAt(count);
                                        
					count++;
				} 
                                else { gettysburg[i][j] = '@';  // new element for empty spaces in the array
				} 
			}  
		}  
                        return gettysburg;  //2D array is formed
	}  
   
	private static void arrayOutput(char[][] gettysburg) {  //Array now reads columns top to bottom
		StringBuilder columnRead;  
        columnRead = new StringBuilder();
		
		for (int i = 0; i < 45; i++){
                    //arranges columns
			for (int j = 0; j < 20; j++){
                            // arranges rows
   			   columnRead.append(gettysburg[j][i]);
			}  
		}  
                
		System.out.println(columnRead);  // Prints out elements from array by column, top to bottom
	}        
} // end program
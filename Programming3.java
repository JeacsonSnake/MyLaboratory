// Enter Student number here

// Do Not Remove these
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
//Do Not remove above

import java.util.Scanner;

public class Programming3 {
    public static void main(String [] args) {

        /*
            This line will use the methods provided below to get all 
            the words from the dictionary.txt file that is >= 8 Characters long. 
            It will then return a word from that List to wordToGuess as your 
            word for the game.
        */
        String wordToGuess = getRandomWord();
 
        char lineine[] = new char[wordToGuess.length()];
        for (int i = 0 ;i<wordToGuess.length();i++)
        {
        	lineine[i] = '_';
        }
        
        char word[] = new char[wordToGuess.length()];
        for (int i = 0 ;i<wordToGuess.length();i++)
        {
        	word[i] = wordToGuess.charAt(i);
        }
        Scanner sc = new Scanner (System.in);
        int live = 8;
        System.out.println(wordToGuess);
        while (live>0)
        {
        	for (int i = 0 ;i<wordToGuess.length();i++)
            {
        		System.out.print(lineine[i]+" ");
            }
        	System.out.println();
        	if(live==1) {
        		System.out.println("You only have "+live +" live left!");
        	}
        	else {
        		System.out.println("You still have "+live +" lives left!");
        	}
            System.out.println();
            System.out.println("(You can guess one letter or whole word.)");
        	String a = sc .next();
            
        	live=Integer.parseInt(guess(a,wordToGuess,lineine,live,word));
        	
        }
        if(live<=0)
        {
        	System.out.println("Lives out! Game over!");
        }
        sc.close();
    }
    
    
    public static String guess(String a,String wordToGuess,char lineine[],int live,char word[]) {
		
    	if (a.length()>1)
		{
            if (a.matches(wordToGuess))
		{
			System.out.println("You win! The word is "+wordToGuess+" !");
			System.exit(1);
		}
			else
            {
                System.out.println("WRONG! Game over!");
                System.exit(1);
            }
		}
		else if (wordToGuess.matches("a"))
		{
			char c = a.charAt(0);
			for (int i = 0;i<wordToGuess.length();i++)
			{
				if(word[i]==c)
				{
					lineine[i]=c;
				}
				
			}
			int ss=0;
			for (int i = 0;i<wordToGuess.length();i++)
			{
				if(lineine[i]==word[i])
				{
					ss++;
				}
				
			}
			if (ss==wordToGuess.length())
			{
				System.out.println("You win! The word is "+wordToGuess+" !");
				System.exit(1);
			}
			
		}
		else
		{
			live--;
		}
    	String live2 = Integer.toString(live);
    	return live2;
	}
    
    
    
    /** --------------------------------------- **/
    /** DO NOT CHANGE ANYTHING IN THESE METHODS **/
    /** --------------------------------------- **/
    public static String [] wordsReader(){
        //Path to file to read in
        String myfile = "D:\\学习文件\\大一下\\计算机科学导论\\Lab3\\dictionary.txt";
        //Create an ArrayList (a dynamic type of Array)
        ArrayList <String> lines = new ArrayList <String>();
        try{
            // try to read in the File
            BufferedReader abc = new BufferedReader(new FileReader(myfile));

            String line;
            while((line = abc.readLine()) != null) {
                //If words length greater than 8 keep it otherwise discard it 
                if(line.length() > 8){
                    lines.add(line);
                }
            }
            abc.close();
        }
        catch(FileNotFoundException ex) {
            //If the File is not found print to screen
            System.out.println(
                "Unable to open file '" + 
                myfile + "'");                
        }
        catch(IOException ex) {
            //If file is corrupted print to screen
            System.out.println(
                "Error reading file '" 
                + myfile + "'");                  
        }
        //Convert from ArrayList to Array
        return lines.toArray(new String[]{});
    }

    public static String getRandomWord(){
        // Return a random word from the list
        String [] words = wordsReader();
        int len = words.length;
        Random rand = new Random();
        int x = rand.nextInt(len);
        return words[x];
    }
    /** ------------------------------------------ **/
    /** DO NOT CHANGE ANYTHING IN THE METHODS ABOVE **/
    /** ------------------------------------------ **/
    
    
    
}
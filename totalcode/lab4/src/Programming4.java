// Enter Student number here

// Do Not Remove these
import java.io.*;
import java.util.*;
//Do Not remove above



public class Programming4 {

   static String[] Pattern = {
        ".*public class.*",
        ".*void main\\(String \\[\\] args\\).*",
        ".*for\\(.*;.*;.*\\).*",
        ".*%.*",
        ".*System\\.out\\.print.*"

    } ;
    public static void main(String [] args) {
     
        String prefix = "Student";
        String suffix = ".java";
        for (int i=1;i<=4;i++)
        {
            String filename = ".\\forprogramming4\\"+prefix + i + suffix;
            String [] code = codeReader(filename);  // Pass filename into the codeReader method here
            mark (code,i);
        }
    }


    private static void mark(String [] code,int p) {
        
        int mark=0;
        StringBuilder b=new StringBuilder();
        for (int i = 0; i <code.length; i++) {
            b.append(code[i]);
        }
        String s=b.toString();
        //System.out.println(s);
        for (int i = 0; i < Pattern.length; i++) {
            if (s.matches(Pattern[i])){
                mark+=10;
            }
        }
        System.out.println("The mark of Student"+p+" is "+mark);
    }
    /** --------------------------------------- **/
    /** DO NOT CHANGE ANYTHING IN THESE METHODS **/
    /** --------------------------------------- **/
    public static String [] codeReader(String fileName){
        //Path to file to read in
        String myfile = fileName;
        //Create an ArrayList (a dynamic type of Array)
        ArrayList <String> lines = new ArrayList <String>();
        try{
            // try to read in the File
            BufferedReader abc = new BufferedReader(new FileReader(myfile));

            String line;
            while((line = abc.readLine()) != null) {
                lines.add(line);
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
    /** ------------------------------------------ **/
    /** DO NOT CHANGE ANYTHING IN THE METHODS ABOVE **/
    /** ------------------------------------------ **/
}

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SortMovi2e {
	public static void main(String[] args){
		System.out.println("if you want to rank by rating from lowest to \r\n" + 
				"highest,please intput 1");
		System.out.println("if you want to rank by rating from highest to \r\n" + 
				"lowhest,please intput 2");
		System.out.println("if you want to rank by moviesname from lowest to \r\n" + 
				"highest,please intput 3");
		System.out.println("if you want to rank by releaseyear from lowest to \r\n" + 
				"highest,please intput 4");
		System.out.println("if you want to rank by releaseyear from highest to \r\n" + 
				"lowest,please intput 5");
		String[] M = moviesReader(); 
		Movie[] m = new Movie[M.length];
		int n[] = new int[247];
		String x[] = new String[247];
		double y[]=new double[247];
		 for(int i=0;i<M.length;i++) {
			 String h[]=M[i].split(",");
			 m [i] = new Movie(Double.valueOf(h[0]),h[1],Integer.parseInt(h[2]));
			 //n[i]=m[i].getReleaseYear();
			 //x[i]=m[i].getMovieName();
			 //y[i]=m[i].getRating(); 
		 }
		 Scanner sc=new Scanner(System.in);
		 if(sc.next()=="1") {
			 m=rating1(/*y,*/m);
		 }
		 if(sc.next()=="2") {
			 rating2(y,m);
		 }
		 if(sc.next()=="3") {
			 movieName(x,m);
		 }
		 if(sc.next()=="4") {
			 releaseYear1(n,m);
		 }
		 if(sc.next()=="5") {
			 releaseYear2(n,m);
		 }
		 System.out.println(m);
	}
	 public static String [] moviesReader(){
		 String myfile = "Movies.txt";
		 ArrayList <String> lines = new ArrayList <String>();
	        try{
	            BufferedReader abc = new BufferedReader(new FileReader(myfile));
	            String line;
	            while((line = abc.readLine()) != null) {
	                if(line.length() > 8){
	                    lines.add(line);
	                }
	            }
	            abc.close();
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                myfile + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + myfile + "'");                  
	        }
	        return lines.toArray(new String[]{});
	 }
	 public static Movie[] rating1(/*double n[],*/Movie[] m) {
		/* for(int pass=1;pass<n.length;pass++) {
			 for(int j=0;j<n.length-pass;j++) {
				 if(n[j]>n[j+1]) {
					 double temp=n[j];
					 n[j]=n[j+1];
					 n[j+1]=temp;
					 Movie t=m[j];
					 m[j]=m[j+1];
					 m[j+1]=t;
				 }
			 }
		 }
		 for(int i=0;i<m.length;i++) {
			 m[i].printMovieDetails();
		 }*/
		 for(int i =0;i<m.length-1;i++)
		 {
			 for (int j = 0;j<m.length-i-1;j++)
			 {
				 if (m[j].getRating()>m[j+1].getRating())
				 {
					 Movie t=m[j];
					 m[j]=m[j+1];
					 m[j+1]=t;
				 }
			 }
		 }
		 System.out.println("fff");
		 return m;
	 }
		 public static void movieName(String n[],Movie[] m) {
			 for(int pass=1;pass<n.length;pass++) {
				 for(int j=0;j<n.length-pass;j++) {
					 if(n[j].compareTo(n[j+1])>0) {
						 String temp=n[j];
						 n[j]=n[j+1];
						 n[j+1]=temp;
						 Movie t=m[j];
						 m[j]=m[j+1];
						 m[j+1]=t;
					 }
				 }
			 }
			 for(int i=0;i<m.length;i++) {
				 m[i].printMovieDetails();
			 }
	 }
		 public static void releaseYear1(int n[],Movie[] m) {
			 for(int pass=1;pass<n.length;pass++) {
				 for(int j=0;j<n.length-pass;j++) {
					 if(n[j]>n[j+1]) {
						 int temp=n[j];
						 n[j]=n[j+1];
						 n[j+1]=temp;
						 Movie t=m[j];
						 m[j]=m[j+1];
						 m[j+1]=t;
					 }
				 }
			 }
			 for(int i=0;i<m.length;i++) {
				 m[i].printMovieDetails();//;
			 }
		 }	 
		 public static void releaseYear2(int n[],Movie[] m) {
			for(int pass=1;pass<n.length;pass++) {
				for(int j=0;j<n.length-pass;j++) {
					if(n[j]<n[j+1]) {
					 int temp=n[j];
						n[j]=n[j+1];
						n[j+1]=temp;
						Movie t=m[j];
					    m[j]=m[j+1];
						m[j+1]=t;
					}
				}
			}
			for(int i=0;i<m.length;i++) {
				m[i].printMovieDetails();
			}
		}
		 public static void rating2(double n[],Movie[] m) {
			 for(int pass=1;pass<n.length;pass++) {
				 for(int j=0;j<n.length-pass;j++) {
					 if(n[j]<n[j+1]) {
						 double temp=n[j];
						 n[j]=n[j+1];
						 n[j+1]=temp;
						 Movie t=m[j];
						 m[j]=m[j+1];
						 m[j+1]=t;
					 }
				 }
			 }
			 for(int i=0;i<m.length;i++) {
				 m[i].printMovieDetails();
			 }
		 } 
}

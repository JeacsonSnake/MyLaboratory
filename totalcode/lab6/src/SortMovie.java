
import java.io.*;
import java.util.*;


public class SortMovie {
    public static void main(String[] args) {
        String[] movies = moviesReader() ;
        Movie[] Movies = new Movie[movies.length];
        for(int i = 0;i < movies.length;i++){
            String Split[] = movies[i].split(",");
            Movies[i] = new Movie(Double.valueOf(Split[0]),Split[1],Integer.parseInt(Split[2]));
        }
        System.out.println(" How will you sort the Movie Array From"+ 
        "Highest to Lowest or Lowest to "+
        "Highest based on movieName, releaseYear, or rating? ");
        System.out.println(" sort the Movie Array From"+ 
        " Highest to Lowest based on movieName : 1");
        System.out.println(" sort the Movie Array From"+ 
        " Lowest to Highest based on movieName : 2");
        System.out.println(" sort the Movie Array From"+ 
        " Highest to Lowest based on releaseYear : 3");
        System.out.println(" sort the Movie Array From"+ 
        " Lowest to Highest based on releaseYear : 4");
        System.out.println(" sort the Movie Array From"+ 
        " Highest to Lowest based on rating : 5");
        System.out.println(" sort the Movie Array From"+ 
        " Lowest to Highest based on rating : 6");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==1){
            Movies = namegdd(Movies);
        }
        else if (n==2){
            Movies = nameddg(Movies);
        }
        else if (n==3){
            Movies = yeargdd(Movies);
        }
        else if (n==4){
            Movies = yearddg(Movies);
        }
        else if (n==5){
            Movies = ratinggdd(Movies);
        }
        else if (n==6){
            Movies = ratingddg(Movies);
        }

        for (int i = 0; i<Movies.length;i++)
        {
            System.out.println(Movies[i].printMovieDetails());
        }
        sc.close();
    }

    public static Movie[] yeargdd(Movie[] Movies){
        for (int i = 0;i<Movies.length-1;i++)
        {
            for (int j = 0;j<Movies.length-i-1;j++)
            {
                if(Movies[j].getReleaseYear() < Movies[j+1].getReleaseYear())
                {
                    Movie cup = Movies[j];
                    Movies[j] = Movies[j+1];
                    Movies[j+1] = cup;
                }
            }
        }
        return Movies;

    }

    public static Movie[] yearddg(Movie[] Movies){
        for (int i = 0;i<Movies.length-1;i++)
        {
            for (int j = 0;j<Movies.length-i-1;j++)
            {
                if(Movies[j].getReleaseYear() > Movies[j+1].getReleaseYear())
                {
                    Movie cup = Movies[j];
                    Movies[j] = Movies[j+1];
                    Movies[j+1] = cup;
                }
            }
        }
        return Movies;

    }

    public static Movie[] ratinggdd(Movie[] Movies){
        for (int i = 0;i<Movies.length-1;i++)
        {
            for (int j = 0;j<Movies.length-i-1;j++)
            {
                if(Movies[j].getRating() < Movies[j+1].getRating())
                {
                    Movie cup = Movies[j];
                    Movies[j] = Movies[j+1];
                    Movies[j+1] = cup;
                }
            }
        }
        return Movies;

    }
    
    public static Movie[] ratingddg(Movie[] Movies){
        for (int i = 0;i<Movies.length-1;i++)
        {
            for (int j = 0;j<Movies.length-i-1;j++)
            {
                if(Movies[j].getReleaseYear() > Movies[j+1].getReleaseYear())
                {
                    Movie cup = Movies[j];
                    Movies[j] = Movies[j+1];
                    Movies[j+1] = cup;
                }
            }
        }
        return Movies;

    }

    public static Movie[] namegdd(Movie[] Movies){
        for (int i = 0;i<Movies.length-1;i++)
        {
            for (int j = 0;j<Movies.length-i-1;j++)
            {
                if((Movies[j].getMovieName().compareTo(Movies[j+1].getMovieName()))<0)
                {
                    Movie cup = Movies[j];
                    Movies[j] = Movies[j+1];
                    Movies[j+1] = cup;
                }
            }
        }
        return Movies;

    }

    public static Movie[] nameddg(Movie[] Movies){
        for (int i = 0;i<Movies.length-1;i++)
        {
            for (int j = 0;j<Movies.length-i-1;j++)
            {
                if((Movies[j].getMovieName().compareTo(Movies[j+1].getMovieName()))>0)
                {
                    Movie cup = Movies[j];
                    Movies[j] = Movies[j+1];
                    Movies[j+1] = cup;
                }
            }
        }
        return Movies;

    }
    
    public static String[] moviesReader(){
        String myfile = "Movies.txt";
        ArrayList <String> lines = new ArrayList <String> ();

        try {
            BufferedReader hello = new BufferedReader(new InputStreamReader(new FileInputStream(myfile),"UTF-8"));
            String line;
            try {
                while ((line = hello.readLine()) != null)
                {
                    if (line.length() > 8){
                        lines.add(line);
                    }
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                hello.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } 
        catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return lines.toArray(new String[]{});
    }
}

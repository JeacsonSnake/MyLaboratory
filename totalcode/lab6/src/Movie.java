public class Movie{
	
	//Attributes
	private String movieName;
	private int releaseYear;
	private double rating;
	private final int CURRENTYEAR = 2019;

	//Default Constructor
	public Movie(){
		this.movieName = "Film";
		this.releaseYear = 2019;
		this.rating = 0.0;

	}

	//General Constructor
	public Movie(double rating,String movieName, int releaseYear){
		this.movieName = movieName;
		if(releaseYear <= CURRENTYEAR){
			this.releaseYear = releaseYear;
		}
		else{
			this.releaseYear = CURRENTYEAR;
		}
		this.rating = rating;

	}

	//Getter Methods
	public String getMovieName(){
		return movieName;
	}

	public int getReleaseYear(){
		return releaseYear;
	}

	public double getRating(){
		return rating;
	}


	//Setter Methods
	public void setMovieName(String movieName){
		this.movieName = movieName;
	}

	public void setReleaseYear(int releaseYear){
		if(releaseYear <= CURRENTYEAR){
			this.releaseYear = releaseYear;
		}
		else{
			this.releaseYear = CURRENTYEAR;
		}
	}

	public void setRating(double rating){
		this.rating = rating;
	}

	//Functionality
	public String printMovieDetails()
	{
		String details = "Movie Name: " + movieName;
		details += "\nRelease Year: " + releaseYear;
		details += "\nRating: " + rating;		
		return details;
	}
}
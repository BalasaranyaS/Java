package lab3;

public class Movie {
    public static int movieCount = 0;
    private String movieID;
    String movieName;
    String producedBy;
    String directedBy;
    int duration;
    int year;
    String category;

    public String getMovieID() {
        return movieID;
    }

    public Movie(String movieName, String producedBy) {
        this.movieName = movieName;
        this.producedBy = producedBy;
//        movieCount++;
        this.movieID = movieName + "_" + (++movieCount);
    }

    //    public void setMovieID( String movieName ,int movieCount){
//        System.out.println("movieID"+”movieName” + ”_” + movieCount;);
//    }
    public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {

        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public void MovieInfo() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Produced By: " + producedBy);
        if (directedBy != null) {
            System.out.println("Directed By: " + directedBy);
        }
        if (duration > 0) {
            System.out.println("Duration: " + duration + " minutes");
        }
        if (year > 0) {
            System.out.println("Year: " + year);
        }
        if (category != null) {
            System.out.println("Category: " + category);
        }
    }

    public void showDetails() {
        System.out.println("The movie " + movieName + " produced by " + producedBy + " and directed by " + directedBy + " is a " +
                duration + " mins long movie, and it was released in the year " + year + " The movie falls in " + category + " category.");
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Atlee", "Arya");
        movie1.MovieInfo();

        InternationalMovie movie3 = new InternationalMovie("petta", "rajini", "vijay", 150, 2019, "drama", "JBL", "Filters");
        movie3.displayInfo();
        movie3.showDetails();
        Movie movie2 = new Movie("Bahubali", "RajaMouli");
        System.out.println("Movies count " + movieCount);
        System.out.println(movie1.getMovieID());
        System.out.println(movie2.getMovieID());


        Movie[] movies = new Movie[3];

        // Populate the array with different t
        movies[0] = new Movie("Inception", "Nolan");
        movies[1] = new SpecialMovie("The Matrix ", "Wachowskis", "raja", 145, 2018, "horror", "JBL", "LCD");
        movies[2] = new InternationalMovie("Crouching Tiger, Hidden Dragon", "Ram", "Ang Lee", 160, 2015, "Drama", "India", "Eng");

        // Display details of each movie
        for (Movie movie : movies) {
            movie.showDetails();
            System.out.println();
        }
        //Traverse the array and call showDetails() on each object
        for (int i = 0; i < movies.length; i++) {
            movies[i].showDetails();
            System.out.println(); // Just for spacing
        }
        for (int i = 0; i < movies.length; i++) {
            if (movies[i] instanceof SpecialMovie) {
                SpecialMovie specialMovie = (SpecialMovie) movies[i];
                specialMovie.showDetails(); // Example of a method specific to SpecialMovie
            } else if (movies[i] instanceof InternationalMovie) {
                InternationalMovie internationalMovie = (InternationalMovie) movies[i];
                internationalMovie.showDetails(); // Example of a method specific to InternationalMovie
            }
        }
    }
}








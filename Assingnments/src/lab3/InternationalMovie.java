package lab3;

public class InternationalMovie extends Movie {
    String country;
    String language;


    public InternationalMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category, String country, String language) {
        super(movieName, producedBy, directedBy, duration, year, category);
    }
    public void displayInfo(){
        System.out.println("The country is "+ country);
        System.out.println("The language is "+ language);
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("The movie is released in "+language+" language and released in "+country);
    }
}

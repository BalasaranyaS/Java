package lab3;

public class SpecialMovie extends Movie{
    String techForSoundEffects="67ghj";
    String techForVisualEffects="hjk";



    public SpecialMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category, String techForSoundEffects, String techForVisualEffects) {
        super(movieName, producedBy, directedBy, duration, year, category);
    }
    public void displayInfo(){
        System.out.println("The technology used for Sound Effects is " + techForSoundEffects);
        System.out.println("The technology used for Visual Effects is " + techForVisualEffects);
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("The technologies used for Sound and Visual Effects are "+ techForSoundEffects +" and "+ techForVisualEffects);
    }
}

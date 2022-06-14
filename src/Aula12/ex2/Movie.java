package Aula12.ex2;

public class Movie {
    
    private String name, rating, genre;
    private float score;
    private int runningtime;

    public Movie(String name, float score, String rating, String genre, int runningtime){

        this.name = name;
        this.score= score;
        this.rating= rating;
        this.genre= genre;
        this.runningtime= runningtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRunningtime() {
        return runningtime;
    }

    public void setRunningtime(int runningtime) {
        this.runningtime = runningtime;
    }

    @Override
    public String toString() {
        return "Name=" + name + ", Score=" + score + ", Rating=" + rating + ", Genre=" + genre + ", Runningtime=" + runningtime + '}';
    }
}

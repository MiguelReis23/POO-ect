package Aula12.ex2;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;


public class ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        
        ArrayList<Movie> movies = new ArrayList<>();
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        try {
            movies = readMovies("src/Aula12/ex2/movies.txt");
    } catch (FileNotFoundException e) {
        System.out.println("File not found");
        System.exit(1);}
  
        System.out.println("----------------------------------------------------");
        System.out.println("Movie list by name:");
        //Separate the movies in lines
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i));
        }

        System.out.println("----------------------------------------------------");
        movies.sort(Comparator.comparing(Movie::getScore).reversed());
        System.out.println("Movie list by score:");
        //Separate the movies in lines
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i));
        }
       
        System.out.println("----------------------------------------------------");
        movies.sort(Comparator.comparing(Movie::getRunningtime));
        System.out.println("Movie list by running time:");
        //Separate the movies in lines
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i));
        }


        File selection= new File("src/Aula12/ex2/myselection.txt");
        String comedymovies="";
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getScore()>60 && movies.get(i).getGenre().toLowerCase().equals("comedy")){ 
                comedymovies+=movies.get(i).getName()+"\n";
                PrintWriter out = new PrintWriter(selection);
                out.print(comedymovies);
                out.close();
            }
        }
    }
    

    public static ArrayList<Movie> readMovies(String filename) throws FileNotFoundException {
        ArrayList<Movie> movies = new ArrayList<>();
        
        Scanner input = new Scanner(new FileReader(filename));
        input.nextLine();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] fields = line.split("\t");
            Movie newmovie = new Movie(fields[0], Float.parseFloat(fields[1]), fields[2], fields[3], Integer.parseInt(fields[4]));
            movies.add(newmovie);
        }

        movies.sort(Comparator.comparing(Movie::getName));
        return movies;
    }
}

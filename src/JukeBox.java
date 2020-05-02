import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
1. Implementing Comparable Interface
2. Custom comparator inner class and defining compare()
*/
class Song implements Comparable<Song> {
    // Class representing a Song
    String title;
    String movie;
    String composer;
    Song(String title, String movie, String composer){
        this.title = title;
        this.movie = movie;
        this.composer = composer;
    }
    public int compareTo(Song s){
        return title.compareTo(s.title);
    }
}

public class JukeBox {
    // Instance varibles
    ArrayList<Song> songList = new ArrayList<>();
    public static void main(String[] args){
        JukeBox j = new JukeBox();
        j.helper();
    }
    // Inner class that implements Comparator (implements compare method) and can be passed to Collections.sort as a
    // Comparator object
    class CompareByArtistName implements Comparator<Song> {
        public int compare(Song s1, Song s2){
            return s1.composer.compareTo(s2.composer);
        }
    }
    void helper(){
        readFromFile();
        System.out.println("Song List: ");
        for (Song s: songList) {
            System.out.println(s.title + " " + s.composer);
        }
        // Instantiate the class implementing comparator
        CompareByArtistName comp = new CompareByArtistName();
        Collections.sort(songList, comp);
        System.out.println("Song List: ");
        for (Song s: songList) {
            System.out.println(s.title + " ");
        }
    }
    void readFromFile(){
            // I/O
            String currDir = System.getProperty("user.dir");
            System.out.println("The current working directory is " + currDir);
            try {
                File file = new File("songs.txt");
                System.out.println("Absolute File Path: " + file.getAbsolutePath());
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = null;
                // Read line by line
                while ((line = br.readLine()) != null) {
                    appendSongs(line);
                }
            } catch (FileNotFoundException e){
                // Ok this was super annoying
            } catch (IOException e){
                // Ok this was super annoying again
            }
    }
    void appendSongs(String line){
        String[] tokens = line.split(",");
        songList.add(new Song(tokens[0], tokens[1], tokens[2]));
    }

}

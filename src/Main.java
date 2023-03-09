import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        filReader();
        extracted();
    }

    private static void filReader() {
        try {
            FileReader fileReader = new FileReader("song.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

        }catch (IOException s ){
            System.out.println(s.getMessage());
        }
    }

    private static void extracted() throws IOException {
        FileWriter fileWriter = new FileWriter("song.txt");
        fileWriter.write("Герой\n"+
                "А может еще встретимся с тобой ,\n"+
                "И ты подаришь мне любовь ,\n"+
                "Она мои звездны , мой покой ,\n"+
                "Я твой завоеватель ,твой герой ,\n"+
                "Знаю , признаю что сам не свой ,\n"+
                "А слезы текут рекой ,\n"+
                "Но разные пути так больно в груди,\n"+
                "Дотронуться б ее рукой .");
        fileWriter.close();
        Song song = new Song("Герой","Freeman996",fileWriter);
        System.out.println("Song: "+song.getTitle()+" Author: "+song.getAuthor());
    }

}
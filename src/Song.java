import java.io.FileWriter;

public class Song {
    private String title;
    private String author;
    private FileWriter text;

    public Song(String title, String author, FileWriter text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public FileWriter getText() {
        return text;
    }

    public void setText(FileWriter text) {
        this.text = text;
    }


}

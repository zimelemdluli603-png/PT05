
public class Book extends Item
{
    
    private String author;

    public Book()
    {
        super();
        this.author = "";
    }

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String toString()
    {
        return super.toString() + ", Author: " + author;
    }
}
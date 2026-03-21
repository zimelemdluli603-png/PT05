

public class Item
{
    private String title;
    private int year;
    public Item()
    {
        this.title = "";
        this.year = 0;
    }
    
    public Item(String title, int year)
    {
        this.title = title;
        this.year = year;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setYear(int year)
    {
        this.year = year;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    @Override
    public String toString() 
    {
        return "Title: " + title + ", Year: " + year;
    }

    
}
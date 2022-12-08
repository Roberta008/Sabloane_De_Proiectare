public class DocumentManager {
    private static DocumentManager d=null;
    private Book b;
    public static DocumentManager getInstance()
    {
        if(DocumentManager.d==null)
        {
            d=new DocumentManager();
        }
        return DocumentManager.d;
    }
    public Book getBook()
    {
        return this.b;
    }
    public void setBook(Book a)
    {
        this.b=a;
    }


}
import models.*;
import services.DocumentManager;

public class Main {

    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        Book b1=new Book("Cartea 1");
        b1.addContent(p1);
        b1.addContent(p2);
        DocumentManager dm=DocumentManager.getInstance();
        dm.setBook(b1);
        Printing();
    }

    private static void Printing() {
        DocumentManager.getInstance().getBook().print();
    }
}


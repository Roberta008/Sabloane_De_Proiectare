import java.util.ArrayList;
import java.util.List;

public class Book {
    private final String titluCartii;
    private final List<String> elementeleListei;

    public Book(String titlulCartii) {
        this.titluCartii = titlulCartii;
        this.elementeleListei = new ArrayList<>();
    }

    public void createNewParagraph(String elementCurent) {
        elementeleListei.add(elementCurent);
    }

    public void createNewImage(String elementCurent) {
        elementeleListei.add(elementCurent);
    }

    public void createNewTable(String elementCurent) {
        elementeleListei.add(elementCurent);
    }

    public void print() {
        System.out.println("Titlul cartii: " + titluCartii);
        for (String elementCurent : elementeleListei)
            System.out.println(elementCurent);


    }
}


import java.util.ArrayList;
import java.util.List;

public class Book {
    private final String titluCartii;
    private final List<String> elementeleListei;
    private Author numeleAutorului;
    private List<Chapter> listaCapitole;

    public Book(String titlulCartii) {
        this.titluCartii = titlulCartii;
        this.elementeleListei = new ArrayList<>();
        this.listaCapitole = new ArrayList<>();
    }

//    public void createNewParagraph(String elementCurent) {
//        elementeleListei.add(elementCurent);
//    }
//
//    public void createNewImage(String elementCurent) {
//        elementeleListei.add(elementCurent);
//    }
//
//    public void createNewTable(String elementCurent) {
//        elementeleListei.add(elementCurent);
//    }
//
//    public void print() {
//        System.out.println("Titlul cartii: " + titluCartii);
//        for (String elementCurent : elementeleListei)
//            System.out.println(elementCurent);
//    }

    public void addAuthor(Author autorul) {
        numeleAutorului = autorul;
    }

    public int createChapter(String numeleCapitolului) {

        Chapter capitolCurent = new Chapter(numeleCapitolului);
        listaCapitole.add(capitolCurent);
        return listaCapitole.indexOf(capitolCurent);

    }

    public Chapter getChapter(int indexulCapitolului) {
        return listaCapitole.get(indexulCapitolului);
    }
}


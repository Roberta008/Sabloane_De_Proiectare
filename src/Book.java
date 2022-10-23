import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class Book {
    private final String titluCartii;
    private final List<String> elementeleListei;
    private Author numeleAutorului;
    private final List<Chapter> listaCapitole;

    public Book(String titlulCartii) {
        this.titluCartii = titlulCartii;
        this.elementeleListei = new ArrayList<>();
        this.listaCapitole = new ArrayList<>();
    }


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


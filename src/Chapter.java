import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class Chapter {
    private final String numeleCapitolului;
    private final List<SubChapter> listaSubcapitole;

    public Chapter(String numeleCapitolului) {
        this.numeleCapitolului = numeleCapitolului;
        this.listaSubcapitole = new ArrayList<>();
    }

    public int createSubChapter(String numeleSubcapitolului) {
        SubChapter subcapitolulCurent = new SubChapter(numeleSubcapitolului);
        listaSubcapitole.add(subcapitolulCurent);
        return listaSubcapitole.indexOf(subcapitolulCurent);
    }

    public SubChapter getSubChapter(int indexulSubcapitolului) {
        return listaSubcapitole.get(indexulSubcapitolului);
    }
}

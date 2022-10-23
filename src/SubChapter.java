import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private final String numeleSubcapitolului;
    private final List<Element> listaElemente;

    public SubChapter(String numeleSubcapitolului) {
        this.numeleSubcapitolului = numeleSubcapitolului;
        this.listaElemente = new ArrayList<>();
    }

    public void createNewParagraph(String numeleParagrafului) {
        listaElemente.add(new Paragraph(numeleParagrafului));
    }

    public void createNewImage(String numeleImaginii) {
        listaElemente.add(new Image(numeleImaginii));
    }

    public void createNewTable(String numeleTabelei) {
        listaElemente.add(new Table(numeleTabelei));
    }

    public void print() {
        System.out.println("Subchapter: " + numeleSubcapitolului);
        for (Element elementCurent : listaElemente) {
            elementCurent.print();
        }
    }
}

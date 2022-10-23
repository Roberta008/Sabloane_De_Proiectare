import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String numeleSubcapitolului;
    private List<Paragraph> listaParagrafe;
    private List<Image> listaImagini;
    private List<Table> listaTabele;

    public SubChapter(String numeleSubcapitolului) {
        this.numeleSubcapitolului = numeleSubcapitolului;
        this.listaParagrafe = new ArrayList<>();
        this.listaImagini = new ArrayList<>();
        this.listaTabele = new ArrayList<>();
    }

    public void createNewParagraph(String numeleParagrafului) {
        listaParagrafe.add(new Paragraph(numeleParagrafului));
    }

    public void createNewImage(String numeleImaginii) {
        listaImagini.add(new Image(numeleImaginii));
    }

    public void createNewTable(String numeleTabelei) {
        listaTabele.add(new Table(numeleTabelei));
    }

    public void print() {
        System.out.println("Subchapter: " + numeleSubcapitolului);
        for (Paragraph paragrafulCurent : listaParagrafe) {
            paragrafulCurent.print();
        }
        for (Image imagineCurenta : listaImagini) {
            imagineCurenta.print();
        }
        for (Table tabelaCurenta : listaTabele) {
            tabelaCurenta.print();
        }
    }
}

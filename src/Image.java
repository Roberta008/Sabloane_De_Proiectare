import java.util.ArrayList;
import java.util.List;


public class Image implements Element {
    private final String imagineaCapitolului;
    private final List<Element> listaImagini;

    public Image(String imagineaCapitolului) {
        this.imagineaCapitolului = imagineaCapitolului;
        this.listaImagini = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + imagineaCapitolului);
    }

    @Override
    public void add(Element element) {
        listaImagini.add(element);
    }

    @Override
    public void remove(Element element) {
        listaImagini.remove(element);

    }

    @Override
    public Element get(int indexulElementului) {
        return listaImagini.get(indexulElementului);
    }
}

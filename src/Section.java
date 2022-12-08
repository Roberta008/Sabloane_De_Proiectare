import java.util.ArrayList;
import java.util.List;

public class Section implements ElementMain {
    private final String numeleSectiunii;
    private final List<ElementMain> listaSectiuni;
    public Section(String numeleSectiunii) {
        this.numeleSectiunii=numeleSectiunii;
        this.listaSectiuni=new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println(numeleSectiunii);
        for (ElementMain elementMain : listaSectiuni) {
            elementMain.print();
        }

    }

    @Override
    public void add(ElementMain elementMain) {
        listaSectiuni.add(elementMain);
    }

    @Override
    public void remove(ElementMain elementMain) {
        listaSectiuni.remove(elementMain);

    }

    @Override
    public ElementMain get(int indexulElementului) {
        return listaSectiuni.get(indexulElementului);
    }

    @Override
    public String getNumeleparagrafului() {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitSection(this);
        for(ElementMain elementMainCurent : listaSectiuni)
            elementMainCurent.accept(v);
    }
}

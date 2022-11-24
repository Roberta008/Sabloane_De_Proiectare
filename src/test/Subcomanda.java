package test;

import java.util.ArrayList;
import java.util.List;

public class Subcomanda implements Element {
    private final String idSubComanda;
    private final List<Element> listaElemente;

    public Subcomanda(String idSubComanda) {
        this.idSubComanda = idSubComanda;
        this.listaElemente = new ArrayList<>();
    }

    public String getIdSubComanda() {
        return idSubComanda;
    }

    public List<Element> getListaElemente() {
        return listaElemente;
    }

    @Override
    public void add(Element obiectElement) {
        listaElemente.add(obiectElement);
    }
}

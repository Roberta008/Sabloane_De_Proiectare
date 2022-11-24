package test;

import java.util.ArrayList;
import java.util.List;

public class Comanda implements Element {
    private final String idComanda;
    private final List<Element> listaElemente;

    public Comanda(String idComanda) {
        this.idComanda = idComanda;
        this.listaElemente = new ArrayList<>();
    }

    @Override
    public void add(Element obiectElement) {
        listaElemente.add(obiectElement);
    }

    public String getIdComanda() {
        return idComanda;
    }

    public List<Element> getListaElemente() {
        return listaElemente;
    }
}

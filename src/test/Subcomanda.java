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

    @Override
    public void afisarePret() {
        System.out.println("Subcomanda " + idSubComanda + " in valoare de " + getPretProdus() + " este formata din:");
    }

    @Override
    public double getPretProdus() {
        return listaElemente.stream().mapToDouble(Element::getPretProdus).sum();
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

    @Override
    public void accept(Visitor obiectVisitor) {
        obiectVisitor.visit(this);
        listaElemente.forEach(elementCurent -> elementCurent.accept(obiectVisitor));
    }
}

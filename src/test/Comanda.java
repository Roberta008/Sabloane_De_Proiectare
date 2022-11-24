package test;

import java.text.DecimalFormat;
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
    public void afisarePret() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Pretul total al comenzii " + idComanda + " este: " + decimalFormat.format(getPretProdus()) + "lei!");
        System.out.println("Ea este formata din:");
    }

    @Override
    public double getPretProdus() {
        return listaElemente.stream().mapToDouble(Element::getPretProdus).sum();
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

    @Override
    public void accept(Visitor obiectVisitor) {
        obiectVisitor.visit(this);
        listaElemente.forEach(elementCurent -> elementCurent.accept(obiectVisitor));
    }
}

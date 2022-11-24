package test;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Element {
    private final String numeRestaurant;
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private final List<Element> listaElemente;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        listaElemente = new ArrayList<>();
    }

    @Override
    public void afisarePret() {
        System.out.println("Urmatoarele comenzi provin din restaurantul " + numeRestaurant + "!");
    }

    @Override
    public double getPretProdus() {
        return 0.0;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
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

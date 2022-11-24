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

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    @Override
    public void add(Element obiectElement) {
        listaElemente.add(obiectElement);
    }
}

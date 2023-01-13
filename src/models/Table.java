package models;

import services.Visitor;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Table implements ElementMain {
    private final String numeleTabelei;
    private final List<ElementMain> listaTabele;

    public Table(String numeleTabelei) {
        this.numeleTabelei = numeleTabelei;
        this.listaTabele = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("models.Table with Title: " + numeleTabelei);
    }

    @Override
    public void add(ElementMain elementMain) {
        listaTabele.add(elementMain);
    }

    @Override
    public void remove(ElementMain elementMain) {
        listaTabele.remove(elementMain);

    }

    @Override
    public ElementMain get(int indexulElementului) {
        return listaTabele.get(indexulElementului);
    }

    @Override
    public String getNumeleparagrafului() {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitTable(this);
    }
}



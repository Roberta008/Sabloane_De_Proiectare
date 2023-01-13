package models;

import services.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Image implements ElementMain {
    private final String imagineaCapitolului;
    private final List<ElementMain> listaImagini;

    public Image(String name) {
        this.listaImagini=new ArrayList<>();
        this.imagineaCapitolului = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void print() {
        System.out.println("models.Image with name: " + imagineaCapitolului);
    }

    @Override
    public void add(ElementMain elementMain) {
        listaImagini.add(elementMain);
    }

    @Override
    public void remove(ElementMain elementMain) {
        listaImagini.remove(elementMain);

    }

    @Override
    public ElementMain get(int indexulElementului) {
        return listaImagini.get(indexulElementului);
    }

    @Override
    public String getNumeleparagrafului() {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitImage(this);
    }
}

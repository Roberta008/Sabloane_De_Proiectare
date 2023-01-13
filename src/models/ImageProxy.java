package models;

import services.Visitor;

public class ImageProxy implements ElementMain, Picture{
    private final String imagineaProxy;
    private int dimensiune;
    private Image imagine;

    public ImageProxy(String imagineaProxy) {
        this.imagineaProxy = imagineaProxy;
    }

    public Image loadImage()
    {
        if(imagine==null){
            imagine=new Image(imagineaProxy);
        }
        return imagine;
    }
    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void add(ElementMain elementMain) {

    }

    @Override
    public void remove(ElementMain elementMain) {

    }

    @Override
    public ElementMain get(int indexulElementului) {
        return null;
    }

    @Override
    public String getNumeleparagrafului() {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitImageProxy(this);
    }
}

package models;

import services.AlignStrategy;
import services.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements ElementMain {
    private final String numeleParagrafului;
    private final List<ElementMain> listaParagrafe;
    private AlignStrategy a=null;

    public Paragraph(String numeleParagrafului) {
        this.numeleParagrafului = numeleParagrafului;
        this.listaParagrafe = new ArrayList<>();
    }

  void setAlignStrategy(AlignStrategy a)
  {
      this.a=a;
  }
    @Override
    public void print() {
        if(a!=null){
            a.render(this);
        }
        else
            System.out.println(this.numeleParagrafului);
    }

    @Override
    public void add(ElementMain elementMain) {
        listaParagrafe.add(elementMain);
    }

    @Override
    public void remove(ElementMain elementMain) {
        listaParagrafe.remove(elementMain);

    }

    @Override
    public ElementMain get(int indexulElementului) {
        return listaParagrafe.get(indexulElementului);
    }

    @Override
    public String getNumeleparagrafului() {
        return this.numeleParagrafului;
    }

    @Override
    public void accept(Visitor v) {
        v.visitParagraph(this);
    }
}

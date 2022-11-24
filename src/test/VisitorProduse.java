package test;

public class VisitorProduse implements Visitor {
    @Override
    public void visit(Element obiectElement) {
        obiectElement.afisarePret();
    }
}

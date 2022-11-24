package test;

import java.text.DecimalFormat;

@SuppressWarnings("unused")
public class Salata extends Produs {
    public Salata(String numeProdus, double pretProdus) {
        super(numeProdus, pretProdus);
    }

    @Override
    public void afisarePret() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println(numeProdus + " la pretul de " + pretProdus);
    }

    @Override
    public double getPretProdus() {
        return pretProdus;
    }

    @Override
    public void add(Element obiectElement) {

    }

    @Override
    public void accept(Visitor obiectVisitor) {
        obiectVisitor.visit(this);
    }
}

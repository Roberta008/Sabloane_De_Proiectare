package test;

@SuppressWarnings("unused")
public abstract class Produs implements Element {
    protected final String numeProdus;
    protected double pretProdus;

    public Produs(String numeProdus, double pretProdus) {
        this.numeProdus = numeProdus;
        this.pretProdus = pretProdus;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    @Override
    public abstract void afisarePret();
    @Override
    public abstract double getPretProdus();

    public void setPretProdus(double pretProdus) {
        this.pretProdus = pretProdus;
    }
}

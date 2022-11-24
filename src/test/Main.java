package test;

public class Main {
    public static void main(String[] args) {
        Element obiectRestaurant = new Restaurant("Falafel");
        Element obiectComanda = new Comanda("Comanda 1");
        obiectComanda.add(new Pizza("Pizza Margherita", 49.99));
        obiectComanda.add(new Paste("Paste Carbonara", 24.5));
        Element obiectSubComanda = new Subcomanda("Subcomanda 1.1");
        obiectSubComanda.add(new Salata("Salata Caesar", 20.0));
        obiectComanda.add(obiectSubComanda);
        obiectRestaurant.add(obiectComanda);
        Visitor obiectVisitor = new VisitorProduse();
        obiectRestaurant.accept(obiectVisitor);
    }
}

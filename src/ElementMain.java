@SuppressWarnings("unused")
public interface ElementMain {
    void print();

    void add(ElementMain elementMain);

    void remove(ElementMain elementMain);

    ElementMain get(int indexulElementului);

    String getNumeleparagrafului();

    void accept(Visitor v);
}

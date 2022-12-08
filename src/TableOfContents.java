public class TableOfContents implements ElementMain {
    @Override
    public void print() {

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
        v.visitTableOfContents(this);
    }
}

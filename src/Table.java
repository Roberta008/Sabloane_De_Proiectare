@SuppressWarnings("ClassCanBeRecord")
public class Table implements Element {
    private final String numeleTabelei;

    public Table(String numeleTabelei) {
        this.numeleTabelei = numeleTabelei;
    }

    @Override
    public void print() {
        System.out.println("Table with Title: " + numeleTabelei);
    }
}

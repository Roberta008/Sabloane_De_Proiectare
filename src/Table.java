public class Table {
    private String numeleTabelei;

    public Table(String numeleTabelei) {
        this.numeleTabelei = numeleTabelei;
    }

    public void print() {
        System.out.println("Table with Title: " + numeleTabelei);
    }
}

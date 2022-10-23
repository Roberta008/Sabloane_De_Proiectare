@SuppressWarnings("ClassCanBeRecord")
public class Paragraph implements Element {
    private final String numeleParagrafului;

    public Paragraph(String numeleParagrafului) {
        this.numeleParagrafului = numeleParagrafului;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + numeleParagrafului);
    }
}

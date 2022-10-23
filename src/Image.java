@SuppressWarnings("ClassCanBeRecord")
public class Image implements Element {
    private final String imagineaCapitolului;

    public Image(String imagineaCapitolului) {
        this.imagineaCapitolului = imagineaCapitolului;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + imagineaCapitolului);
    }
}

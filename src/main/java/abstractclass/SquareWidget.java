package abstractclass;

public class SquareWidget extends Widget {
    private final int size;
// When designing an abstract class, why should you avoid calling abstract methods inside its constructor?
// najpierw się wywoła konstruktor rodzic, będzie używał jakiś metod, które to może będą użyać jakiś wartości,
// które to wartości zostaną dopiero przekazane w konstruktorze dziecka.
    public SquareWidget(int size) {
        System.out.println("SquareWidget start");
        this.size = size;
        System.out.println("SquareWidget stop");
    }

    @Override
    protected int width() {
        System.out.println("SquareWidget width");
        return size;
    }

    @Override
    protected int height() {
        System.out.println("SquareWidget height");
        return size;
    }
}
package abstractclass;


public class Main {
    public static void main(String[] args) {
        Widget w = new SquareWidget(3);
        System.out.println(w.cachedHeight);
    }
}

package abstractclass;

public abstract class Widget {
    private final int cachedWidth;
    public final int cachedHeight;

    public Widget() {
        System.out.println("Widget start");
        this.cachedWidth = width();
        this.cachedHeight = height();
        System.out.println("Widget stop");
    }

    protected abstract int width();
    protected abstract int height();
}
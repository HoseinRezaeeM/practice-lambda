package lambda;
@FunctionalInterface
@SuppressWarnings("unused")
public interface Drawable {
    public void draw();
    default int f(){
        return 45;
    }
}

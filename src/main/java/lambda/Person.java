package lambda;
@FunctionalInterface
public interface Person {
    void f();
    default Integer age(){
        return 0;
    }
}

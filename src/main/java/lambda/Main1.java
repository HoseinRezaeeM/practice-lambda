package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class Main1 {
    public static void main(String[] args) {
//        int width = 10;
//
//        Drawable drawable = () -> {
//            System.out.println("Drawing :" + width);
//        };
//
//        drawable.draw();
//        Sayable sayable = (name) -> {
//            return "Hello " + name;
//        };
//        System.out.println(sayable.say("Hozadieg"));
//
//        Addable addable =(a, b) -> (a+b);
//        System.out.println(addable.add(1,85));
//        Addable addable1 =((a, b) -> (a+b));
//        System.out.println(addable1.add(4,8));
//
//        List<String> list =new ArrayList<>();
//        list.add("Ali");
//        list.add("hosi");
//        list.add("bob");
//        list.forEach(System.out::println);
        String st = "ok";
        boolean b;
        Predicate<String> predicate = (x) -> x.length() > 0;
        b = predicate.test(st);
        System.out.println(b);
        b = predicate.negate().test(st);
        System.out.println(b);
        Predicate<String> notnull = (x) -> x != null;
        System.out.println(b = predicate.and(notnull).negate().test(st));
        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(b = isEmpty.test(st));
        Predicate<String> notEmpty = isEmpty.negate();
        System.out.println(b = notEmpty.and(notnull).and(predicate).test(st));
        Function<String, Integer> stringIntegerFunction = Integer::valueOf;
        Function<String, String> backToString = stringIntegerFunction.andThen(String::valueOf);
        System.out.println(backToString.apply("123"));

         BiFunction<Integer,Integer,Integer> function =(a,c) -> (a+c);
        System.out.println(function.apply(1,8));

        Consumer<Product> productConsumer = p -> System.out.println(p.name);
        productConsumer.accept(new Product(1, "Ali", 427));

        Supplier<Product> productSupplier = Product::new;
        System.out.println(productSupplier.get());

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hosein");
        map.put(2, "Sheida");
        BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println("key : " + key + "  value : "+value);
        map.forEach(biConsumer);

        BiPredicate<Integer,String> biPredicate =(i,s)->i.toString().equals(s);
        System.out.println(biPredicate.test(1,"1"));

    }
}

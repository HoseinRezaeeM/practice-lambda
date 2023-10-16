//package lambda;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.BiFunction;
//import java.util.function.BiPredicate;
//
//import java.util.function.Predicate;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class Main {
//    public static void main(String[] args) {
//        String st = "ok";
//        boolean b;
//        Predicate<String> notEmpty = (x) -> x.length() > 0;
//        b = notEmpty.test(st);
//        b = notEmpty.negate().test(st);
//
//        Predicate<String> notNull = x -> x != null;
//        b = notNull.and(notEmpty).test(st);
//
//        Predicate<String> isEmpty = String::isEmpty;
//        Predicate<String> notEmptyi = isEmpty.negate();
//        BiFunction<Integer, Integer, String> biFunction =
//                (num1, num2) -> "Result:" + (num1 + num2);
//        System.out.println(biFunction.apply(20, 28));
//
//        BiPredicate<Integer, String> biPredicate =
//                (i, s) -> i.toString().equals(s);
//        System.out.println(biPredicate.test(10, "10"));
//        System.out.println(biPredicate.test(30, "40"));
//        List<String> list = new ArrayList<>(Integer.parseInt("1"));
//        Stream<String> stream = list.stream();
////        stream.forEach(System.out::println);
////        list.stream().parallel().filter(a -> "Black".equals(a.color)).sorted((a,b)
////                        -> a.price - b.price).limit(2).
////                forEach(System.out::println);
//    IntStream.rangeClosed(1,4_000).filter(a->a%1000 == 0).
//            parallel().sequential().parallel().forEach(System.err::println);
//    }
//
//
//}

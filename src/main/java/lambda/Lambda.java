package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    float price;
    public Product(int id,String name,float price){
        super();
        this.id =id;
        this.name = name;
        this.price = price;

    }

    public Product() {

    }
}

public class Lambda{
    public static void main(String[] args) {
        List<Product> list =new ArrayList<>();
        list.add(new Product(1,"LG",17520));
        list.add(new Product(2,"LG",21520));
        list.add(new Product(3,"LG",17520));
        list.add(new Product(4,"LG",17520));
        Stream<Product> file =list.stream().filter(p ->p.price >20000);
        file.forEach(product -> System.out.println(product.name+":"+product.price));

    }

}

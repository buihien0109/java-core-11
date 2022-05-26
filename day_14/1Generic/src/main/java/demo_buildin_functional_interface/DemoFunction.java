package demo_buildin_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DemoFunction {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("An");
        names.add("Vinh");
        names.add("Hòa");

        names.forEach(System.out::println);

        // Cách 1:
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        names.stream().map(function).forEach(System.out::println);

        // Cách 2: Sử dụng lambda
        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);

        // Cách 3 : method reference
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

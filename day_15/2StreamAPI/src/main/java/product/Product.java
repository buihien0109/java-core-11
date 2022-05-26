package product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    public String name;
    private int price;
    private String brand;
    private int count;

    public void printInfo() {
        System.out.println(id + " - " + name + " - " + price + " - " + brand + " - " + count);
    }
}

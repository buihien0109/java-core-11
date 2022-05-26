package product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
//    1. In ra thông tin các sản phẩm trong giỏ hàng theo cấu trúc sau
//    ID - Tên - Giá - Thương Hiệu - Số lượng
//    Ví dụ : 1- OPPO Find X3 Pro - 19500000 - OPPO - 3
    public void print(List<Product> products) {
        products.stream().forEach(Product::printInfo);
    }
//
//    2. Tính tổng tiền tất cả sản phẩm trong giỏ hàng
//    Tổng tiền mỗi sản phẩm = price * count
    public int getTotalMoney(List<Product> products) {
        return products
                .stream()
                .map(product -> product.getPrice() * product.getCount())
                .reduce(0, (p1, p2) -> p1 + p2);
    }
//
//    3. Tìm các sản phẩm của thuơng hiệu “Apple”
    public List<Product> getProductByBrand(List<Product> products, String brandName){
        return products
                .stream()
                .filter(p -> p.getBrand().equals(brandName))
                .collect(Collectors.toList());
    }
//
//    4. Tìm các sản phẩm có giá > 20000000
    public List<Product> getProductByPrice(List<Product> products, int price){
        return products
                .stream()
                .filter(p -> p.getPrice() > price)
                .collect(Collectors.toList());
    }
//
//    5. Tìm các sản phẩm có chữ “pro” trong tên (Không phân biệt hoa thường)
}

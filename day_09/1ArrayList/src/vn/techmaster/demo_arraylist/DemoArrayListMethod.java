package vn.techmaster.demo_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Hiên");
        names.add("Duy");
        names.add("Ngọc");

        System.out.println(Arrays.toString(names.toArray()));

        // Thêm vào 1 vị trí bất kỳ
        names.add(1, "An");
        System.out.println(Arrays.toString(names.toArray()));

        // Lấy size
        System.out.println(names.size());

        // Xóa tại vị trí chỉ định
        names.remove(1);
        System.out.println(Arrays.toString(names.toArray()));

        // Xóa theo object
        names.remove("Duy");
        System.out.println(Arrays.toString(names.toArray()));

        // Tạo arrayList khác
        ArrayList<String> namesOther = new ArrayList<>();
        namesOther.add("Quỳnh");
        namesOther.add("Thu");

        names.addAll(namesOther);
        System.out.println(Arrays.toString(names.toArray()));

        // Kiểm tra 1 phần tử có nằm trong arrayList hay không
        System.out.println(names.contains("Duy"));
        System.out.println(names.contains("Ngọc"));

        System.out.println(names.indexOf("Duy"));
        System.out.println(names.indexOf("Ngọc"));

        names.add("Ngọc");
        System.out.println(Arrays.toString(names.toArray()));
        System.out.println(names.lastIndexOf("Ngọc"));

//        names.clear();
//        System.out.println(names.isEmpty());
        names.removeAll(namesOther);
        System.out.println(Arrays.toString(names.toArray()));
    }
}

package demo_generic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

interface InterfaceGeneric<T> {
    void add(T obj);
    void remove(T obj);
    void print();
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DemoGenericInterface<T> implements InterfaceGeneric<T>{
    private List<T> list;

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public void print() {
        for (T obj: list) {
            System.out.print(obj + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // List Integer
        InterfaceGeneric<Integer> interfaceGeneric = new DemoGenericInterface<>(new ArrayList<>());

        // Add
        interfaceGeneric.add(1);
        interfaceGeneric.add(2);
        interfaceGeneric.add(3);

        interfaceGeneric.print();

        // Xóa
        interfaceGeneric.remove(3);
        interfaceGeneric.print();

        // List student
        InterfaceGeneric<Student> students = new DemoGenericInterface<>(new ArrayList<>());
        Student student = new Student("hien", 25);

        students.add(student);
        students.add(new Student("an", 28));
        students.add(new Student("dung", 30));

        students.print();

        students.remove(student);
        students.print();
    }
}

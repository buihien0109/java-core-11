import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        Deque<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        numbers.add(10);
        numbers.add(7);
        numbers.add(4);

        // ForEach để duyệt
        for (int n: numbers) {
            System.out.println(n);
        }

        numbers.forEach(n -> System.out.println(n));

        numbers.addFirst(5);
        numbers.addLast(12);
        System.out.println(numbers.toString());

        numbers.pop();
        System.out.println(numbers.toString());

        numbers.push(20);
        System.out.println(numbers.toString());

        numbers.removeFirst();

        // Set interface
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);

        System.out.println(set.toString());

        // Map interface
        Map<Integer, String> list = new HashMap<>();
        list.put(1, "bob");
        list.put(2, "anna");
        list.put(3, "alice");

        Set<Integer> keyset = list.keySet();
        for (Integer key: keyset) {
            System.out.println(list.get(key));
        }

        Set<Map.Entry<Integer, String>> entrySet = list.entrySet();
        for (Map.Entry<Integer, String> entry: entrySet) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // Class Collections
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(2);
        numbers1.add(10);
        numbers1.add(7);
        numbers1.add(4);

        int max = Collections.max(numbers1);
        System.out.println("Max = "  + max);

        Collections.sort(numbers1);
        System.out.println(numbers1.toString());

        Collections.sort(numbers1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Collections.sort(numbers1, (a, b) -> b - a);
        System.out.println(numbers1.toString());

        Collections.reverse(numbers1);
        System.out.println(numbers1.toString());

        Collections.shuffle(numbers1);
        System.out.println(numbers1.toString());

//        Collections.fill(numbers1, 10);
//        System.out.println(numbers1.toString());

        Collections.sort(numbers1, Collections.reverseOrder());
        System.out.println(numbers1.toString());

        // Book

    }
}

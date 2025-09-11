import java.util.*;
public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        System.out.println("enter no of elements");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            sortedSet.add(scanner.nextInt());
        }
        System.out.println(sortedSet.subSet(2, 5));
    }
}
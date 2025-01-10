import java.util.*;
public class UncommonBugSolution {
    public static void main(String[] args) {
        // ... (Same exception handling as before)

        // Solution for ConcurrentModificationException: Use Iterator
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num == 2) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
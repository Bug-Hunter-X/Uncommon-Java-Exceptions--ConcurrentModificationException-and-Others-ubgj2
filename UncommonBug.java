public class UncommonBug {
    public static void main(String[] args) {
        int x = 5;
        try {
            System.out.println(x / 0); //Potential ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        }

        String str = null;
        try {
            System.out.println(str.length()); //Potential NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }

        int[] arr = new int[5];
        try {
            System.out.println(arr[10]); //Potential ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }

        // Demonstrates an uncommon scenario: ConcurrentModificationException
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer num : list) {
            if (num == 2) {
                list.remove(num); // ConcurrentModificationException
            }
        }
    }
}
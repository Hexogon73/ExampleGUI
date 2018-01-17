import java.util.ArrayList;

public class MathRow {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(1);
//        for (int i = 0; i < 15; i++) {
//            arrayList.add(Sum.nextX());
//        }
//
//        for (Integer num : arrayList) {
//            System.out.print(num + " ");
//        }
        int x1 = Sum.nextX();
        int x2 = Sum.nextX();
        int x3 = Sum.nextX();
        System.out.printf("x1: %d\nx2: %d\nx3: %d", x1, x2, x3);
    }

    public static class Sum {
        private static int x1 = 1;
        private static int x2 = 1;
        private static int x;

        static int nextX() {
            x = x1 + x2;
            x1 = x2;
            x2 = x;
            return x;
        }
    }
}

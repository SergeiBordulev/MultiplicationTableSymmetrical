public class MultiplicationTableSymmetrical {
    public static void main(String[] args) {
        int tableSize = 10;

        for (int i = 0; i <= tableSize; i++) {
            System.out.print(" ———————");
        }

        System.out.println();
        System.out.print("|\t \t|\t");

        for (int i = 1; i <= tableSize; i++) {
            System.out.print(i + "\t|\t");
        }

        System.out.println();

        for (int i = 1; i <= tableSize; i++) {
            for (int j = 0; j <= tableSize; j++) {
                System.out.print(" ———————");
            }

            System.out.println();

            System.out.print("|\t" + i + "\t|\t");

            for (int j = 1; j <= tableSize; j++) {
                System.out.print(i * j + "\t|\t");
            }

            System.out.println();
        }

        for (int i = 0; i <= tableSize; i++) {
            System.out.print(" ———————");
        }
    }
}

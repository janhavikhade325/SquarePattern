public class SquarePattern {
    public static void main(String[] args) {
        int size = 5; // You can change the size

        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
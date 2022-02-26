public class PyramidTest {
    public static void main(String[] args) {
        int rows = 5;

//        Normal half pyramid patterm
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        vertical reverse half pyramid pattern
//        for (int i = 5; i >= rows; i--) {
//            for (int j = 1; j <= i; ++j) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}

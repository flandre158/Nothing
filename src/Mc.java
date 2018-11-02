public class Mc {
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0;
        for (int x = 2; x > -3; x--) {
            i = Math.abs(x);
            for (int y = i; y > 0; y--) {
                System.out.print(" ");
            }
            for (int y = 5 - 2 * i; y > 0; y--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (double y = 1.5; y > -1.5; y -= 0.1) {
            for (double x = -1.5; x < 1.5; x += 0.03) {
                double a = x * x + y * y - 1;                      //-1为控制*多少的关键
                if ((a * a * a - x * x * y * y * y) <= 0) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

package print;

public class Print {
    public static void main(String[] args){
        printDiamond(10);
        printHeart();
    }

    public static void printDiamond(int n){
        for (int i = 0; i < n; i++){
            for (int k = 0; k < (n - i -1); k++){
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++){
                System.out.print("⧫   ");
            }
            System.out.print("\n");
        }
        for (int i = n - 1; i > 0; i--){
            for (int j = 0; j < (n - i); j++){
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++){
                System.out.print("⧫   ");
            }
            System.out.print("\n");
        }
    }

    public static void printHeart() {
        for (float y = 1.5f; y > -1.5f; y -= 0.1f){
            for (float x = -1.5f; x < 1.5f; x += 0.05f){
                float a = x * x + y * y - 1;
                System.out.print(a * a * a - x * x * y * y * y <= 0.0f ? "*" : " ");
            }
            System.out.print("\n");
        }
    }
}

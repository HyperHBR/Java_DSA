public class _06_Butterfly {
    public static void Butterfly(int Lines) {
        // Top
        for (int i = 1; i <= Lines; i++) {
            // Stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces = 2*(Lines-i)
            for (int j = 1; j <= (Lines - i) * 2; j++) {
                System.out.print("  ");
            }
            // Stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Bottom
        for (int i = Lines; i >= 1; i--) {
            // Stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces = 2*(Lines-i)
            for (int j = 1; j <= (Lines - i) * 2; j++) {
                System.out.print("  ");
            }
            // Stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Butterfly(10);
    }
}

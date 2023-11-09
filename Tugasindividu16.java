import java.util.Scanner;

public class Tugasindividu16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int n = input.nextInt();

        if (n < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            for (int i = 1; i <= n; i++) {
                
                for (int k = 1; k <= n - i; k++) {
                    System.out.print("  ");
                }
                
                
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        input.close();
    }
}

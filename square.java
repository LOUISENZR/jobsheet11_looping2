import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai N = ");
            int N = sc.nextInt();
            for(int iOuter=1; iOuter<=N; iOuter++){
                for(int i = 0; i <= N; i++){
                    System.out.print("*");
                }
                System.out.println();
            }
        sc.close();
    }
}

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai N = ");
        int N= sc.nextInt();
        int i = 0;
            while(i<=N){
            System.out.println();
                int j = 0;
                while (j<i){
                    System.out.print("*");
                    j++;
                }
                i++;
            }
    sc.close();
    }
}

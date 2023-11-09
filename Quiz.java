import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu='y';
        do{
            int number = random.nextInt(10)+1;
            boolean success = false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();

                if(answer == number){
                    success = true;
                    
                }else if(answer < number){
                    System.out.println("Angka terlalu kecil dari jawaban, masukan angka lebih besar");
                }
                else{
                    System.out.println("Angka terlalu besar dari jawaban, masukn angka lebih kecil");

                }

            }while(!success);
            System.out.print("Apakah anda inngin mengulangi permainan(Y/y)?");
            menu =  input.nextLine().charAt(0);
        }while(menu=='y'|| menu=='Y');
   
    input.close();

    }
}

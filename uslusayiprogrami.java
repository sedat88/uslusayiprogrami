import java.util.Scanner;

public class uslusayiprogrami {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n,k;

            System.out.print("Üssü alınacak sayıyı giriniz : ");
            n = scan.nextInt();
            System.out.print("Üs olacak sayıyı giriniz : ");
            k = scan.nextInt();


            // üslü sayı hesaplanması üs alınacak sayının üs olacak sayı kadar carpılması.
            // örnek : üssü alınacak sayı = 4 ------- Üs olacak sayı = 3 ----- Sonuc = 4*4*4 = 64


            int total =1;
            for (int i = 0; i < k; i++) {
                total *= n;
            }
            System.out.println(n + "^" + k + " = " + total);
        }
    }



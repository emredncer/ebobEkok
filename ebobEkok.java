import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {

        int ebob = 1, ekok, i = 1;
        Scanner inp = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        int n1 = inp.nextInt();

        System.out.println("İkinci sayıyı giriniz ");
        int n2 = inp.nextInt();

        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB: " + ebob);
        ekok = (n1 * n2) / ebob;
        System.out.println("EKOK: " + ekok);
    }
}

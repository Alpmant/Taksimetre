import java.io.Console;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
        double taksiKm = 2.20;
        double taksiAcilis = 10;

      System.out.print("Kaç Kilometre Yol Gittiniz: ");
      int gidilenKm = input.nextInt();
        double toplam = taksiKm*gidilenKm+taksiAcilis;
        System.out.print(toplam<20 ? 20 : toplam);

























    }
}

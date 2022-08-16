import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float odenenTutar, kdvTutari1, kdvTutari2;

        System.out.print("Ödediğiniz tutarı yazınız: ");
        odenenTutar = input.nextInt();

        kdvTutari1 = odenenTutar * 18/100;

        kdvTutari2 = odenenTutar * 8/100;

        String durum1 = odenenTutar <= 1000 ? "1000TL altı için KDV tutarı: " + kdvTutari1 :
                "1000TL üzeri için KDV tutarı: " + kdvTutari2;

        System.out.println(durum1);

        String durum2 = odenenTutar <= 1000 ? "KDV'li tutar: " + (odenenTutar + kdvTutari1) :
                "KDV'li tutar: " + (odenenTutar + kdvTutari2);

        System.out.println(durum2);
    }
}
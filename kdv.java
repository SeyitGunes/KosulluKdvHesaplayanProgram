import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        double tutar, kdvOrani, kdvTutari, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen tutarınızı giriniz: ");
        tutar = input.nextDouble();

        kdvOrani = (tutar <= 1000) ? 0.18 : 0.08;
        kdvTutari = tutar * kdvOrani;
        toplamTutar = tutar + kdvTutari;

        System.out.println("KDV Oranı: " + (kdvOrani * 100) + "%");
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");

    }
}

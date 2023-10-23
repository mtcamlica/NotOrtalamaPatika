import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenleri oluşturalım
        int matematik, fizik, kimya, turkce, tarih, muzik;

        //scanner sınıfını kullanarak kullanıcıdan giriş almalıyız, nesne oluşturucaz
        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri alıyoruz
        System.out.print("Matematik notunuz: ");
        matematik = input.nextInt();

        System.out.print(("Fizik notunuz: "));
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print(("Tarih notunuz: "));
        tarih = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Not ortalamanız: " + sonuc);

        String durum;
        durum = sonuc >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta kaldınız";
        System.out.println("Durumu: " + durum);

    }
}
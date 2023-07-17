import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik,turkce, kimya,fizik,muzik;
        double ortalama;
        Scanner alici= new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        matematik= alici.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        turkce= alici.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kimya= alici.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fizik= alici.nextInt();
        System.out.print("Müzik notunuzu giriniz:");
        muzik= alici.nextInt();
        if (matematik<0&&matematik>100){
            ortalama=turkce+kimya+fizik+muzik/4;
            if (ortalama>55){
                System.out.println("Dersi geçtiniz");
            }
            else {
                System.out.println("Ortalamanız 55 den düşük kaldınız");
            }
        } else if (turkce<0&&turkce>100) {
            ortalama=matematik+kimya+fizik+muzik/4;
            if (ortalama>55){
                System.out.println("Dersi geçtiniz");
            }
            else {
                System.out.println("Ortalamanız 55 den düşük kaldınız");
            }

        }
        else if (kimya<0&&kimya>100) {
            ortalama=(turkce+matematik+fizik+muzik)/4;
            if (ortalama>55){
                System.out.println("Dersi geçtiniz");
            }
            else {
                System.out.println("Ortalamanız 55 den düşük kaldınız");
            }

        }else if (fizik<0&&fizik>100) {
            ortalama=(turkce+kimya+matematik+muzik)/4;
            if (ortalama>55){
                System.out.println("Dersi geçtiniz");
            }
            else {
                System.out.println("Ortalamanız 55 den düşük kaldınız");
            }

        }else if (muzik<0&&muzik>100) {
            ortalama=(turkce+kimya+fizik+matematik)/4;
            if (ortalama>55){
                System.out.println("Dersi geçtiniz");
            }
            else {
                System.out.println("Ortalamanız 55 den düşük kaldınız");
            }


        }


    }
}
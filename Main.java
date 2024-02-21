/*

Bu derste Basit Matematik ve Fizik Problemlerini Inner Classlar ile işleyeceğiz.

İşleyeceğimiz problem konuları;

Daire Alan - Matematik
Üçgen Çevresi - Matematik
3 Boyutlu Vektörlerin İç Çarpımı - Fizik

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  //  12

        System.out.println("Matematik ve Fizik Problemleri Programına Hoşgeldiniz...");  //  13

        String islemler = "İşlemler...\n"
                           +"1. Daire Alanı Hesaplama \n"
                           +"2. Üçgen Çevresi Hesaplama\n"
                           +"3. 2 Vektörün İç Çarpımını Hesaplama\n"
                           +"Çıkmak için q'ya basınız";

        while (true) {  //  14

            System.out.println("****************************************");
            System.out.println(islemler);
            System.out.print("İşlemi Seçiniz : ");

            String islem = scanner.nextLine();

            if (islem.equals("q")) {  //  15
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if (islem.equals("1")) {  //  16

                System.out.println("Dairenin Yarıçapını Giriniz : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.daireAlan(yaricap);

            }
            else if (islem.equals("2")) {  //  17
                System.out.println("Kenar 1 : ");
                int kenar1 = scanner.nextInt();
                System.out.println("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.println("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);

            }
            else if (islem.equals("3")) {  //  18

                Vec vec1 = new Vec("Vektör1");
                Vec vec2 = new Vec("Vektör2");

                Problem.Fizik.icCarpim(vec1, vec2);


            }
            else {  //  19
                System.out.println("Geçersiz İşlem...");
            }

        }

    }



}

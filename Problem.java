public class Problem {

    // Bu class'ımızın içinde 2 inner class olacak. İkisi de static inner classlar olacak.  //  6

    public static class Matematik {  //  7
        public static void daireAlan(int yaricap) {  //  9
            System.out.println("Dairenin Alanı : " + (Math.PI * yaricap * yaricap));

        }
        public static void ucgenCevresi(int kenar1, int kenar2, int kenar3) {  //  10
            System.out.println("Üçgen Çevresi : " + (kenar1 + kenar2 + kenar3));

        }
    }

    public static class Fizik {  //  8

        public static void icCarpim(Vec vec1, Vec vec2) {  // Metoda Vec classından 2 tane obje gönderdik.  //  11

            int iccarpim = vec1.getI() * vec2.getI() + vec1.getJ() * vec2.getJ() + vec1.getK() * vec2.getK();

            System.out.println(vec1.getIsim() + " ile " + vec2.getIsim() + " in iç çarpımı = " + iccarpim);

        }

    }

}

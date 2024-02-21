import java.util.Scanner;

public class Vec {

    private String isim; //  Özellikleri yazdık.  //  1
    private int i;
    private int j;
    private int k;

    public Vec(String isim) {  //  Constructor oluşturduk.  //  2
        this.isim = isim;

        Scanner scanner = new Scanner(System.in);  //  i, j ve k değerlerini kullanıcıdan alabilmek için Scanner tanımladık.  //  3

        System.out.println(isim +  "'in i, j ve k değerlerini giriniz...");

        System.out.println("i : "); //  Constructor içerisinde i, j ve k değerlerini konsoldan input şeklinde aldık.  //  4
        this.i = scanner.nextInt();

        System.out.println("j : ");
        this.j = scanner.nextInt();

        System.out.println("k : ");
        this.k = scanner.nextInt();
        scanner.nextLine();

    }

    public String getIsim() {  //  Getter ve Setter metodları oluşturduk.  //  5
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }  //  Getter ve Setter metodları oluşturduk.  //  5

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}

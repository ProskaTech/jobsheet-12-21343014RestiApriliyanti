/*
 * Created By_21343014 Resti Apriliyanti
 */

package Latihan3_PolymorphismDynamic;

public class PolymorphismDynamic {
    public static void main(String[] args) {
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI adalah : " +B.sukuBunga());

        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI adalah : " +B.sukuBunga());

        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga Mandiri adalah : " +B.sukuBunga());
    }
}

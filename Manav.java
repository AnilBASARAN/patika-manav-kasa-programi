import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        // sebze meyve fiyatlari
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;
        double armut,elma,domates,muz,patlican;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kaç kilo ?");
        armut = input.nextDouble();
        System.out.println("Elma kaç kilo ?");
        elma = input.nextDouble();
        System.out.println("Domates kaç kilo ?");
        domates = input.nextDouble();
        System.out.println("Muz kaç kilo ?");
        muz = input.nextDouble();
        System.out.println("Patlican kaç kilo ?");
        patlican = input.nextDouble();

        double result = (muz*muzFiyat) + (armut*armutFiyat) + (elma*elmaFiyat) + (patlican*patlicanFiyat) + (domates*domatesFiyat);
        System.out.println("Toplam tutar :" + result);
    }
}

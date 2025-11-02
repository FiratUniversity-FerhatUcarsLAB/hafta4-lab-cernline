/*
 * Ad Soyad: Ceren Çam
 * Ogrenci No: 250541073
 * Tarih: 03.11.2025
 * Aciklama: Gorev2 - Geometrik Hesaplayici
 * 
 * Bu program kullanicidan bir dairenin yaricapini alir,
 * daire ve küre ile ilgili matematiksel hesaplamalar yapar.
 */

 import java.util.Scanner;

 public class GeometrikHesap {
    public static void main(String[] args) {

        //Sabit tanimlama
        final double PI = 3.14159;
        
        //Scanner nesnesi olusturma
        Scanner input = new Scanner(System.in);

        //Degisken tanimlama
        //double yaricap;

        //Kullanicidan veri al
        System.out.println("=== Geometrik Hesaplayici ===");
        System.out.println("Dairenin yarıçapını giriniz (cm): ");
        double yaricap = input.nextDouble();

        //Hesaplamalar
        double daireAlani = PI * yaricap * yaricap;
        double daireCevresi = 2 * PI * yaricap;
        double daireCapi = 2 * yaricap;
        double kureHacmi = (4.0 / 3.0) * PI * yaricap * yaricap * yaricap;
        double kureYuzeyAlani = 4 * PI * yaricap * yaricap;

        //Sonuclari ekrana yazdir
        System.out.println();
        System.out.println("SONUCLAR:");
        System.out.println("----------");
        System.out.printf("Dairenin Alanı: %.2f cm²%n", daireAlani);
        System.out.printf("Dairenin Çevresi: %.2f cm%n", daireCevresi);
        System.out.printf("Dairenin Çapı: %.2f cm%n", daireCapi);
        System.out.printf("Kürenin Hacmi: %.2f cm³%n", kureHacmi);
        System.out.printf("Kürenin Yüzey Alanı: %.2f cm²%n", kureYuzeyAlani);
        
        // COZUM
        // Kullanıcıdan double tipinde yarıçap alınır.
        // PI sabiti final double PI = 3.141595 olarak tanımlanmıştır.
        // Daire: alan = PI * r * r, çevre = 2 * PI * r, çap = 2 * r.
        // Küre: hacim = (4.0/3.0) * PI * r * r * r, yüzey = 4 * PI * r * r.
        // Sonuçlar printf ile 2 ondalık basamak gösterilerek yazdırılır.

        //Scanner kapatma
        input.close();
    }
 }

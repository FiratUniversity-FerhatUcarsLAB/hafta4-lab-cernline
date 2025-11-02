/*
 * Ad Soyad: Ceren Çam
 * Ogrenci No: 250541073
 * Tarih: 02.11.2025
 * Aciklama: Gorev1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir
 * ve duzenli bir formatta ekrana yazdirir.
 */

 import java.util.Scanner;

 public class OgrenciBilgi {
    public static void main(String[] args) {

        // Scanner nesnesi olusturma
        Scanner input = new Scanner(System.in);

        //Degisken tanimlamalari
        //String ad, soyad;
        //int ogrenciNo, yas;
        //double gpa;

        //Kullanicidan bilgi alma
        System.out.println("=== Öğrenci Bilgi Sistemi ===");
        System.out.println();

        //Ad
        System.out.println("Adınızı giriniz: ");
        String ad = input.nextLine();

        //Soyad
        System.out.println("Soyadınızı giriniz: ");
        String soyad = input.nextLine();

        //Ogrenci No
        System.out.println("Öğrenci numaranızı giriniz: ");
        int ogrenciNo = input.nextInt();

        //Yas
        System.out.println("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        //GPA
        System.out.println("GPA'nızı giriniz: ");
        double gpa = input.nextDouble();

        //Bilgileri ekrana yazdırma
        System.out.println("=== Öğrenci Bilgi Sistemi ===");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Öğrenci No: " + ogrenciNo);
        System.out.println("Yaş: " + yas);
        System.out.println("GPA: " + gpa);
        String durum = (gpa >= 2.0) ? "Başarılı öğrenci" : "Başarısız öğrenci";
        System.out.println("Durum: " + durum);

        //Cozum
        // Scanner ile kullanıcıdan öğrenci bilgileri alınır.
        // Bilgiler String, int ve double değişkenlerinde saklanır.
        // Sonuçlar ekrana düzenli biçimde yazdırılır.
        // Program sonunda Scanner kapatılır.

        // Scanner kapatma
        input.close();
    }
 }

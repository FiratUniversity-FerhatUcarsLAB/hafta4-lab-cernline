/*
 * Ad Soyad: Ceren Çam
 * Ogrenci No: 250541073
 * Tarih: 06.11.2025
 * Aciklama: Gorev3 - Maas Hesaplama Sistemi
 * 
 * Bu program kullanicidan calisan bilgilerini alir ve
 * brut, kesintiler ve net maas degerlerini hesaplar.
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {

        // Sabit tanimlamalar
        final double SGK_ORANI = 0.14;       
        final double GELIR_VERGI_ORANI = 0.15; 
        final double DAMGA_VERGI_ORANI = 0.00759; 
        final double ORTALAMA_AY_SAAT = 160.0; 
        final int IS_GUNU = 22;
        final int IS_SAAT_GUN = 8;
        final int AYLIK_CALISMA_SAATI = IS_GUNU * IS_SAAT_GUN; 
        
        // Scanner nesnesi olusturma
        Scanner input = new Scanner(System.in);
        
        // Kullanici girdileri
        System.out.println("=== MAAS HESAPLAMA SISTEMI ===\n");

        System.out.print("Calisan adi soyadi: ");
        String calisan = input.nextLine().trim();

        double brutMaas = 0.0;
        while (true) {
            System.out.print("Brut maas (TL): ");
            if (input.hasNextDouble()) {
                brutMaas = input.nextDouble();
                input.nextLine();
                if (brutMaas >= 0) break;
                System.out.println("Maas negatif olamaz. Tekrar deneyin.");
            } else {
                System.out.println("Lutfen sayi girin.");
                input.nextLine();
            }
        }

        int haftalikSaat = 0;
        while (true) {
            System.out.print("Haftalik calisma saati: ");
            if (input.hasNextInt()) {
                haftalikSaat = input.nextInt();
                input.nextLine();
                if (haftalikSaat > 0) break;
                System.out.println("Saat sifirdan buyuk olmalidir.");
            } else {
                System.out.println("Lutfen tamsayi girin.");
                input.nextLine();
            }
        }

        int mesaiSaat = 0;
        while (true) {
            System.out.print("Mesai saati sayisi: ");
            if (input.hasNextInt()) {
                mesaiSaat = input.nextInt();
                input.nextLine();
                if (mesaiSaat >= 0) break;
                System.out.println("Mesai saati negatif olamaz.");
            } else {
                System.out.println("Lutfen tamsayi girin.");
                input.nextLine();
            }
        }

        // Hesaplamalar
        double mesaiUcreti = (brutMaas / ORTALAMA_AY_SAAT) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgkKesinti = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGI_ORANI;

        double toplamKesinti = sgkKesinti + gelirVergisi + damgaVergisi;
        double netMaas = toplamGelir - toplamKesinti;

        double kesintiOraniYuzde = (toplamKesinti / toplamGelir) * 100.0;
        double saatlikNetKazanc = netMaas / AYLIK_CALISMA_SAATI;
        double gunlukNetKazanc = netMaas / IS_GUNU;

        // Sistem tarihi alma
        java.util.Calendar cal = java.util.Calendar.getInstance();
        int gun = cal.get(java.util.Calendar.DAY_OF_MONTH);
        int ay = cal.get(java.util.Calendar.MONTH) + 1; // ay 0-11 arasi döner
        int yil = cal.get(java.util.Calendar.YEAR);
        String tarih = String.format("%02d/%02d/%04d", gun, ay, yil);

        //Bordro ciktisi
        System.out.println("\n====================================");
        System.out.println("         MAAS BORDROSU");
        System.out.println("====================================");
        System.out.printf("Calisan: %s%n", calisan);
        System.out.printf("Tarih: %s%n%n", tarih);

        System.out.println("GELIRLER:");
        System.out.printf("  Brut Maas              : %10.2f TL%n", brutMaas);
        System.out.printf("  Mesai Ucreti (%d saat) : %10.2f TL%n", mesaiSaat, mesaiUcreti);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM GELIR           : %10.2f TL%n%n", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("  SGK Kesintisi (%.1f%%)  : %10.2f TL%n", SGK_ORANI * 100, sgkKesinti);
        System.out.printf("  Gelir Vergisi (%.1f%%)  : %10.2f TL%n", GELIR_VERGI_ORANI * 100, gelirVergisi);
        System.out.printf("  Damga Vergisi (%.3f%%) : %10.2f TL%n", DAMGA_VERGI_ORANI * 100, damgaVergisi);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM KESINTI         : %10.2f TL%n%n", toplamKesinti);

        System.out.printf("NET MAAS                 : %10.2f TL%n%n", netMaas);

        System.out.println("ISTATISTIKLER:");
        System.out.printf("  Kesinti Orani          : %.1f%%%n", kesintiOraniYuzde);
        System.out.printf("  Saatlik Net Kazanc     : %.2f TL/saat%n", saatlikNetKazanc);
        System.out.printf("  Gunluk Net Kazanc      : %.2f TL/gun%n", gunlukNetKazanc);
        System.out.println("====================================");

        // COZUM
        // COZUM: Kullanıcıdan ad-soyad (String), brutMaas (double), haftalikSaat (int) ve mesaiSaat (int) alınır.
        // Mesai ücreti = (brutMaas / 160) * mesaiSaat * 1.5; toplamGelir = brutMaas + mesaiUcreti.
        // SGK, gelir vergisi ve damga vergisi toplam gelire uygulanır; netMaas = toplamGelir - toplamKesinti.
        // Saatlik ve günlük net kazançlar hesaplanıp printf ile belirtilen formatta iki ondalıklı gösterilir.

        // Scanner kapatma
        input.close();
    }
}

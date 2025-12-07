package com.mogur34;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// 1. HAZIRLIK AŞAMASI
        // Kullanıcıdan klavye girdisi almak için 'Scanner' aracını çağırıyoruz.
        // System.in -> Klavye (Input) demektir.
        Scanner scanner = new Scanner(System.in);

        // Rastgele sayı üretmek için 'Random' aracını çağırıyoruz.
        Random random = new Random();

        System.out.println("**********************************");
        System.out.println("--- SAYI TAHMİN OYUNUNA HOŞGELDİNİZ ---");
        System.out.println("1 ile 100 arasında bir sayı tuttum.");
        System.out.println("Bakalım kaçıncı denemede bulacaksın?");
        System.out.println("**********************************");

        // Bilgisayar 0 ile 99 arasında sayı üretir. +1 ekleyerek 1-100 yapıyoruz.
        int hedefSayi = random.nextInt(100) + 1;
        System.out.println("--- (Geliştirici İpucu: Cevap " + hedefSayi + ") ---"); // Bu satırı ekle71

        // Oyunun durumunu takip edeceğimiz değişkenler (Variables)
        int tahmin = 0; // Kullanıcının tahmini
        int denemeSayisi = 0; // Kaç kere denedi?
        boolean oyunBittiMi = false; // Oyun devam ediyor mu?

        // 2. OYUN DÖNGÜSÜ (LOOP)
        // oyunBittiMi 'false' olduğu sürece bu döngü (kod bloğu) tekrar eder.
        while (!oyunBittiMi) {

            System.out.print("Tahmininiz nedir? : ");
            // Kullanıcının girdiği tam sayıyı okuyup 'tahmin' kutusuna atıyoruz.
            tahmin = scanner.nextInt();

            // Her tahminde deneme sayısını 1 arttırıyoruz.
            denemeSayisi++;

            // 3. KARAR YAPILARI (IF-ELSE)
            // Bilgisayarın tuttuğu sayı ile tahmini karşılaştırıyoruz.
            if (tahmin == hedefSayi) {
                System.out.println("Tebrikler! Doğru bildiniz.");
                System.out.println("Toplam Deneme: " + denemeSayisi);
                oyunBittiMi = true; // Döngüyü kırmak için durumu değiştiriyoruz.
            }
            else if (tahmin > hedefSayi) {
                System.out.println("Daha KÜÇÜK bir sayı söylemelisin.");
            }
            else {
                System.out.println("Daha BÜYÜK bir sayı söylemelisin.");
            }
            // Döngü sonu, başa döner.
        }

        // Kaynakları serbest bırakmak iyi bir alışkanlıktır.
        scanner.close();


    }
}
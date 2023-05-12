
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayiyi Giriniz: ");
        int sayi = input.nextInt();
        System.out.print("Basamak Sayisi: ");
        int basamak_sayisi = input.nextInt();
        
        int gecici_sayi = sayi;
        int toplam = 0;
        
        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;
            
            toplam += Math.pow(basamak_degeri,basamak_sayisi);
            
        }while(gecici_sayi > 0);
        
        if (sayi == toplam) {
            
            System.out.println("Bu sayi bir armstrong sayisidir...");
        }
        else {
            System.out.println("Bu sayi bir armstrong sayisi degildir...");
        }
    }
}

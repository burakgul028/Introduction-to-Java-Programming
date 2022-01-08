package javaclass;

import java.util.Scanner;

public class homeworkexercises1 {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("0 ve 1000 arasında bir sayı giriniz :");
        int sayi;
        sayi = input.nextInt();
        int kalan1 = sayi % 10;
        int bolum1 = sayi / 10;
        int kalan2 = bolum1 % 10;
        int bolum2 = bolum1 / 10;
        int toplam = kalan1 + kalan2 + bolum2;
        
        System.out.println("Rakamların toplamı :" + toplam);
}
       
}


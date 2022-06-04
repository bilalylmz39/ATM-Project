package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

int bakiye = 1000 , input,miktar;

        System.out.println("Merhabalar bankamıza hoşgeldiniz");
        System.out.println("güncel bakiyeniz: " + bakiye + "TL");

        while(true) {
            System.out.println();
            System.out.println("1-)Para Yatır") ;
            System.out.println("2-)Para Çek");
            System.out.println("3-)Bakiye Sorgula ");
            System.out.println("4-)Çıkış Yap");
            System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
            input = scan.nextInt();

            if (input==1) {
                System.out.println("yatırmak istediğiniz miktar");
                miktar = scan.nextInt();
                bakiye += miktar;

            }else if (input==2) {
                System.out.println("çekmek istediğiniz miktar");
                miktar = scan.nextInt();

                        if(miktar > bakiye) {
                            System.out.println("Yetersiz bakiye !!");
                        }else {
                            bakiye -= miktar;
                        }
            }else if (input==3) {
                System.out.println("güncel bakiyeniz" + bakiye + "TL");
            }else if (input == 4) {
                System.out.println("Çıkış yapılıyor...");
                break;
            }else {
                System.out.println("Geçersiz işlem ");
            }






        }

    }
}

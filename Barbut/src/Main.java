import java.util.Scanner;  //kullanıcıdan veri alabilmek için bu kütüphaneyi çağırıyoruz.
import java.util.Random;   //rastgele sayı üretebilmek için bu kütüphaneyi çağırdık.

public class Main {

    public static void main(String[] args) {
    Random a=new Random();   //rastgele sayılar üretip üretilen sayıları a isimli değişkene atıyoruz.
    Scanner giris =new Scanner(System.in);

    int zar1=a.nextInt(1,7);    // ilk zarımız 1 dahil 6 ya kadar (6 dahil) a ya atadığımız rastgele sayıları zar1 isimli değişkene atıyoruz.
    int zar2=a.nextInt(1,7);    // ikinci zarımız 1 dahil 6 ya kadar (6 dahil) a ya atadığımız rastgele sayıları zar2 isimli değişkene atıyoruz.


        System.out.println("Zarlar atiliyor....");       //zarların atıldığına dair kullanıcıya çıktı veriyoruz.
        System.out.println("Oyuncunun attigi zar= "+zar1+"+"+zar2+"="+(zar1+zar2));   //oyuncunun attığı zarları ve zarların toplamını çıktı olarak veriyoruz.


        zar_at(zar1,zar2);   // zar_at isimli metodumuzu çağırıyoruz.
    }
    public static void zar_at(int zar1,int zar2){     //zar_at isimli metod oluşturduk.

        if ( zar1+zar2==7 || zar1+zar2==11){    //iki zarın toplamı 7 veya 11 e eşit ise bu blok çalışacaktır.
            System.out.println("Oyuncu Kazandi!");   //kullanıcıya oyunu kazandığına dair çıktı verilir.

        }
        else if (zar1+zar2==2 || zar1+zar2==3 ||zar1+zar2==12){   // eğer iki zarın toplamı 2 veya 3 veya 12 olursa bu blok çalışacaktır.
            System.out.println("BARBUT....");       //kullanıcıya barbut olduğu gösteren çıktı veriyoruz.
            System.out.println("KAYBETTINIZ....");  //kullanıcıya kaybettiğini gösteren çıktı veriyoruz.

        }
        else {      //eğer yukarıda ki iki koşul da sağlanmaz ise bu blok çalışacaktır.
            int puan1 = zar1 + zar2;     //zar1 ve zar2 ye atanan sayıları toplayıp puan1 isimli değişkene atadık.
            int puan2=0;                 //puan2 isimli tam sayı bir değişken oluşturup 0 değerini atadık.
            System.out.println("Oyuncunun puani:" + puan1);   //kullanıcıya puanı gösteren çıktı veriyoruz.
            while (puan2 != 7){     //eğer puan2 değişkeni 7 ye eşit değil ise bu blok çalışacaktır.
                Random a=new Random();
                int zar3=a.nextInt(1,7);   //zarımız 1 dahil 6 ya kadar (6 dahil) a ya atadığımız rastgele sayıları zar3 isimli değişkene atıyoruz.
                int zar4=a.nextInt(1,7);   //zarımız 1 dahil 6 ya kadar (6 dahil) a ya atadığımız rastgele sayıları zar4 isimli değişkene atıyoruz.
                puan2= zar3 + zar4;     //zar3 ve zar4 e atadığımız sayıların toplamını puan2 isimli değişkene atıyoruz.
                System.out.println("Oyuncunun attigi zar= "+zar3+"+"+zar4+"="+(zar3+zar4));   //kullanıcıya atılan zarları ve zarların toplamını gösteren çıktı veriyoruz.
                System.out.println("Oyuncunun puani:" + puan2);    //oyuncunun puanını gösteren çıktı veriyoruz.
                if (puan2 == puan1){     //eğer puan2 puan1 e eşit ise bu blok çalışacak.
                    System.out.println("KAZANDINIZ...");    //kullanıcıya kazandığına dair çıktı veriyoruz.
                    break;    //döngüyü sonlandırıyoruz.
                }
            }
            if (puan2 == 7){    //eğer puan2 miz 7 ye eşit ise bu blok çalışacaktır.
                System.out.println("KAYBETTINIZ...");   //kullanıcıya kaybettiğine dair çıktı veriyoruz.
            }
        }
    }
}











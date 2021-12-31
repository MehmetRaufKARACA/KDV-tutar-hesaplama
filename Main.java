import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Değişkenleri tanımla
        double fiyat, kdv, kdv_li_fiyat, kdvOran;

        // Scanner sınıfını tanımla

        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan para değeri al

        System.out.print("Para meblağını giriniz : ");
        fiyat = inp.nextInt();

        kdvOran = (fiyat > 1000) ? 0.08 : 0.18;

        // Kdv'li fiyatı ve kdv tutarını hesapla
        kdv_li_fiyat = fiyat + (double) (fiyat * kdvOran);
        kdv = fiyat * kdvOran;

        System.out.println("KDV'siz fiyat : " + fiyat);
        System.out.println("KDV'li fiyat : " + kdv_li_fiyat);
        System.out.println("KDV tutarı : " + kdv);




        


    }
}
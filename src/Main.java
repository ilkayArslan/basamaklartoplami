import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int girilenSayi,basamakayisi,toplam=0;
        System.out.print("Bir sayı giriniz : ");
        girilenSayi = input.nextInt();
        while (girilenSayi!=0){
            basamakayisi = girilenSayi%10;
            toplam+=basamakayisi;
            girilenSayi/=10;
        }
        System.out.println(toplam);
    }
}
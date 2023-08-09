import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int dogumYili;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        dogumYili = input.nextInt();

        if (dogumYili % 12 == 0) {
            System.out.print("Zodyağınız Maymun");
        } else if (dogumYili % 12 == 1) {
            System.out.print("Zodyağınız Horoz");
        } else if (dogumYili % 12 == 2) {
            System.out.print("Zodyağınız Köpek");
        } else if (dogumYili % 12 == 3) {
            System.out.print("Zodyağınız Domuz");
        } else if (dogumYili % 12 == 4) {
            System.out.print("Zodyağınız Fare");
        } else if (dogumYili % 12 == 5) {
            System.out.print("Zodyağınız Öküz");
        } else if (dogumYili % 12 == 6) {
            System.out.print("Zodyağınız Kaplan");
        } else if (dogumYili % 12 == 7) {
            System.out.print("Zodyağınız Tavşan");
        } else if (dogumYili % 12 == 8) {
            System.out.print("Zodyağınız Ejderha");
        } else if (dogumYili % 12 == 9) {
            System.out.print("Zodyağınız Yılan");
        } else if (dogumYili % 12 == 10) {
            System.out.print("Zodyağınız At");
        } else if (dogumYili % 12 == 11) {
            System.out.print("Zodyağınız Koyun");
        }
    }
}
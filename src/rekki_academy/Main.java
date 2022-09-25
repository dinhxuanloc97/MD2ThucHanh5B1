package rekki_academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban muon biet thang may co bao nhieu ngay");
        int month = scanner.nextInt();
        switch (month){
            case 2 :
                System.out.println("Thang"+month+"co 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" Thang"+month+"thang co 31 ngay ");
                break;
            case 4 :
            case 6:
            case 9:
            case 11:
                System.out.println("Thang"+month+"thanng co 30 ngay ");
                break;
            default:
                System.out.println("khong co thang nao ak");
        }
    }
}
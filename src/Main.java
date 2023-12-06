import java.util.Scanner;

public class Main {
    static int prime(int number, int i){
        if (i==1){
            return 1;
        }
        if (number%i==0){
            return 0;
        }
        return prime(number, i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,prm;
        System.out.print("Sayı Giriniz : ");
        num = sc.nextInt();
        prm=prime(num,num/2);
        if (prm == 1){
            System.out.println(num+" sayısı ASALDIR!");
        }else {
            System.out.println(num+" sayısı ASAL DEĞİLDİR!");
        }

    }
}
import java.util.Scanner;

public class Sayilar {
    public static void main(String[] args) {
        int x, y=0;
        Scanner inp=new Scanner(System.in);


       do {
           System.out.print("Bir Sayi Giriniz:");
           x=inp.nextInt();
           if (x%4==0){
               y=y+x;
           }


       }while (x%2==0);
        System.out.println(y);











}}

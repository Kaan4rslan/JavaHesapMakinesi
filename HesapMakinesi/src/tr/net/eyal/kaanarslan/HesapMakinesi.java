package tr.net.eyal.kaanarslan;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("birinci sayiyi giriniz: ");
            int s1 = input.nextInt();

            System.out.println("Ikinci sayiyi giriniz: ");
            int s2 = input.nextInt();

            System.out.println("Hangi islemi yapmak istiyorsunuz? (+) (-) (*) (/)");
            String islem = input.next();


            switch (islem) {
                case "+":
                    System.out.println(s1+s2);
                    break;

                case "-":
                    System.out.println(s1-s2);
                    break;

                case "*":
                    System.out.println(s1*s2);
                    break;

                case "/":
                    System.out.println(s1/s2);
                    break;

                default:
                    System.out.println("Bu islem bulunamadi");



            }

        }


    }
}
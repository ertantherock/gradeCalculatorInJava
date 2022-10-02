import java.util.Scanner;
//util = library
//Scanner = Class
// This program calculates grades for lessons(basicly
//@author Ertan Kaya.

public class Main {
    public static void main(String[] args) {
        //create variables
        int math, fizik, kimya, turkce, tarih, muzik;
        double divide;
        double total;

        //Scanner class defined in our main class.
        Scanner input = new Scanner(System.in);

        //Get inputs for each lesson from user
        System.out.print("Matematik notunuzu giriniz: ");
        math = input.nextInt();
        System.out.println("Matematik notunuz: " + math);

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.println("Fizik notunuz: " + fizik);

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println("Kimya notunuz: " + kimya);

        System.out.print("Turkce notunu giriniz: ");
        turkce = input.nextInt();
        System.out.println("Turkce notunuz: " + turkce);

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.println("Tarih notunuz: " + tarih);

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();
        System.out.println("Muzik notunuz: " + muzik);

        total = math + turkce + fizik + kimya + tarih + muzik;

        System.out.println("Ortalamanız: " + total/6);

    }
}

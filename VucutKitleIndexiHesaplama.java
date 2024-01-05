import java.util.Scanner;

public class VucutKitleIndexiHesaplama {

    public static void main (String[]args){

        int kilo;
        double boy, index;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu(metre cinsinden) giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Kilo giriniz: ");
        kilo = inp.nextInt();

        index = kilo /(boy * boy);

        System.out.print("Vücut Kitle İndexiniz:  " + index);
    }
}


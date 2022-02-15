import java.util.Scanner;

public class DaireDilimi {
    public static void main(String[] args){
        double pi = 3.14;
        double r, aci;

        Scanner inp = new Scanner(System.in);
        System.out.print(" yarıcapı giriniz :");
        r = inp.nextDouble();
        System.out.print("acıyı giriniz:");
        aci = inp.nextDouble();

        double alan = (pi * (r*r)* aci) / 360;
        System.out.print("Sonuc :");
        System.out.println(alan);
    }
}

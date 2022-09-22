package Latihan;

/*
 * Created_By_21343019_Arafil Azmi
 */

import java.util.Scanner;

public class Scanner1 {
    public static void main(String args[]) {

        Scanner In = new Scanner(System.in);
        System.out.print("Masukan nama lengkap : ");
        String nama = In.nextLine();

        System.out.print("Masukan nama NIM : ");
        int NIM = In.nextInt();

        System.out.print("Masukan Nilai : ");
        float nilai = In.nextFloat();

        System.out.println( "\nNama    : "  + nama +
                            "\nNIM     : " + NIM + 
                            "\nNilai   : " + nilai);
    }
}

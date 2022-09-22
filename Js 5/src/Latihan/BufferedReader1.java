package Latihan;

/*
 * Created_By_21343019_Arafil Azmi
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));

        String a,b;
        float angka1, angka2, jumlah;
        System.out.println("Program Penjumlahan Dua Buah Bilangan");

        try {
            System.out.print("Masukan angka pertama : ");
            a = dataIn.readLine();
            /*Data yang akan diproses aritmatika harus dikonversikan dulu 
             * dari tipe data String ke tipe data angka yang diperlukan.
             * Data yang diperoleh dari inputan kelas BufferedRead tipe datanya string*/

             angka1= Float.parseFloat(a); //konversi dari String ke Float

             System.out.print("Masukan angka kedua : ");
             b = dataIn.readLine();
             angka2 = Float.parseFloat(b); // Konversi dari String ke Float

             jumlah = angka1 + angka2;
             System.out.println("jumlah : " + jumlah);
        }

        catch (IOException E){
            System.out.println("Gagal membaca keyboard");
        }
    }
}

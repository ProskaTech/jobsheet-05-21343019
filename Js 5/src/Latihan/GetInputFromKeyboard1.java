package Latihan;

/*
 * Created_By_21343019_Arafil Azmi
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));

        String name = " ", hoby = " " ;


        try{
            System.out.print(" Nama Anda : ");
            name = dataIn.readLine();
            System.out.print(" Hobi Anda : ");
            hoby = dataIn.readLine();
        }

        catch(IOException e){
            System.out.println("Gagal membaca keyboard");
        }

        System.out.println("Jadi Hobi Anda " + hoby+ ".Hobi yang bagus " + name);
    }
}

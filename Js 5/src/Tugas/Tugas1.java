package Tugas;

/*
 * Created_By_21343019_Arafil Azmi
 */

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);
        BufferedReader datamasuk = new BufferedReader(new InputStreamReader(System.in));

        String word1, word2, word3 = " ";

        System.out.print("Enter Word 1 : ");
        word1 = masuk.nextLine();

        System.out.print("Enter Word 2 : ");
        word2 = masuk.nextLine();

        try{
            System.out.print("Enter Word 3 : ");
            word3 = datamasuk.readLine();
        }

        catch(IOException e){
            System.out.println("Gagal membaca Keyboard");
        }

        finally {
            masuk.close();
        }

        System.out.println("\n\nData Yang Diinputkan Adalah : ");
        System.out.println("Enter word 1 : " +word1);
        System.out.println("Enter word 2 : " +word2);
        System.out.println("Enter word 3 : " +word3);
        System.out.println(word1 +" " + word2 + " " + word3);

    }
}

## Created_by_21343019_Arafil Azmi
1. Pada JS 5 ini kita diperkenalkan dengan Kelas Scanner, Kelas Bufferedreader dan Kelas JOptionpPane yang dimana ketiga kelas tersebut untuk bisa mendapatkan input      dari Keyboard untuk Scanner dan BufferedReader melalui layar console atau layar software pembuat program sedangkan JOptionPane melalui layar GUI yang menggunakan      bahasa pemrograman Java.

2. Untuk bisa menggunakan kelas tersebut kita harus mengimportnya terlebih dahulu kedalam program yaitu dengan cara :
      1. Untuk Kelas Scanner berada pada paket java.util maka cara importnya adalah import java.util.Scanner;
      2. Untuk Kelas Bufferedreader cara importnya terdapat 3 buah dengan cara sebagai berikut : 
             a. import java.io.BufferedReader;
             b. import java.io.InputStreamReader;
             c. import java.io.IOException;
      3. Untuk Kelas JOptionPane cara importnya adalah import Javax.swing.JOptionPane; atau bisa ditulis dengan import javax.swing.*;

3. Untuk pendeklarasian setiap kelas juga berbeda - beda terdiri dari :
      1. Untuk Kelas Scanner deklarasinya Scanner BacaInput = new Scanner(System.in);
      2. Untuk Kelas BufferedReader deklarasinya BufferedReader DataMasuk = new BufferedReader (new InputStreamReader(System.in));
      3. Untuk Kelas JOptionPane deklarasinya Nama = JOptionPane.showInputDialog("Silahkan Masukan Nama Anda"); deklarasi ini membuat sebuah input dialog yang akan                menampilkan sebuah dialog pesan,sebuah textfile dan tombol OK dan hasil dari dialog tersebut adalah string dan disimpan dalam variabel Nama.

4. Untuk Kelas Scanner mempunyai method yang berbeda untuk membaca tipe data yang diinputkan melalui keyboard yaitu dengan next(tipedata)() contohnya untuk tipe data
   String dia menggunakan nextLine(); dan untuk tipedata int dia menggunakan nextInt(); dan sebagainya.
   Untuk Kelas BufferedReader method untuk membaca inputan dari keyboardnya dengan menggunakan read(); atau readLine(); contohnya untuk tipe data String dia
   menggunakan readLine();.

5. Perbedaan dari ketiga kelas tersebut yaitu :
      1. Untuk Kelas Scanner ketika ada perhitungan matematika maka variabel yang digunakan tidak perlu di konversikan bisa langsung dihitung.
      2. Untuk Kelas BufferedReader ketika ada perhitungan matematika mava variabel perlu dikonversikan sebelum dihitung.
      3. JOptionPane merupakan kelas yang digunakan untuk input dan output data berbasis GUI swing yaitu tampilan berupa dialog box.
 
6. Untuk latihan 1 dan latihan 2 merupakan contoh penggunaan Kelas Scanner yang sebelum digunakan masing - masing program melakukan import sebelum digunakan yang          membedakan dari kedua program tersebut yaitu :
      1. Untuk latihan 1 terdapat beberapa tipe data yaitu String, Int dan Float. Untuk membaca tipe data String menggunakan nextLine();, Int menggunakan nextInt();  
         dan Float menggunakan nextFloat();.
      2. Untuk latihan 2 terdapat variabel dengan tipe data float lalu membaca tipe data tersebut dan setelah itu dihitung atau bisa dibilang program ini adalah 
         Program perhitungan menggunakan Kelas Scanner.
         
7. Untuk latihan 3 dan 4 merupakan contoh penggunaan Kelas BufferedReader yang sama dengan halnya latihan 1 dan 2 sebelum digunakan program melakukan import yang 
   membedakan dari kedua program tersebut yaitu :
      1. Untuk latihan 3 merupakan program untuk membaca tipe data String dengan Kelas BufferedReader dan untuk membacanya dengan menggunakan readLine(); didalam try{}
         dan untuk catch (IOExeption e) {} IOException adalah untuk membaca apakah inputan itu error atau tidak jika terjadi erorr maka akan dieksekusi ke method yang          bersangkutan.
      2. Untuk latihan 4 merupakan program untuk menghitung dan membaca tipe data float atau angka pada Kelas BufferedReader, untuk KelasBufferedReader dalam proses  
         perhitungan maka perlu di konversikan terlebih dahulu dari String menjadi tipe data yang diinginkan contoh tipe data float maka cara mengkonversinya 
         menggunakan Float.parseFloat(nama_variabel) selajutnya baru bisa dihitung.

8. Untuk latihan 5 merupakan contoh penggunaan Kelas JOptionPane dimana terdapat tipe data String dengan variabel name dan hoby.
   serta untuk menampilkan dialog box nya dengan menggunakan (nama_variabel) = JOptionPane.showInputDialog(); dan untuk mencetak dalam layar program kita harus membuat    variabel baru dengan isi dari variabel tersebut adalah isi dari variabel yang sudah disimpan dari mengetik dalam Dialog serta untuk menampilkan dengan GUI dengan 
   menggunakan JOptionPane.showMessageDialog(null,(nama_variabel)); dan untuk ke layar program pada java menggunakan system.out.print atau println.

9. Untuk tugas 1 kita diminta untuk menggunakan 2 kelas yaitu kelas Scanner dan kelas BufferedReader dengan tampilan output yang sudah ditentukan atau bisa dibilang 
   menggabungkan kedua kelas maka caranya kita bisa menggabungkan kedua importan dari kelas Scanner dan Buffered Reader lalu buat deklarasi untuk masing - masing kelas 
   lalu buatlah sebuah variabel dengan tipe data String kita bisa menggunakan Kelas Scanner terlebih dahulu atau Kelas BufferedReader yang pada intinya pada saat 
   membaca tipe data Kelas Scanner menggunakan nextLine(); dan Kelas BufferedReader menggunakan readLine(); lalu setelah itu kita bisa mencetak dengan menggunakan 
   system.out.print atau println dan masukan nilai variabel tersebut untuk dicetak.
   
10. Untuk tugas 2 kita diminta menampilkan input dan output menggunakan JOptionPane seperti pada contoh latihan 5 kita harus mengimport JOptionPane terlebih dahulu
    lalu kita membuat variabel dengan tipe data String setelah itu gunakan showInputDialog(); untuk bisa menampilkan dialog box pada masing - masing variabel.
    Setelah itu kita buat variabel baru yang isinya adalah isi dari variabel pada dialog box kemudian kita bisa tampilkan dengan menggunakan showMessageDialog(null, 
    (nama_variabel)) pada program kita menggunakan nama msg maka JOptionPane.showMessageDialog(null, msg); maka program sudah sesuai dengan output yang diminta.
    
    
